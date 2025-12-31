public class HeapVsStackExample {

    public static void main(String[] args) {
        int localVariable = 10; // Stored on stack

        User user = new User("Moiz"); // Object stored on heap
        System.out.println(user.getName());
    }
}

class User {
    private String name;

    User(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
