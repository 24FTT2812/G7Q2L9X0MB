public class LoopsLoopsLoops {
    public static void main(String[] args) {

        // 1) While loop: 1 to 20
        System.out.println("Below is generated using while loop:");
        int i = 1;
        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }

        // 2) Do-while loop: 50 down to 35
        System.out.println("\n\nBelow is generated using do-while loop:");
        int j = 50;
        do {
            System.out.print(j + " ");
            j--;
        } while (j >= 35);

        // 3) For loop: a to z
        System.out.println("\n\nBelow is generated using for loop:");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
    }
}
