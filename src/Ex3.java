import java.util.Arrays;

public class Ex3 {
    public static void main (String[] args) {

        int[][] array1 = new int[][]{
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };

        int[][] array2 = new int[][]{
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };
        int[][] result = new int[array1.length][array2[0].length];

        for (int t = 0; t < result[0].length; t++) {
            for (int j = 0; j < result.length; j++) {
                for (int i = 0; i < array1[0].length; i++) {
                    result[t][j] = result[t][j] + array1[t][i]*array2[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}
