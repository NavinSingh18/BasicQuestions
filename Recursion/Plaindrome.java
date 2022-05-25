public class MyClass {
    public static void main(String args[]) {
        String s = "racecar";
        int l=0, r = s.length()-1;


        if(isPalin(s,l,r)){
            System.out.print("Palindrome");
        }
        else
            System.out.println("Not a Palindorme");

    }

    static boolean isPalin(String s, int l, int r){

        if(l>=r){
            return true;
        }
        if(s.charAt(l) != s.charAt(r)){
            return false;
        }
        return isPalin(s, l+1, r-1);
    }

}
