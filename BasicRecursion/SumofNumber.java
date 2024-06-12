// package BasicRecursion;
// Example 1:
// Input: N=5
// Output: 15
// Explanation: 1+2+3+4+5=15

import java.util.Scanner;


public class SumofNumber {

    static int reCall(int n, int sum,int i){
        if(i==n){
            return sum;
        }
        i++;
        sum=sum+i;
        return reCall(n, sum, i);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int sum=0;
        int i=0;
        int sumfinal = reCall(n, sum,i);
        System.out.println(sumfinal);
    }
}
