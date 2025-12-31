public class SynchronizedExample {

    private static int count = 0;

    private static synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> repeatIncrement());
        Thread t2 = new Thread(() -> repeatIncrement());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + count);
    }

    private static void repeatIncrement() {
        for (int i = 0; i < 1000; i++) {
            increment();
        }
    }
}
