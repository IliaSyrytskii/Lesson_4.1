public class Ex5 {
    public static void main (String[] args){
        int[][] array = new int[][]{{1, 3, 5}, {2, 4, 6}, {7, 5, 3}};

        for (int t = 0; t < array.length; t++){
            for (int i = 0; i < array[t].length; i++) {
                if (t == i) {
                    System.out.println(t + array[t][i]);
                }
            }
            System.out.println();
        }
    }
}
