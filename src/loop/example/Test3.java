package loop.example;

public class Test3 {
    public static void main(String[] args) {
        int num = 1;
        int max = 100;
        int sum = 0;
        while (num <= max) {
            sum += num;
            num++;
        }
        System.out.println(sum);

        for (num = 1, sum = 0; num <= max; num++) {
            sum += num;
        }
        System.out.println(sum);
    }
}
