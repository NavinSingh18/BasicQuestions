import java.util.stream.IntStream;
public class MyClass {
    public static void main(String args[]) {
     int [] arr = {1,2,3,4,5,6};
     arr = removeElement(arr, 2);
     
     for(int i =0; i<arr.length; i++){
         System.out.print(arr[i] + " ");
     }

      //System.out.println("Sum of x+y = " + z);
    }
    
    static int[] removeElement(int [] arr, int index){
        if(arr==null || index < 0 || index > arr.length){
            return arr;
        }
        
        return IntStream.range(0, arr.length).filter(i -> i != index).map(i -> arr[i]).toArray();
        //  return IntStream.range(0, arr.length)
        //     .filter(i -> i != index)
        //     .map(i -> arr[i])
        //     .toArray();
    }
}
