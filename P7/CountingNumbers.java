import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, positive = 0, negative = 0, total = 0, count = 0;

        System.out.println("Enter an integer, the input ends if it is 0:");
        while (true) {
            num = input.nextInt();
            if (num == 0) break;

            total += num;
            count++;
            if (num > 0)
                positive++;
            else
                negative++;
        }

        if (count == 0)
            System.out.println("No number is entered except for 0 to end the program.");
        else {
            double average = (double) total / count;
            System.out.println("The number of positive is " + positive);
            System.out.println("The number of negatives is " + negative);
            System.out.println("The total is " + total);
            System.out.printf("The average is %.2f\n", average);
        }


    }
}
