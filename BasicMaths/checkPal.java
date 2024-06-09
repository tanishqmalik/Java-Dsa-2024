import java.util.Scanner;

public class checkPal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int rn = 0;
        int dup = n;
        while (n > 0) {
            int lastD = n % 10;
            rn = (rn * 10) + lastD;
            n = n / 10;
        }
        if (dup == rn) {
            System.out.println("palindrome");
        } else {
            System.out.println("nope");
        }
        scanner.close();
    }
}
