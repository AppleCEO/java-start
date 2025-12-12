package scanner.example;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("음식 이름을 입력해주세요: ");
        String name = sc.nextLine();
        System.out.print("음식의 가격을 입력해주세요: ");
        int price = sc.nextInt();
        System.out.print("음식의 수량을 입력해주세요: ");
        int amount = sc.nextInt();
        System.out.println(name + "을(를) " + amount + "개를 주문하셨습니다. 총 가격은 " + price * amount + "원입니다.");
    }
}
