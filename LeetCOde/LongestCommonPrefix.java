// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        String [] str = {"fllower","fllow","fllight"};
        HelloWorld h = new HelloWorld();
        String prefix  = h.lcp(str);
        System.out.println(prefix);
    }
    public  String lcp(String[] strs) {
        
        String prefix = "";
        int l = strs.length;
        
        Arrays.sort(strs);
            int end = Math.min(strs[0].length(), strs[l-1].length());
        //int i =0;
        for(int i =0;i<end && strs[0].charAt(i) == strs[l-1].charAt(i);){
            i++;
        prefix = strs[0].substring(0,i);
        
        }
        return prefix;
    }
}
    
