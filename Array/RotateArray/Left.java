public class MyClass {
    public static void main(String args[]) {
     int [] arr = {1,2,3,4,5};
     
     int n =3;
     for(int i =0; i<n; i++){
         int first =0,j;
         for(j =0; j<arr.length-1; j++){
             first = arr[j];
             arr[j] = arr[j+1];
         }
         arr[j] = first;
         
    }
    
    for(int i =0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
}
}
