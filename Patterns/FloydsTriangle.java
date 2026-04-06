package Patterns;

public class FloydsTriangle {
    public static void main(String[] args) {
        int n = 4;                                  // Number of rows
        int num = 1;                                // Starting number
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {          // Print numbers from 1 to i columns 
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
