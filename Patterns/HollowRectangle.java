package Patterns;

public class HollowRectangle {
    public static void main(String[] args) {
        int rows = 4; // Number of rows
        int cols = 6; // Number of columns

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space for hollow part
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
