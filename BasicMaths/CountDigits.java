import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner helloScanner = new Scanner(System.in);

        int n = helloScanner.nextInt();
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println(count);
    }
}
