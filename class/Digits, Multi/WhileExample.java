import java.util.Scanner;

public class WhileExample {

    public static void main(String[] args) {
        System.out.println("양의 정수를 연속적으로 입력하고, 종료하려면 -1을 입력하세요.");

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        do {
            int number = scanner.nextInt();

            count++;
            sum += number;

        } while (sum < 100);

        System.out.println("입력 정수의 개수는 " + count);
        System.out.println("합은 " + sum);
        scanner.close();
    }
}