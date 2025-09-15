import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computer = (int)(Math.random() * 100) % 3; // 0–2
        System.out.println("Enter rock (0), paper (1), scissor (2)");
        int user = input.nextInt();

        String[] choices = {"rock", "paper", "scissor"};

        if (computer == user) {
            System.out.println("The computer is " + choices[computer] + ". You are " + choices[user] + ". It is a draw.");
        }
        if (user == 0 && computer == 2) {
            System.out.println("The computer is scissor. You are rock. You Win.");
        }
        if (user == 0 && computer == 1) {
            System.out.println("The computer is paper. You are rock. You Lose.");
        }
        if (user == 1 && computer == 0) {
            System.out.println("The computer is rock. You are paper. You Win.");
        }
        if (user == 1 && computer == 2) {
            System.out.println("The computer is scissor. You are paper. You Lose.");
        }
        if (user == 2 && computer == 1) {
            System.out.println("The computer is paper. You are scissor. You Win.");
        }
        if (user == 2 && computer == 0) {
            System.out.println("The computer is rock. You are scissor. You Lose.");
        }

    }
}
