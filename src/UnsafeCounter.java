/**
 * Non-thread-safe implementation.
 */
public class UnsafeCounter implements Counter {
    private long count = 0;

    @Override
    public long getCount() {
        return count;
    }

    @Override
    public void increment() {
        count++;
    }
}
