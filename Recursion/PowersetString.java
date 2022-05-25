public class MyClass {
    public static void main(String args[]) {
        String s = "abc";
        int i =0;
        String cur=" ";
        int r = s.length()-1;
       powerSet(s,i,cur);


        

    }

    static void powerSet(String s, int i, String cur){
        int count=0;
        if(i==s.length()){
            
            System.out.print(cur);
            
            return ;
        }
        
        else{
             powerSet(s, i+1, cur+s.charAt(i));
             powerSet(s, i+1, cur);
        }
    }

}
