import java.util.*;
public class PrintPrime {
    static Scanner s = new Scanner(System.in);

    static int start = s.nextInt();
    static int end = s.nextInt();
    static int count =0;

    public static void main(String[] args) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)){
                count ++;
                System.out.print(i + " ");
            }
        }
        //System.out.println(count);
    }



    static  boolean isPrime(int n){
        int m = n/2;
        if (n <= 1){
            return false;
        }
        for (int i = 2; i<=m; i++){
            if(n % i==0){
                return false;
            }
        }
        return true;
    }
}
