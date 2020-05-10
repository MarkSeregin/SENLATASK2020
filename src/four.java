import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class four {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a text: ");
        String text = reader.readLine();
        System.out.println("Enter a word: ");
        String word = reader.readLine();
        searchWord(text, word);
    }

    public static void searchWord(String text, String word) {
        int count = 0;
        int i = text.indexOf(word);
        text = text.toLowerCase();
        word = word.toLowerCase();

        while (i >= 0) {
            count++;
            i = text.indexOf(word, i + 1);
        }

        System.out.println(count);
    }
}
