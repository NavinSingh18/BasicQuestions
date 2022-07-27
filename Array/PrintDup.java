public class MyClass {
    public static void main(String args[]) {
      int[] arr = {1, 2, 3, 4, 2, 7,7,3,1, 8, 8, 3};
      
      for(int i =0; i<arr.length; i++){
          int count =1;
          for(int j=i+1; j<arr.length-1; j++){
          if(arr[i] == arr[j]){
             System.out.println(arr[i]);
            }
          }
      }
   }
}
