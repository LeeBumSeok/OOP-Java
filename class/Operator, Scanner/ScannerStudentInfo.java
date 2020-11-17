import java.util.Scanner;

public class ScannerStudentInfo {
    public static void main(String args[]) {
        System.out.println("소속학부, 학번, 이름, 나이를 입력하세요.");

        Scanner scanner = new Scanner(System.in);

        String department = scanner.next();
        String id = scanner.next();
        String name = scanner.next();
        int age = scanner.nextInt();

        System.out.println(department);
        System.out.println(id);
        System.out.println(name);
        System.out.print(age);

        scanner.close();
    }
}