import java.util.Scanner;

public class AddFourNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = (int)(Math.random() * 100);
        int n2 = (int)(Math.random() * 100);
        int n3 = (int)(Math.random() * 100);
        int n4 = (int)(Math.random() * 100);

        int sum = n1 + n2 + n3 + n4;

        System.out.println("What is " + n1 + " + " + n2 + " + " + n3 + " + " + n4 + "?");
        int answer = input.nextInt();

        if (answer == sum) {
            System.out.println("Well done, you are correct!");
        } else {
            System.out.println("Nice try, the sum should be " + sum);
        }

        input.close();
    }
}
