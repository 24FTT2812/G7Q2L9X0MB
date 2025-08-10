public class PrintTable {
    public static void main(String[] args) {
        System.out.println("a\t a^2\t a^3");
        for (int a = 1; a <= 4; a++) {
            System.out.println(a + "\t " + (a * a) + "\t " + (a * a * a));
        }
    }
}