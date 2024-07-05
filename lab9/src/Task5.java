import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        String[] ranks = {"assistant", "associate", "full"};
        Random random = new Random();

        try (PrintWriter writer = new PrintWriter(new FileWriter("Salary.txt"))) {
            for (int i = 1; i <= 1000; i++) {
                String firstName = "FirstName" + i;
                String lastName = "LastName" + i;
                String rank = ranks[random.nextInt(ranks.length)];
                double salary = generateSalary(rank, random);

                writer.printf("%s %s %s %.2f%n", firstName, lastName, rank, salary);
            }
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    private static double generateSalary(String rank, Random random) {
        switch (rank) {
            case "assistant":
                return 50000 + (random.nextDouble() * 30000);
            case "associate":
                return 60000 + (random.nextDouble() * 50000);
            case "full":
                return 75000 + (random.nextDouble() * 55000);
            default:
                throw new IllegalArgumentException("Unknown rank: " + rank);
        }
    }
}

