public class Ex4 {
    public static void main (String[] args) {

        int[][] array = new int[][]{{1, 4, 10},{1, 5, 2}};
        int result = 0;

        for (int t = 0; t < array.length; t++){
            for (int j = 0; j < array[t].length; j++){
                result += array[t][j];
            }
        }
        System.out.println(result);
    }
}
