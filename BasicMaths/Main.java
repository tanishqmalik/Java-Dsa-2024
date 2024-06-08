// import java.util.Sacnner;

// public class CountDigits{
// int cnt =0;
// int n=scanner.nextInt();
// System.out.println(n);

// scanner.close();
// }
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.println("Enter an integer:");
        int n = scanner.nextInt();  // Read an integer

        // Print the integer entered by the user
        System.out.println(n);

        // Close the scanner
        scanner.close();
    }
}
