import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class QueueReceipt {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine().toUpperCase();

        // Create folder Practical 5
        java.io.File folder = new java.io.File("Practical 5");
        if (!folder.exists()) {
            folder.mkdir();
        }

        // Receipt file
        FileWriter writer = new FileWriter("Practical 5/QReceipt.txt", true);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        Random rand = new Random();
        int queue = rand.nextInt(900) + 100; // 3-digit queue number

        writer.write("Date & Time: " + now.format(format) + "\r\n");
        writer.write("Hi, " + name + "\r\n");
        writer.write("Your queue number is: " + queue + "\r\n");
        writer.write("-----------------------------------\r\n");
        writer.close();

        System.out.println("Receipt generated. Thank you.");

        input.close();
    }
}
