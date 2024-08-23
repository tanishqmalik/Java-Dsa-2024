// package BasicRecursionAug;

import java.util.Scanner;

public class SumofNnumbers {


    static int reCall(int n,int i,int sum){
        if(i>=n){
            return sum;
        }
        // System.out.println(sum);
        i++;
        sum = sum +i;
        return reCall(n, i, sum);
    }

    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i=0;
        int sum=0;

        int sumfinal = reCall(n,i,sum);

        System.out.println(sumfinal);
    }
}
