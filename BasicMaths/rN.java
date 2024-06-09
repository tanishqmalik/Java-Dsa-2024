import java.util.Scanner;

public class rN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int rn = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rn = (rn * 10) + lastDigit;
            n = n / 10;
        }

        System.out.println(rn);

        scanner.close();
    }
}
