package concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class profiler implements Lock{
    private final Sync sync = new Sync();
    @Override
    public void lock() {
        sync.acquire(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return sync.tryAcquire(1);
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {

    }

    @Override
    public Condition newCondition() {
        return null;
    }

    private static class Sync extends AbstractQueuedSynchronizer {
       //是否处于占用状态
       @Override
       protected boolean isHeldExclusively() {
           return getState() == 1;
       }
       //当前状态为0的时候获取锁
       @Override
       public boolean tryAcquire(int acquires) {
           if (compareAndSetState(0, 1)) {
               setExclusiveOwnerThread(Thread.currentThread());
               return true;
           }
           return false;
       }
       //释放锁，将状态设置为0
       @Override
       protected boolean tryRelease(int r) {
           if (getState() == 0) {
               throw new IllegalMonitorStateException();
           }
           setExclusiveOwnerThread(null);
           setState(0);
           return true;
       }
       Condition newCondition() {
           return new ConditionObject();
       }
   }
}
