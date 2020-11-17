import java.util.Arrays;

class Reimbursement {

    int[] works = { 3, 3, 3 };
    int N = 2;

    public static void sort(int[] works) {
        int temp;
        for (int i = works.length - 1; i > 0; i--) {
            if (works[i] < works[i - 1]) {
                temp = works[i];
                works[i] = works[i - 1];
                works[i - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] works = { 3, 3, 3 };
        int N = 2;
        int result = 0;

        Arrays.sort(works);
        for (int j = 0; j < N; j++) {
            sort(works);
            if (works[works.length - 1] == 0)
                result = 0;
            works[works.length - 1] -= 1;
        }
        for (int i = 0; i < works.length; i++) {
            result += works[i] * works[i];
        }
        System.out.println(result);

    }
}