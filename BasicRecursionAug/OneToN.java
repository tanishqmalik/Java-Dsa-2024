// package BasicRecursionAug;

import java.util.*;;

public class OneToN {


    static void reCall(int n,int i){
        if(i>n){
            return;
        }
        System.out.println(i);
        i++;
        reCall(n, i);
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;

        reCall(n, i);
    }
}
