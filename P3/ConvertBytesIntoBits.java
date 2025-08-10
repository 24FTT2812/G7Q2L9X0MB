import java.util.Scanner;

public class ConvertBytesIntoBits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of byte(s) to be converted: ");
        int bytes = input.nextInt();
        int bits = bytes * 8;

        System.out.println(bytes + " byte(s) is " + bits + " bits.");
        
        input.close();
    }
}
