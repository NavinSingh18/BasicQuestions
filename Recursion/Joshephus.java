public class MyClass {
    public static void main(String args[]) {
    
    int noPlayers =5, conditionNumber=3;
    int winner = Joshephus(noPlayers, conditionNumber);
    System.out.println("Winner is player no. " + winner);
}
    static int Joshephus(int n, int k){
        if(n==1){
            return 0;
        }
        else{
            return (Joshephus(n-1 , k)+k)%n;
        }
    }

}
