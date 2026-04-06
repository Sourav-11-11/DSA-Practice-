package ImpBasics;
import java.util.*;

public class Pallindrome {
    public static boolean isPallindrome(int num) {
        int originalNum = num;                      // Store the original number for comparison
        int reversedNum = 0;

        while (num > 0) {
            int lastDigit = num % 10;                       // Get last digit
            reversedNum = reversedNum * 10 + lastDigit;     // Build the reversed number
            num = num / 10;                                 // Remove last digit
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
        return originalNum == reversedNum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");   
        int num = scanner.nextInt();
        scanner.close();
        isPallindrome(num);
    }   
}
