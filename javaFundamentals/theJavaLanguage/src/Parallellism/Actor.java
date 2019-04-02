package Parallellism;


/**
 * https://yeahbutactually.blogspot.com/2011/08/happy-multi-threading.html
 * Ozgur Tumer
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public abstract class Actor<T> {
    private final ExecutorService messageQ = Executors.newSingleThreadExecutor();

    /**
     * Send a message to the actor. Returns null or a RuntimeException if an exception
     * occurred during processing.
     */
    public Future<RuntimeException> send(final T message) {
        return messageQ.submit(new Callable<RuntimeException>() {
            @Override
            public RuntimeException call() {
                try {
                    onMessage(message);
                    return null;
                } catch (Throwable t) {
                    return new RuntimeException("Actor threw an exception during message processing", t);
                }
            }
        });
    }

    /**
     * Send a message to the actor.
     */
    public void sendAndWait(final T message) throws RuntimeException {
        RuntimeException exc = null;
        try {
            Future<RuntimeException> send = send(message);
            exc = send.get();
        } catch (InterruptedException e) {
            throw new RuntimeException("Interrupted Exception: " + e, e);
        } catch (ExecutionException e) {
            throw new RuntimeException("Execution Exception: " + e, e);
        }
        if (exc != null) {
            throw exc;
        }
    }

    /**

     * typical implementation of the onMessage method should use a pattern matcher to determine the
     * type of the message and act on it. Java unfortunately does not support type based pattern matching built in.
     * Command pattern is your friend.
     */
    protected abstract void onMessage(T msg) throws Exception;
}
