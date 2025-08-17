import java.util.Scanner;

public class ReverseOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 100 and 999: ");
        int number = input.nextInt();

        int digit1 = number % 10;
        number /= 10;
        int digit2 = number % 10;
        number /= 10;
        int digit3 = number;

        String reverse = "" + digit1 + digit2 + digit3;
        System.out.println("The reverse of " + (digit3*100 + digit2*10 + digit1) + " is " + reverse);

        input.close();
    }
}
