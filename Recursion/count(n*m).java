public class MyClass {
    public static void main(String args[]) {
     int n =3, m=3;
    System.out.print(count(n,m));
    }
    
    static int count(int n, int m){
        if(n==1 || m==1){
            return 1;
        }
        else{
            return count(n-1, m)+ count(n, m-1);
        }
    }
}
