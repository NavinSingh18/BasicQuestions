public class MyClass {
    public static void main(String args[]) {
     int [] arr = {1,2,3,4,5};
     int l = arr.length;
     int n =1;
     for(int i =0; i<n; i++){
         int last =0,j;
         last = arr[l-1];
       
         for(j =l-1;j>0 ;j--){ 
             arr[j] = arr[j-1];
         }
         arr[j] = last;
         
    }
    
    for(int i =0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
}
}
