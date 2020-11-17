import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.println(i + " * " + j + " = ");
                int answer = scanner.nextInt();
                if (answer == i * j) {
                    System.out.println("정답입니다.\n다음 문제로 넘어갑니다.");
                    continue;
                } else {
                    System.out.println("오답입니다.");
                    i = 10;
                    break;
                }

            }
        }
        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}