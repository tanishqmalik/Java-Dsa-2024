// Input: X = 5
// Output: 120
// Explanation: 5! = 5*4*3*2*1

import java.util.Scanner;

public class Factorial {

    static int reCall(int n,int fact, int i){
        if(i==n){
            return fact;
        }
        i++;
        fact = fact*i;
        return reCall(n, fact, i);
    }
   public  static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    int fact=1;
    int i=0;

    int finalresult = reCall(n,fact,i);
    System.out.println(finalresult);
    
   }
}
