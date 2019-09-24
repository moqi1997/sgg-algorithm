package ch03.Concurrent;

public class VolatileExample {
    volatile long v1 = 0L;
    public void set(Long l) {
        v1 = l;
    }
    public void getAndIncrement() {
        v1++;
    }
    public long get() {
        return v1;
    }

}

