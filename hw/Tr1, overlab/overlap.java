import java.util.Arrays;

class overlap {
    public static void main(String args[]) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 99999, 100000 };

        Arrays.sort(arr);

        boolean answer = true;

        for (int i = 0; i <= arr.length - 2; i++) {
            System.out.println(arr[i] + "" + arr[i + 1]);
            if ((arr[i] + 1) != arr[i + 1]) {
                answer = false;
                break;
            } else
                answer = true;

        }

        System.out.print(answer + "\n");
    }
}