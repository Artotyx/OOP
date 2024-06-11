package lab1;

import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter numbers:");
        float a = myObj.nextFloat();
        float b = myObj.nextFloat();

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        }
        else if (a < b) {
            System.out.println(b + " is greater than " + a);
        }
        else {
            System.out.println(b + " is equal to " + a);
        }
    }
}