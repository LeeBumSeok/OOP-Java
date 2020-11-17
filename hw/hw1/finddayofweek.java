import java.util.Scanner;

public class finddayofweek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 선언

        int year;
        int month;
        int day;
        // 구할 날짜의 int형 year, month, day 변수 선언
        int sum_of_day;
        // 해당 날짜의 day를 더해 줄 int형 sum_of_day 변수 선언
        boolean leap;
        // 윤년을 판단해줄 boolean형 leap 변수 선언

        System.out.println("year: ");
        year = sc.nextInt();
        System.out.println("month: ");
        month = sc.nextInt();
        System.out.println("day: ");
        day = sc.nextInt();
        // 사용자로부터 year, month, day를 입력받음

        for (int i = 1; i < year; i++) {
            if ((i % 100 != 0) && (i % 4 == 0) || (i % 400 == 0)) {
                sum_of_day += 366;
            } else {
                sum_of_day += 365;
            }

        }
        // 1부터 해당 년도까지 윤년을 판별해서 366 혹은 365를 더해 줌

        if ((year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0)) {
            leap = true;
        } else {
            leap = false;
        }

        // 윤년 판별

        for (int i = 1; i < month; i++) {
            if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12)) {
                sum_of_day += 31;
            } else if ((i == 4) || (i == 6) || (i == 9) || (i == 11)) {
                sum_of_day += 30;
            } else if (i == 2) {
                if (leap == true) {
                    sum_of_day += 29;
                } else {
                    sum_of_day += 28;
                }
            }
        }
        // 1월부터 해당 월까지 31 혹은 30을 더해주고 2월 이상인 달은 윤년을 판별해서 더해 줌

        sum_of_day += day;
        // day를 더해 줌

        if (sum_of_day % 7 == 0) {
            System.out.println("Sunday");
        } else if (sum_of_day % 7 == 1) {
            System.out.println("Monday");
        } else if (sum_of_day % 7 == 2) {
            System.out.println("Tuesday");
        } else if (sum_of_day % 7 == 3) {
            System.out.println("Wednesday");
        } else if (sum_of_day % 7 == 4) {
            System.out.println("Thursday");
        } else if (sum_of_day % 7 == 5) {
            System.out.println("Friday");
        } else if (sum_of_day % 7 == 6) {
            System.out.println("Saturday");
        }
        // sum_of_day를 7로 나눈 나머지가 해당 요일이 되게 출력해 줌
    }

}