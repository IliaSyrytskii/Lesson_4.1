import java.util.Arrays;

public class Ex6 {
    public static void main (String[] args){

        int[][] array = new int[][]{{10, 4, 2, 5},{2, 6, 2, 1}};

        for (int t = 0; t < array.length; t++){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[t][i] < array[t][j]) {
                        int result = array[t][i];
                        array[t][i] = array[t][j];
                        result = array[t][j];
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(array));

    }

}
