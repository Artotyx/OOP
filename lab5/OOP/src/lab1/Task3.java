package lab1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance, the amount of time before noon and after noon: ");
        float A = sc.nextInt();
        float t1 = sc.nextInt();
        float t2 = sc.nextInt();
        float V1 = 20/t1;
        float V2 = (A-20)/t2;
        if (V1 > V2) {
            System.out.println("Before");
        } else if (V2 > V1) {
            System.out.println("After");
        }
        else {
            System.out.println("Equal");
        }
    }
}
