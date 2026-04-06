package Patterns;

public class Diamond {
    public static void main(String[] args) {
        int n = 4;                                   // Number of rows    
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i ; j++) {     //spaces
                System.out.print( " ");
            }
            for (int j = 1; j <= i; j++) {          // Print numbers from 1 to i columns 
                System.out.print( " *");          //stars
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i ; j++) {     //spaces
                System.out.print( " ");
            }
            for (int j = 1; j <= i; j++) {          // Print numbers from 1 to i columns 
                System.out.print( " *");          //stars
            }
            System.out.println();
        }
    }
}
