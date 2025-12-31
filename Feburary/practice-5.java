import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

    private static int count = 0;
    private static final ReentrantLock lock = new ReentrantLock();

    public static void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }
}
