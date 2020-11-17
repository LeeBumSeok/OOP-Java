class Palindrome {
    public int solution(int n, int m) {
        int answer = 0;

        for (int i = n; i <= m; i++) {
            if (isPalindrome(i))
                answer++;
        }
        return answer;
    }

    private boolean isPalindrome(int num) {
        String strNum = Integer.toString(num);

        for (int i = 0; i < strNum.length() / 2; i++) {
            if (strNum.charAt(i) != strNum.charAt(strNum.length() - i - 1))
                return false;
        }
        return true;
    }
}