import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class one {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer : ");
        double number = Double.parseDouble(reader.readLine());

        if (number == (int)number) {
            evenOrOdd(number);
            prime(number);
        } else System.out.println("You did not enter an integer");
    }

    public static void evenOrOdd (double number) {
        if (number % 2 == 0) System.out.println("Even number");
        else System.out.println("Odd number");
    }

    public static void prime (double number) {
        if (number < 2) System.out.println("A difficult number");

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("A difficult number");
                break;
            } else {
                System.out.println("Prime number");
                break;
            }
        }
    }
}
