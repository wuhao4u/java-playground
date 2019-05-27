package Parallellism;

public class LongWrapper {
    private long l;
    private Object key = new Object();

    public LongWrapper(long l) {
        this.l = l;
    }

    public long getValue() {
        return l;
    }

    // can lock the instance
//    public synchronized void incrementValue() {
//        ++l;
//    }
    public void incrementValue() {
        synchronized (key) {
            ++l;
        }
    }
}
