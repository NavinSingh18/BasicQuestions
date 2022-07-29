import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      int [] arr = {10,20,20,30,30,40,50,20,50};
      int length = arr.length;
      length = removeDup(arr, length);
      
      for(int i =0; i<length; i++){
          System.out.print(arr[i] + " ");
      }
    }
    
    static int removeDup(int[] arr, int n){
        if (n==0 || n==1)  
            return n;
        
        
        Arrays.sort(arr);
            //int[] temp = new int[n];
            int j=0;
        for(int i =0; i<n-1; i++){
            if(arr[i] != arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }
        
        arr[j] = arr[n-1];
        return j;
    }
    
}
