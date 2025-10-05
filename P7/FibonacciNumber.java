import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the term: ");
        int term = input.nextInt();

        int first = 0, second = 1, next = 0;

        if (term == 0)
            next = 0;
        else if (term == 1)
            next = 1;
        else {
            for (int i = 2; i <= term; i++) {
                next = first + second;
                first = second;
                second = next;
            }
        }

        System.out.println("At term " + term + " the number is " + next);

        input.close();
    }
}
