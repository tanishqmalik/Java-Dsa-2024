// public package BasicRecursionAug;

import java.util.*;

class IntrotoRecursion {


    static void reCall(int n,int i){
        // int i=0;
        if(i==n){
            return;
        }
        System.out.println(i);
        i=i+1;
        reCall(n,i);
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n;
        int i=0;

        n = scanner.nextInt();

        reCall(n,i);

    }
    
}