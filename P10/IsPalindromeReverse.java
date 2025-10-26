import java.util.Scanner;

public class IsPalindromeReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = (int)(Math.random() * 900) + 100; // random 3-digit number
        System.out.print("Enter the reverse of " + number + ": ");
        int userReverse = input.nextInt();

        // ensure user enters 3 digits
        while (userReverse < 100 || userReverse > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + number + ": ");
            userReverse = input.nextInt();
        }

        int reversedNumber = reverse(number);
        boolean result = isPalindrome(userReverse, reversedNumber);

        System.out.println("The digit " + userReverse + " is palindrome of " + number + " is " + result);

        input.close();
    }

    // Method 1: reverse the digits
    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }

    // Method 2: check if palindrome
    public static boolean isPalindrome(int userInput, int reversedNumber) {
        return userInput == reversedNumber;
    }
}
