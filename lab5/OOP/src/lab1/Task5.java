package lab1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers (0 to stop):");
        int n, sum = 0;
        do {
            n = sc.nextInt();
            if (n % 2 != 0) {
                sum += n;
            }
        } while (n != 0);

        System.out.println(sum);
    }
}