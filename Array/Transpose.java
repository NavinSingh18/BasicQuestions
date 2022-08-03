public class MyClass {
    public static void main(String args[]) {
     //int original[][]={{1,3},{2,4},{2,4},{2,4}};
     int original [][] = {       
                        {4, 2, 5},    
                        {1, 5, 4},    
                        {1, 2, 9}    
                    };
      
     transpose(original);
    }
  
  static void transpose(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] arr1 = new int[cols][rows];
        
        for(int i =0; i<cols; i++){
            for(int j=0; j<rows; j++){
                arr1[i][j] = arr[j][i];
        }
    }
    for(int i =0; i<cols; i++){
            for(int j=0; j<rows; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
            
       }
  }
