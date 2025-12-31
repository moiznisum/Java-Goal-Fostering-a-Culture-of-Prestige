public class ObjectReuseExample {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 1000; i++) {
            builder.setLength(0); // reuse object
            builder.append("Iteration ").append(i);
            System.out.println(builder);
        }
    }
}
