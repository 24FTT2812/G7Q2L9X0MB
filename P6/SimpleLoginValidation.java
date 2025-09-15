import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleLoginValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctUser = "Ahmad Ali";
        String correctPass = "12345";

        System.out.print("Please enter your username: ");
        String username = input.nextLine();

        System.out.print("Please enter the password: ");
        String password = input.nextLine();

        if (!username.equals(correctUser)) {
            System.out.println("Error: Invalid Username.");
        } else {
            if (!password.equals(correctPass)) {
                System.out.println("Error: Password does not match.");
            } else {
                String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
                System.out.println("Welcome " + username + ". The time now is " + time);
            }
        }

        input.close();
    }
}
