package loop.example;

public class Test1 {
    public static void main(String[] args) {
        int count = 10;
        int index = 1;
        while (index <= count) {
            System.out.println(index);
            index++;
        }

        for (int i = 1; i <= count; i++) {
            System.out.println(i);
        }
    }
}
