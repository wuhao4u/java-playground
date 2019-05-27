package Parallellism;

public class RunningDeadLockExampleA {

    public static void main(String[] args) throws InterruptedException {
        DeadLockExampleA a = new DeadLockExampleA();

        Runnable r1 = () -> a.a();
        Runnable r2 = () -> a.b();

        Thread t1 = new Thread(r1);
        t1.start();

        Thread t2 = new Thread(r2);
        t2.start();

        t1.join();
        t2.join();

//        Thread t1 = new Thread(r1);
//        t1.start();
//        t1.join();
    }
}
