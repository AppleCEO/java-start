package condition.example;

public class Test1 {
    public static void main(String[] args) {
        int score = 85;
        String degree;

        switch(score/10) {
            case 10:
            case 9:
                degree = "A";
                break;
            case 8:
                degree = "B";
                break;
            case 7:
                degree = "C";
                break;
            case 6:
                degree = "D";
                break;
            default:
                degree = "F";
        }

        System.out.println("학점은 " + degree + "입니다.");
    }
}
