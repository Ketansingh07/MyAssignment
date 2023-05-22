package Assignment.Assignment.Exception;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        try {
            if (num2 == 0) {
                throw new UnsupportedOperationException("Division by zero is not allowed.");
            }

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

