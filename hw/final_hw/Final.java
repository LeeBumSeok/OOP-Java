import java.util.Arrays;

public class Final {
    public static void main(Stirng[] args) {
        int[] A = { 5, 1, 3, 7 };
        int[] B = { 2, 2, 6, 8 };
        int answer = 0;

        int indexA = A.length - 1;
        int indexB = A.length - 1;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = indexA; i >= 0; i--) {
            if (A[i] < B[indexB]) {
                answer++;
                indexB--;
            }
        }

        System.out.println(answer);
    }
}