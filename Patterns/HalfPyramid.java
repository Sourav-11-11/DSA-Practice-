package Patterns;
public class HalfPyramid { 
    public static void main(String[] args) {
        int n = 4;                                  // Number of rows    
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {          // Print numbers from 1 to i columns 
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
