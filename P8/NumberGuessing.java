import java.util.*;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) numbers[i] = i;

        // shuffle
        for (int i = 0; i < numbers.length; i++) {
            int randomIndex = rand.nextInt(numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }

        int chances = 10;

        while (chances > 0) {
            System.out.println("\nGuess 4 numbers (no duplicates): ");
            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = input.nextInt();
            }

            int correct = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == numbers[i]) {
                    correct++;
                }
            }

            chances--;

            if (correct == 4) {
                System.out.println("You Won! You got the actual number!");
                break;
            } else if (chances == 0) {
                System.out.print("\nThe actual number is: ");
                for (int i = 0; i < 4; i++) System.out.print(numbers[i] + " ");
                System.out.println("\nYou Lose.");
            } else {
                System.out.println("You have score " + correct + " out of 4 numbers. You have " + chances + " chances left.");
            }
        }

        input.close();
    }
}
