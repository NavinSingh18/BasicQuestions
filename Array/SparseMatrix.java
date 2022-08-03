public class MyClass {
    public static void main(String args[]) {
     //int original[][]={{1,3},{2,4},{2,4},{2,4}};
     int original [][] = {       
                        {4, 0, 0},    
                        {0, 5, 0},    
                        {0, 0, 6}    
                    };
     int rows = original.length;
     int cols = original[0].length;
     int size = rows*cols;
     int count =0;
     
     for(int i =0; i<rows; i++){
         for(int j=0; j<cols; j++){
             if(original[i][j] == 0)
             count++;
         }
     }
     
     if(count > size/2){
         System.out.println("Sparse Matrix");
     }
     else{
         System.out.println("Not a Sparse Matrix");
     }
     
     
    }
}
