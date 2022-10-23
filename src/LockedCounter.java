import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Thread-safe implementation that uses ReadWriteLock.
 */
public class LockedCounter implements Counter {
    private long count = 0;
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    @Override
    public long getCount() {
        try {
            lock.readLock().lock();
            return count;
        } finally {
            lock.readLock().unlock();
        }
    }

    @Override
    public void increment() {
        try {
            lock.writeLock().lock();
            count++;
        } finally {
            lock.writeLock().unlock();
        }
    }
}
