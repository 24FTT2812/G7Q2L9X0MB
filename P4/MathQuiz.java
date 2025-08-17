import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);

        // This is for addition
        System.out.println("What is " + num1 + " + " + num2 + " ?");
        int ansSum = input.nextInt();
        boolean sumCheck = (ansSum == (num1 + num2));
        System.out.println(num1 + " + " + num2 + " = " + ansSum + " is " + sumCheck);

        System.out.println();

        // This is for the modulus
        System.out.println("What is " + num1 + " % " + num2 + " ?");
        int ansMod = input.nextInt();
        boolean modCheck = (ansMod == (num1 % num2));
        System.out.println(num1 + " % " + num2 + " = " + ansMod + " is " + modCheck);

        input.close();
    }
}
