import java.util.*;
public class FactRecursion {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        long fact = factorial(number);
        System.out.println("Factorial of "+ number + " is " + fact);
    }

    static int factorial(int n){
        if(n>1) {
            return n * factorial(n - 1);    // return (n==0 || n==1)?1:n*factorial(n-1);
        }
        return 1;
    }
}
