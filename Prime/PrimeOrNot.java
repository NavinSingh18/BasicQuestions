import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args){
        Scanner vin = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = vin.nextInt();
        Prime pObj = new Prime();
        pObj.prime(number);

    }
    
     void prime(int n) {
         int pnum = n / 2, flag = 0;        //because a number is not divisible by more than its half.
         if (n == 0 || n == 1) {
             System.out.println("Not a prime number");
         } else {
             for (int i = 2; i <= pnum; i++) {
                 if (n % i == 0) {
                     System.out.println("Not a prime number");
                     flag = 1;
                     break;
                 }
             }
             if(flag == 0){
                 System.out.println("Prime number");
             }
         }
     }
}
