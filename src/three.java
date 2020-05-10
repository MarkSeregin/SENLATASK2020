import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class three {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string : ");
        String text = reader.readLine();
        gaunt(text);
        sort(text);
        firstUpperCase(text);
    }

    public static void gaunt (String text) {
        int count = 0;

        if (text.length() != 0) {
            count++;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') count++;
            }
        }

        System.out.println(count);
    }

    public static void firstUpperCase (String text) {
        StringBuilder builder = new StringBuilder(text);

        if (Character.isAlphabetic(text.codePointAt(0)))
            builder.setCharAt(0, Character.toUpperCase(text.charAt(0)));

        for (int i = 1; i < text.length(); i++)
            if (Character.isAlphabetic(text.charAt(i)) && Character.isSpaceChar(text.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(text.charAt(i)));

        System.out.println(builder.toString());
    }

    public static void sort (String text) {
        String[] word = text.split("\\s+");
        Arrays.sort(word);

        String formattedString = Arrays.toString(word)
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .trim();

        System.out.println(formattedString);
    }
}
