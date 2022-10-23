/**
 * Thread-safe implementation that uses 'synchronized' modifier.
 */
public class SynchronizedCounter implements Counter {
    private long count = 0;

    @Override
    synchronized public long getCount() {
        return count;
    }

    @Override
    synchronized public void increment() {
        count++;
    }
}
