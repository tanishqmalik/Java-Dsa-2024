// package BasicRecursionAug;

import java.util.*;

public class PrintNameNtimes {


    static void reCall(int n, int i){
        if(i==n){
            return;
        }
        System.out.println("tanishq");
        i++;
        reCall(n, i);
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();
        int i=0;


        reCall(n,i);
    }
}
