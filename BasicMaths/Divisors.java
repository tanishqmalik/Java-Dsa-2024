import java.util.Scanner;

public class Divisors {

    public static void main(String[] args) {
        // int arr[] = new int[1000];
        Scanner scanner = new Scanner(System.in);
        // scanner.close();

        int n = scanner.nextInt();
        // int i = 0;

        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
 