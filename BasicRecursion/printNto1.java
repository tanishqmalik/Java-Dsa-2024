import java.util.Scanner;

public class printNto1 {

    static void reCall(int n, int i){
        if(n==i){
            return;
        }
        System.out.println(n);
        n--;
        reCall(n, i);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i=0;
        reCall(n,i);
    }
}