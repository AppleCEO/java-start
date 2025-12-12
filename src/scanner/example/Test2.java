package scanner.example;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("하나의 정수를 입력하세요:");
        int num = sc.nextInt();
        String isOdd = (num % 2 == 1) ? "홀수" : "짝수";
        System.out.println("입력한 숫자 " + num + "은(는) " + isOdd + "입니다.");
    }
}
