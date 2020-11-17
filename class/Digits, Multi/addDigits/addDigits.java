public class addDigits {
    public int solution(int n) {
        int answer = 0;

        while(n > 0)
        {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        addDigits add = new addDigits();
        int a = add.solution(987);

        System.out.println(a);
    }
}