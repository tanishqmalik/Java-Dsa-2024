// package BasicRecursionAug;

import java.util.Scanner;

public class NtoOne {

    static void reCall(int n, int i){
        if(i==0){
            return;
        }
        System.out.println(i);
        i=i-1;
        reCall(n, i);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int i=n;

        reCall(n,i);
    }
}