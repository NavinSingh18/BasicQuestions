import java.util.*;
public class ReverseNum {
    public static  void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int res =0;
        while (num>0) {
            int temp = num;
            int rem = num % 10;
            res = res * 10 + rem;
            num = temp/10;
        }
        System.out.println(res);
    }

}
