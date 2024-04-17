// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {  
        boolean ans = isPalindrome("Madam");
        System.out.println(ans);
    }
    
    public static boolean isPalindrome(String s){
        String str = reverseS(0,s);
        if(s.equalsIgnoreCase(str)){
            return true;
        }
        return false;
    }
    
    public static String reverseS(int i, String s){
        int n = s.length();
        if(i >= n/2){
            return "";
        }
        s = swapString(i, n-i-1,s);
        reverseS(i + 1, s);
        
        return s;
    }
        public static String swapString(int i, int j, String s){
            char[] charArray = s.toCharArray();
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
        }
}
