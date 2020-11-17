import java.util.Arrays;

public class permutation {
    public boolean solution(int[] arr) {
        boolean answer = true;
        Arrays.sort(arr);
        int len = arr.length;
    
        for(int i = 0; i < len - 1; i++)
        {
            if(arr[i] + 1 == arr[i + 1])
                continue;
            else
                answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        permutation test = new permutation();
        int a[] = {4, 1, 3, 2};

        boolean b = test.solution(a);
       

        System.out.println(b);
    }
}