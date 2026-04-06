package Basics;
import java.util.*;
public class AreaCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
        scanner.close();
    }
}

// can also use 3.14d instead of Math.PI, but Math.PI is more accurate.