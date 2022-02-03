import java.util.*;
public class ReverseString {
    public static  void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String rev = "";
        int n = str.length();

        for(int i = n-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);

                // T.C. = O(n).
    }
}
