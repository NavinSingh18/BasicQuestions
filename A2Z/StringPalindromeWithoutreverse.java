 public static boolean isPalindrome(int i, String s){
        if(i >= s.length()/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length() - i -1)){
            return false;
        }
        
        return isPalindrome(i + 1, s);
    }
