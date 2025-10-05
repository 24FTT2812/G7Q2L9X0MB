import java.util.Scanner;

public class AssigningGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        int[] scores = new int[n];
        char[] grades = new char[n];

        System.out.println("Enter the " + n + " scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = input.nextInt();
        }

        // find best score
        int best = scores[0];
        for (int score : scores) {
            if (score > best) best = score;
        }

        // assign grades
        for (int i = 0; i < n; i++) {
            if (scores[i] >= best - 10)
                grades[i] = 'A';
            else if (scores[i] >= best - 20)
                grades[i] = 'B';
            else if (scores[i] >= best - 30)
                grades[i] = 'C';
            else if (scores[i] >= best - 40)
                grades[i] = 'D';
            else
                grades[i] = 'F';
        }

        // display
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is " + grades[i]);
        }

        input.close();
    }
}
