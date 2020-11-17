import java.util.Arrays;
import java.util.Collections;

public class overlap2 {
    public static void main(String[] args) {
        boolean answer = true;
        int[] arr = { 1, 3, 7, 3, 4, 3, 3, 2 };
        int[] newArr = new int[arr.length];
        Integer[] newBackarr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            newBackarr[i] = arr[i];
        }

        if (arr[0] < arr[arr.length - 1]) {
            Arrays.sort(newArr);
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] != newArr[j])
                    answer = false;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                Arrays.sort(newBackarr, Collections.reverseOrder());
                if (arr[i] != newBackarr[i]) {
                    answer = false;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}