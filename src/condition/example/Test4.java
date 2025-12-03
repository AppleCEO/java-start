package condition.example;

public class Test4 {
    public static void main(String[] args) {
        double averagePoint = 9;

        switch ((int) (averagePoint)) {
            case 10:
            case 9:
                System.out.println("'어바웃타임' 을 추천합니다.");
                break;
            case 8:
                System.out.println("'어바웃타임' 을 추천합니다.");
                System.out.println("'토이 스토리' 를 추천합니다.");
                break;
            case 7:
                System.out.println("'어바웃타임' 을 추천합니다.");
                System.out.println("'토이 스토리' 를 추천합니다.");
                System.out.println("'고질라' 를 추천합니다.");
                break;
        }
    }
}
