// package BasicRecursion;

import java.util.Scanner;


public class IntroToRecursion {

    static void reCall(int count, int n){
        if(count==n){
            return;
        }
        System.out.println(count);
        count++;
        reCall(count, n);
        
    }

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int count=0;
        int n;
        n=scanner.nextInt();
        
        reCall(count,n);
    }
}
