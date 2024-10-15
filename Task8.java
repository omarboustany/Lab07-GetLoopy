import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;  // Start the loop

        System.out.printf("%-5s %-5s %-5s %-5s %-5s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("------------------------------------");

        int rollCount = 0;

        while (playAgain) {
            rollCount++;

            // Roll the dice once
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int die3 = random.nextInt(6) + 1;
            int sum = die1 + die2 + die3;

            // Print the result in a table format
            System.out.printf("%-5d %-5d %-5d %-5d %-5d%n", rollCount, die1, die2, die3, sum);

            // Ask the user if they want to roll again
            System.out.print("Do you want to roll again? (Y/N): ");
            String userInput = scanner.nextLine().trim().toLowerCase();

            // End the loop if the user enters 'n'
            if (userInput.equals("n")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
