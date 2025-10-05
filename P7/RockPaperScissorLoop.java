import java.util.Scanner;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userScore = 0, compScore = 0, rounds = 0;
        String cont;

        do {
            int comp = (int)(Math.random() * 3);
            System.out.print("Enter rock (0), paper (1), scissor (2): ");
            int user = input.nextInt();

            String[] choice = {"rock", "paper", "scissor"};
            System.out.println("The computer is " + choice[comp] + ". You are " + choice[user] + ".");

            if (comp == user) {
                System.out.println("It is a draw.");
            } else if ((user == 0 && comp == 2) || (user == 1 && comp == 0) || (user == 2 && comp == 1)) {
                System.out.println("You win.");
                userScore++;
            } else {
                System.out.println("You lose.");
                compScore++;
            }

            rounds++;

            System.out.print("\nEnter y to play again: ");
            cont = input.next();

        } while (cont.equalsIgnoreCase("y"));

        System.out.println("\nIn the total of " + rounds + " round(s), You scored " + userScore + ", Computer scored " + compScore);
        if (userScore > compScore)
            System.out.println("You won the game.");
        else if (userScore < compScore)
            System.out.println("You lose the game.");
        else
            System.out.println("It is a draw game.");

    }
}
