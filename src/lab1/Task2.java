package lab1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 digit number: ");
        String num = sc.nextLine();
        int firstDigit = 0;
        int secondDigit = 0;
        for (int i = 0; i < 3; i++) {
            int w = Integer.parseInt(num.substring(i, i+1));
            firstDigit = firstDigit + w ;
        }
        for (int i = 3; i < 6; i++) {
            int w = Integer.parseInt(num.substring(i, i+1));
            secondDigit = secondDigit + w ;
        }
        if (firstDigit == secondDigit) {
            System.out.println( "Lucky number");
        }
        else {
            System.out.println( "Not Lucky number");
        }
    }
}
