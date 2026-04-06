package ImpBasics;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int reversed = 0;
        while (num > 0) {
            int lastdigit = num % 10;                // % - Get last digit
            reversed = reversed * 10 + lastdigit;    
            num = num / 10;                          // / - Remove last digit
        }
        System.out.println("Reversed number: " + reversed);
        scanner.close();
    }
}