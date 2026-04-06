package Patterns;
public class InvertedStar {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {          //outer - lines - 5
            for (int j = 1; j <= i; j++) {      //inner - stars - 5,4,3,2,1
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// * * * * *
// * * * *
// * * *
// * *
// *
