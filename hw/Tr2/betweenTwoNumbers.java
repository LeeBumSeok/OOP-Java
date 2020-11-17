class betweenTwoNumbers {
    public static void main(String[] args) {
        int first = 10;
        int second = 15;
        int[] cnt = new int[10];

        for (int i = first; i <= second; i++) {
            String strNum = Integer.toString(i);
            for (int j = 0; j < strNum.length(); j++) {
                int n = Character.getNumericValue(strNum.charAt(j));
                cnt[n] += 1;
            }
        }
        String answer = "{";
        for (int k = 0; k < 10; k++) {
            answer += k;
            answer += ": ";
            answer += cnt[k];
            if (k != 9)
                answer += ", ";
        }
        answer += '}';
        System.out.println(answer);
    }
}