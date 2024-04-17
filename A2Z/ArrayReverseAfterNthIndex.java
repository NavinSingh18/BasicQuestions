public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
     if(m < 0 || m > arr.size() -1){
         return;
     } 
     Collections.reverse(arr.subList(m+1, arr.size()));

    }
// Using one more aproach
    public static void reverseArray(ArrayList<Integer> arr, int m){
      if(m < 0 || m > arr.size() - 1){
        return;
      }
      int start = m + 1;
      int index = arr.size() - 1;

      while(start < index)
      {
        int temp = arr.get(start);
        arr.set(start, arr.get(index));
        arr.set(index, temp);
        start++;
        index--;
      }
}
