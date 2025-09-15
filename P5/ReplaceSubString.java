import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your message: ");
        String message = input.nextLine();

        System.out.print("Enter the substring to replace: ");
        String oldWord = input.nextLine();

        System.out.print("Enter the replacement string: ");
        String newWord = input.nextLine();

        String updated = message.replace(oldWord, newWord);

        System.out.println("The updated message is:");
        System.out.println(updated);

        input.close();
    }
}
