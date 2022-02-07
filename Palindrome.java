import java.util.*;
public class PalindromeP {
    public static void main(String[] args){
        String original,reverse = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String/number ");
        original = s.nextLine();

        for(int i = (original.length()-1); i>=0; i--){
            reverse = reverse + original.charAt(i);
        }
        System.out.println(reverse);

        if(reverse.equalsIgnoreCase(original)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
    }
}
