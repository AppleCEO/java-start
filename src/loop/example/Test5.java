package loop.example;

public class Test5 {
    public static void main(String[] args) {
        int linesCount = 3;

        for (int i = 1; i <= linesCount; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
