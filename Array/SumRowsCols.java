public class MyClass {
    public static void main(String args[]) {
     //int original[][]={{1,3},{2,4},{2,4},{2,4}};
     int original [][] = {       
                        {4, 2, 5},    
                        {1, 5, 4},    
                        {1, 2, 9}    
                    };
      sumRC(original);
    }
  
  static void sumRC(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        
        for(int i =0; i<rows; i++){
            int sum =0;
            for(int j=0; j<cols; j++){
                sum +=arr[i][j];
                
            }
            System.out.println("Sum of row "+ (i+1) + " " + sum);
        }
        
        
        
        for(int i =0; i<cols;i++){
            int sumC = 0;
            for(int j =0;j<rows;j++){
                sumC += arr[j][i];
            }
            System.out.println("Sum of Column " + (i+1) + " " + sumC);
            
        }
    }        
}
