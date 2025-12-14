package scanner.example;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        int totalPrice = 0;
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int choice = sc.nextInt();

            if (choice == 1) {
                int price = inputProduct(sc);
                totalPrice += price;
            } else if (choice == 2) {
                System.out.println("총 비용: " + totalPrice);
                totalPrice = 0;
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }

    private static int inputProduct(Scanner sc) {
        System.out.print("상품명을 입력하세요: ");
        String name = sc.next();
        System.out.print("상품의 가격을 입력하세요: ");
        int price = sc.nextInt();
        System.out.print("구매 수량을 입력하세요: ");
        int amount = sc.nextInt();
        System.out.println("상품명:" + name + " 가격:" + price + " 수량:" + amount + " 합계:" + price * amount);
        return price * amount;
    }
}
