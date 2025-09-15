import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ModulusQuestion {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();

        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(99) + 1; // avoid zero

        String question = num1 + " % " + num2 + " = ?" + "\r\n";

        // Create folder "Practical 5" and file "Modulus Questions.txt"
        java.io.File folder = new java.io.File("Practical 5");
        if (!folder.exists()) {
            folder.mkdir();
        }

        FileWriter writer = new FileWriter("Practical 5/Modulus Questions.txt", true);
        writer.write(question);
        writer.close();

        System.out.println("A new question added");
    }
}
