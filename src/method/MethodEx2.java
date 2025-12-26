package method;

public class MethodEx2 {
    public static void main(String[] args) {
        printForCount(3);
        printForCount(5);
        printForCount(7);
    }

    public static void printForCount(int count) {
        String message = "Hello, world!";
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
