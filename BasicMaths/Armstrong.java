// Input:N = 153
// Output:True
// Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int dup = n;
        int final1 = dup;
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }
        double sum = 0;

        for (int i = 0; i < count; i++) {
            int dup1 = dup % 10;
            sum = Math.pow(dup1, count) + sum;
            dup = dup / 10;
        }

        int intValue = (int) sum;

        // System.out.println(intValue);

        if (final1 == intValue) {
            System.out.println("Armstrong");
        } else {
            System.out.println("not Arm");
        }
        scanner.close();
    }
}
