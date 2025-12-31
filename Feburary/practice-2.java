public class RaceConditionExample {

    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(RaceConditionExample::increment);
        Thread t2 = new Thread(RaceConditionExample::increment);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + count);
    }

    private static void increment() {
        for (int i = 0; i < 1000; i++) {
            count++; // not thread-safe
        }
    }
}
