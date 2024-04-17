import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = swapArray(0, arr);
        System.out.println(Arrays.toString(ans));
    }

public static int[] swapArray(int i, int[] arr){
        int n = arr.length;
        
        if(i >= n/2){
            return new int[0];
        }
        swap(i, n-i-1, arr);
        swapArray(i + 1, arr);
        
        return arr;
    }
}
    
    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
