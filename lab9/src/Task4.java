import java.io.*;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String f = "C:\\Users\\User\\IdeaProjects\\lab9\\src\\SortedStrings.txt";

        try {
            Scanner fileScanner = new Scanner(new File(f));
            String previous = null;
            String current;
            boolean isSorted = true;

            while (fileScanner.hasNextLine()) {
                current = fileScanner.nextLine();
                if (previous != null && current.compareTo(previous) < 0) {
                    isSorted = false;
                    System.out.println("Strings are not sorted. First unsorted pair: " + previous + ", " + current);
                    break;
                }
                previous = current;
            }

            if (isSorted) {
                System.out.println("Strings are sorted.");
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
