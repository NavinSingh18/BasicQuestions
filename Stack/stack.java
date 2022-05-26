import java.util.*;
public class MyClass {
    
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        
        int top = s.pop();
        reverse(s);
        pushAtBottom(top,s);
    }
    
    public static void main(String args[]) {
      Stack<Integer> s = new Stack<>();
      s.push(10);
      s.push(20);
      s.push(30);
      s.push(40);
      s.push(50);
      
      pushAtBottom(100, s);
      
      reverse(s);
      
      while(!s.isEmpty()){
          System.out.println(s.peek());
          s.pop();
      }
    }
}
