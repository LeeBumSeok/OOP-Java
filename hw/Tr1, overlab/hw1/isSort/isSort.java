import java.util.Arrays;

public class isSort {
    public boolean solution(int[] arr) {
        boolean answer = true;
        int len = arr.length;
        int copyArr[] = new int[len];
        int backCopyArr[] = new int[len];
        
        for(int i = 0; i < len; i++)
        {
            copyArr[i] = arr[i];
            backCopyArr[i] = arr[i];
        }
        
        if(arr[0] < arr[len - 1])
        {
            Arrays.sort(arr);
            for(int i = 0; i < len; i++)
            {
                if(arr[i] != copyArr[i]){
                    answer = false;
                    break;
                }            
            }
        }
        else
        {
            int temp;
            for(int i = 0; i < len - 1; i++)
            {
                if(arr[i] < arr[i + 1])
                {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            for(int i = 0; i < len; i++)
            {
                if(arr[i] != backCopyArr[i])
                {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        isSort test = new isSort();
        int a[] = {9, 7, 7, 1};

        boolean b = test.solution(a);
       

        System.out.println(b);
    }
}