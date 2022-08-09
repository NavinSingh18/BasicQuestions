class Solution
{
  public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr1.length;
       System.out.println(subG(arr1, n, 15));

    }
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int sum) 
    {
        int curr_sum, i, j;
        ArrayList<Integer> arrl = new ArrayList<>();
        // Pick a starting point
        for (i = 0; i < n; i++) {
            curr_sum = arr[i];

            // try all subarrays starting with 'i'
            for (j = i + 1; j <= n; j++) {
                if (curr_sum == sum) {
                    int p = j;
                    arrl.add(i+1);
                    arrl.add(p);
//                    System.out.println(
//                            "Sum found between indexes " + i
//                                    + " and " + p);
                    return arrl;
                }
               
                if (curr_sum > sum || j == n)
                    break;
                curr_sum = curr_sum + arr[j];
            }
        }

        arrl.add(-1);
        return arrl;
    }
}
