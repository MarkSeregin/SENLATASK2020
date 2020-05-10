import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class six {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        six backpack = new six();
        int number = Integer.parseInt(reader.readLine());
        int[] weight = new int[number + 1];
        int[] value = new int[number + 1];
        System.out.println("Enter weight for "+ number +" things");

        for (int i = 0; i <= number; i++)
            weight[i] = Integer.parseInt(reader.readLine());

        System.out.println("Enter a price for "+ number +" things");

        for (int i = 0; i <= number; i++)
            value[i] = Integer.parseInt(reader.readLine());

        System.out.println("Enter the weight that the backpack can withstand : ");
        int var = Integer.parseInt(reader.readLine());
        backpack.solv(weight, value, var, number);
    }

    public static void solv(int[] weight, int[] value, int var, int number) {
        int NEGATIVE_INFINITY = Integer.MIN_VALUE;
        int[][] arrone = new int[number + 1][var + 1];
        int[][] arrtwo = new int[number + 1][var + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j <= var; j++) {
                int m1 = arrtwo[i - 1][j];
                int m2 = NEGATIVE_INFINITY;

                if (j >= weight[i]) m2 = arrtwo[i - 1][j - weight[i]] + value[i];

                arrtwo[i][j] = Math.max(m1, m2);
                arrone[i][j] = m2 > m1 ? 1 : 0;
            }
        }

        int[] selected = new int[number + 1];

        for (int number1 = number, var1 = var; number1 > 0; number1--) {
            if (arrone[number1][var1] != 0) {
                selected[number1] = 1;
                var1 = var1 - weight[number1];
            } else selected[number1] = 0;
        }

        System.out.println("Selected things under the numbers : ");

        for (int i = 1; i < number + 1; i++) {
            if (selected[i] == 1)
                System.out.print(i + " ");
        }

        System.out.println();
    }
}
