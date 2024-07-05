import java.io.*;
import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        File file = new File("LabWork9.txt");

        try {
            if (!file.exists()) {
                try (PrintWriter writer = new PrintWriter(file)) {
                    Random random = new Random();
                    for (int i = 0; i < 100; i++) {
                        writer.print(random.nextInt(1000) + " ");
                    }
                }
            }

            List<Integer> numbers = new ArrayList<>();
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextInt()) {
                    numbers.add(scanner.nextInt());
                }
            }
            Collections.sort(numbers);

            System.out.println("Sorted numbers:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
