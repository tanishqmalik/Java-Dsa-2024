// package BasicRecursion;
import java.util.Scanner;
public class print1toN {

    static void reCall(int n, int i){
        if(n==i){
            return;
        }
        
        i++;
        System.out.println(i);
        reCall(n, i);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int i=0;
        reCall(n,i);
    }
}
