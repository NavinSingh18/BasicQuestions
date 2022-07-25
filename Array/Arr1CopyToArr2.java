public class MyClass {
    public static void main(String args[]) {
     int[] arr = {1,2,3,4,5,6};
     int l1  = arr.length;
     int[] arr1 = new int[l1];
     for(int i  =0 ; i< l1; i++){
         
         arr1[i] = arr[i];
     }
     
     for(int i =0; i<l1; i++){
         System.out.print(arr1[i]);
     }
    }
}
