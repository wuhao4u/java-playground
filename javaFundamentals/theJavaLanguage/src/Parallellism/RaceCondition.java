package Parallellism;

public class RaceCondition {
    static void singleThread() throws InterruptedException {
        LongWrapper longWrapper = new LongWrapper(0L);
        Runnable r = () -> {
            for (int i = 0; i < 1_000; ++i) {
                longWrapper.incrementValue();
            }
        };

        Thread t = new Thread(r);
        t.start();
        t.join();
        System.out.println(longWrapper.getValue());
    }

    static void multipleThreads() throws InterruptedException {
        LongWrapper longWrapper = new LongWrapper(0L);
        Runnable r = () -> {
            for (int i = 0; i < 1_000; ++i) {
                longWrapper.incrementValue();
            }
        };

//        Thread t = new Thread(r);
        Thread[] threads = new Thread[1_000];

        for (int i = 0; i < threads.length; ++i) {
            threads[i] = new Thread(r);
            threads[i].start();
        }

        for (int j = 0; j < threads.length; ++j) {
            threads[j].join();
        }

        System.out.println(longWrapper.getValue());
    }

    public static void main(String[] args) {
        try {
            singleThread();
            multipleThreads();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
