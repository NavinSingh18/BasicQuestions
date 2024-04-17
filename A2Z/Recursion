//Swap Array using two pointers
public static int[] swapArray(int l, int r, int[] arr){
      if(l >= r){
        return new int[0];
      }
      swap(l,r,arr);
      swapArray(l+1, r-1, arr);
      return arr;
  }
    public static void swap(int i, int j, int[] arr){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
