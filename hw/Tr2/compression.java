
public class compression {
    public static void main(String[] args) {
        String str = "aaabbccccccdddd";
        String answer = "";

        int cnt = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
                if (cnt > 9) {
                    answer += str.charAt(i);
                    answer += Integer.toString(9);
                    cnt = 1;
                }
            } else {
                answer += str.charAt(i);
                answer += Integer.toString(cnt);
                cnt = 1;
            }
        }
        answer += str.charAt(str.length() - 1);
        answer += Integer.toString(cnt);
        System.out.println(answer);
    }
}