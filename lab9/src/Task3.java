import java.io.*;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        String filename = "C:\\Users\\User\\IdeaProjects\\lab9\\src\\input.txt";
        String stringToRemove = "ffffffffff";

        File inputFile = new File(filename);
        File tempFile = new File("temp.txt");

        try {
            Scanner scanner = new Scanner(inputFile);
            PrintWriter writer = new PrintWriter(new FileWriter(tempFile));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                line = line.replaceAll(stringToRemove, "");
                writer.println(line);
            }

            scanner.close();
            writer.close();

            if (inputFile.delete()) {
                if (!tempFile.renameTo(inputFile)) {
                    System.out.println("Failed to rename temporary file back to " + filename);
                } else {
                    System.out.println("Occurrences of '" + stringToRemove + "' removed from " + filename);
                }
            } else {
                System.out.println("Failed to delete " + filename);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
