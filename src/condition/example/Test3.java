package condition.example;

public class Test3 {
    public static void main(String[] args) {
        int dollar = 10;
        int exchangeRate = 1300;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
            return;
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
            return;
        }
        int won = dollar * exchangeRate;
        System.out.println("환전 금액은 " + won + "원입니다.");
    }
}
