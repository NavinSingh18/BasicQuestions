import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        String s1 = "A chair";
        String s2 = " a Hairc";

        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] x = s1.toCharArray();
        char[] y = s2.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);


        boolean result = Arrays.equals(x,y);

        if(result){
            System.out.println("Anagram");

        }
        else{
            System.out.println("Not a Anagram");
        }
    }
}
