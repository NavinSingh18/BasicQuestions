public class MyClass {
    public static void main(String args[]) {
      int[][] arr1  = {{1,2,3},
                     {1,2,3},
                     {1,2,3}
          };
          int[][] arr2  = {{1,2,3},
                     {1,2,3},
                     {1,2,3}
          };
          
          mulMat(arr1,arr2);
    }
    
    static void mulMat(int[][] arr1, int[][] arr2){
        int[][] arr3 = new int[3][3];
        
        for(int i =0; i<3; i++){
            for(int j =0; j<3; j++){
                arr3[i][j] = 0;
                for(int k =0; k<3; k++){
                    arr3[i][j] += arr1[i][k]*arr2[k][j]; 
                }
            }
        }
        
        for(int i =0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
