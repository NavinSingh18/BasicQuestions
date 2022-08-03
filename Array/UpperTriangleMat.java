public class MyClass {
    public static void main(String args[]) {
     //int original[][]={{1,3},{2,4},{2,4},{2,4}};
     int original [][] = {       
                        {4, 2, 5},    
                        {1, 5, 4},    
                        {1, 2, 9}    
                    };
      lowerTrian(original);
    }
  
  static void lowerTrian(int[][] arr){
        int rows = arr.length;
     int cols = arr[0].length;
     
     if(rows != cols)
     System.out.println("Square Matrix");
     
     else{
         for (int i =0; i<rows; i++){
             for(int j=0; j<cols; j++){
                 if(i == j || i > j){
                     System.out.print(arr[i][j] + " ");
                 }
                 else{
                     System.out.print(0);
                 }
             }
             System.out.println();
         }
     }
   }    
}
