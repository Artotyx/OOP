package lab1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x and y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double x1 = sqrt(x);
        if (y == (5*x1) -(7*x) + 2 ) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
