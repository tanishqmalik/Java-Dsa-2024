// package testpad.recursion;

public class factorial {

    static int factoriall(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return n;
        }
        // n=n*factoriall(n-1);
        return n*factoriall(n-1);
        // fact = n*fact;
        // n--;
    }
    public static void main(String[] args) {
        int n=0;
        System.out.println(factoriall(n));
        
    }
}
