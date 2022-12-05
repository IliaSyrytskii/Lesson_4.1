import java.util.Arrays;

public class Ex5 {
    public static void main (String[] args){
        int[][][] array = new int[][][]{{{1, 3, 5}, {2, 4, 6}}, {{7, 5, 3}, {6, 4, 2}}};

        System.out.println(Arrays.deepToString(array));

        for (int t = 0; t < array.length; t++) {
            for (int i = 0; i < array[t].length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if ((t == i) & (i == j)) {
                        System.out.println(t + i + array[t][i][j]);
                    }
                    if ((t != i) & (i != j)) {
                        System.out.println(j + t + array[t][i][j]);
                    }
                }
            }
        }
    }
}
