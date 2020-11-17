import java.util.Scanner;

public class Digits {
    public static void main(String args[]) {
        System.out.println("정수를 입력하세요.");

        Scanner scanner = new Scanner(System.in);

        // 연산으로 구할 때
        int number = scanner.nextInt();
        int sum = 0;

        // int number100 = number / 100;
        // int number10 = (number % 100) / 10;
        // int number1 = (number % 100 % 10);

        // System.out.println(number100);
        // System.out.println(number10);
        // System.out.println(number1);

        // 인덱스를 불러올 때
        // String strnumber = scanner.next();

        // System.out.println(strnumber.charAt(0));
        // System.out.println(strnumber.charAt(1));
        // System.out.println(strnumber.charAt(2));
        for (int i = (int) Math.log10(number); i >= 0; i--) {
            int pow = (int) Math.pow(10, i);
            // System.out.println(pow + "의 자릿수: " + number / pow);
            sum += number / pow;
            number %= pow;
        }
        System.out.println(sum);

        scanner.close();
    }
}