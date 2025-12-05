package loop.example;

public class Test2 {
    public static void main(String[] args) {
        int num = 1;
        int count = 10;

        while (num <= count) {
            System.out.println(num * 2);
            num++;
        }

        for (num = 1; num <= count; num++) {
            System.out.println(num * 2);
        }
    }
}
