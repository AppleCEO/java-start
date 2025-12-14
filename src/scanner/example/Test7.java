package scanner.example;

import java.util.Objects;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        String name;
        int age;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료) : ");
            name = sc.nextLine();
            if (Objects.equals(name, "종료")) {
                break;
            }
            System.out.print("나이를 입력하세요: ");
            age = sc.nextInt();
            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
