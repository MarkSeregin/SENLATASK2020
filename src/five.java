import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class five {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number from 0 to 100 : ");
        int number = Integer.parseInt(reader.readLine());

        for (int i = 0; i < number; i++) {
            if (i < 10 || i / 10 == i % 10)
                System.out.print(i + " ");
        }
    }
}
