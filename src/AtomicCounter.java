import java.util.concurrent.atomic.AtomicLong;

/**
 * Thread-safe implementation that uses Java Atomic classes.
 */
public class AtomicCounter implements Counter {
    private AtomicLong count = new AtomicLong(0L);

    @Override
    public long getCount() {
        return count.get();
    }

    @Override
    public void increment() {
        count.incrementAndGet();
    }
}
