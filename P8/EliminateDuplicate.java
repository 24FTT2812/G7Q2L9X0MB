import java.util.Scanner;
import java.util.Arrays;

public class EliminateDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        // eliminate duplicates by setting them to 0
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[j] = 0;
                }
            }
        }

        // sort
        Arrays.sort(numbers);

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < 10; i++) {
            if (numbers[i] != 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        input.close();
    }
}
