import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        int[][][] array = new int[][][]{{
                {12, 5, 16},
                {2, 15, 9},
                {7, 1, 2}},
                {{1, 3, 8},
                {4, 5, 1},
                {10, 4, 9}}
        };

        System.out.println(Arrays.deepToString(array));

        System.out.println("Enter a count");

        number = sc.nextInt();

        for (int t = 0; t < array.length; t++) {
            for (int j = 0; j < array[t].length; j++) {
                for (int i = 0; i < array[t][j].length; i++) {
                    array[t][j][i] += number;
                }
            }
        }
        System.out.println("New array " + Arrays.deepToString(array));
    }
}
