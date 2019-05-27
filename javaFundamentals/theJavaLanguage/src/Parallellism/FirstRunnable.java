package Parallellism;

public class FirstRunnable {

    public static void main(String[] args) {
        Runnable runnable = () -> {
          System.out.println("I'm running in " + Thread.currentThread().getName());
        };

        Thread t = new Thread(runnable);
//        t.start();
        t.run(); // Wrong

        try {
            t.join(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
