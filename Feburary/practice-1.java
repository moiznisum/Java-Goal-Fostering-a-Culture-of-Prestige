public class ThreadCreationExample {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            System.out.println("Running in thread: " + Thread.currentThread().getName());
        });

        thread1.start();
    }
}
