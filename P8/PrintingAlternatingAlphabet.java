public class PrintingAlternatingAlphabet {
    public static void main(String[] args) {
        String[] alphabet = new String[26];
        char letter = 'a';

        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(letter);
            letter++;
        }

        // print a-z and z-a alternately
        for (int i = 0, j = 25; i < 26; i++, j--) {
            System.out.print(alphabet[i] + " " + alphabet[j] + " ");
        }
    }
}
