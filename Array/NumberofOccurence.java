public class MyClass {
    public static void main(String args[]) {
     int[] arr ={1, 2, 8, 3, 2, 2, 2, 5, 1 };
     int visited = -1;
     int[] crr = new int[arr.length];
     for(int i =0; i<arr.length; i++){
         int count =1;
         for(int j =i+1; j<arr.length; j++){
             if(arr[i] == arr[j]){
                 count++;
                 crr[j] = visited;
             }
             
         }
         if(crr[i] != visited){
             crr[i] = count;
         }
     }
     
     for(int i=0; i<arr.length; i++){
         if(crr[i] != visited)
             System.out.println(arr[i] + "    "+ crr[i]);
         
     }
     
    }
}
