import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = (int) Math.log10(number); i >= 0; i--) {
            int pow = (int) Math.pow(10, i);
            answer += number / pow;
            number %= pow;

        }
        scanner.close();
        return answer;
    }
}