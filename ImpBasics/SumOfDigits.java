package ImpBasics;
import java.util.*;
public class SumOfDigits {
    public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;                // Get last digit
            sum += lastDigit;                       // Add last digit to sum
            num = num / 10;                          // Remove last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int result = SumOfDigits.sumDigits(num);
        System.out.println("Sum of digits in " + num + " is: " + result);
    }
}