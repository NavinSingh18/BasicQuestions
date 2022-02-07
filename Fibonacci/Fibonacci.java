import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a =0;
        int b =1;
        int temp =0;

       System.out.print(a + " " +b + " ");

        for(int i=2; i<=n; i++){
           temp = a+b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        }
    }
}
