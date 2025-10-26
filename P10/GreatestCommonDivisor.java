import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        int gcd = findGCD(n1, n2);
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);

        input.close();
    }

    // Method to find GCD
    public static int findGCD(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        return gcd;
    }
}
