public class MyClass {
    public static void main(String args[]) {
     //int original[][]={{1,3},{2,4},{2,4},{2,4}};
    
         int identity [][] = {
                         {1,0,0},{0,1,0},{0,0,1}
            
            
            
         };
        
        //identityMat(original);  //Not a Identity Matrix
      identityMat(identity);      //Identity Matrix
    }
  
  static void identityMat(int [][] arr){
        boolean flag = true;
        int rows = arr.length;
     int cols = arr[0].length;
        for(int i =0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i == j && arr[i][j] != 1)
                flag = false;
                
                if(i!=j && arr[i][j] != 0)
                flag = false;
            }
        }
        
        if(flag){
            System.out.println("Identity Matrix");
        }
        else{
            System.out.println("Not a identity matrix");
        }
    }
}
