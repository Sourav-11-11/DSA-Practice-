package Patterns;

public class CharPattern {
    public static void main(String[] args) {
        int n = 4;                                  // Number of rows
        char ch = 'A';                             // Starting character
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {          // Print characters from A to A+i-1 columns
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
