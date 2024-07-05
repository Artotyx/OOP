import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Provide file");
            return;
        }

        String filename = args[0];
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineCount++;
                charCount += line.length();

                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            return;
        }

        System.out.println("Character count: " + charCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);
    }
}
