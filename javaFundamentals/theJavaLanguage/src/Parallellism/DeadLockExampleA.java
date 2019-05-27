package Parallellism;

public class DeadLockExampleA {

    private Object key1 = new Object();
    private Object key2 = new Object();

    public void a() {
        synchronized (key1) {
            System.out.println(Thread.currentThread().getName() + ": I'm in a()");
            b();
        }
        System.out.println(Thread.currentThread().getName() + ": a() released key1");
    }

    public void b() {
        synchronized (key2) {
            System.out.println(Thread.currentThread().getName() + ": I'm in b()");
            c();
        }
        System.out.println(Thread.currentThread().getName() + ": b() released key2");
    }

    public void c() {
         synchronized (key1) {
            System.out.println(Thread.currentThread().getName() + ": I'm in c()");
        }
        System.out.println(Thread.currentThread().getName() + ": c() released key1");
    }
}
