import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class two {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 2 integer : ");
        double firstNumber = Double.parseDouble(reader.readLine());
        double secondNumber = Double.parseDouble(reader.readLine());

        if (firstNumber == (int)firstNumber && secondNumber == (int)secondNumber) {
            System.out.println("Greatest Common Divisor : " + gcd((int) firstNumber, (int) secondNumber));
            System.out.println("Least Common Multiple : " + lcm((int) firstNumber, (int) secondNumber));
        } else System.out.println("You did not enter an integer");
    }

    static int gcd (int firstnumber, int secondnumber) {
         return secondnumber == 0 ? firstnumber : gcd(secondnumber, firstnumber % secondnumber);
    }

    static int lcm (int firstnumber, int secondnumber) {
        return firstnumber / gcd(firstnumber, secondnumber) * secondnumber;
    }
}
