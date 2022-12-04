import java.util.Arrays;
public class Ex6 {
    public static void main (String[] args){

        int[][] array = new int[][]{{10, 4, 2, 5},{2, 6, 2, 1}};


        int[] temp = new int[8];
        int k = 0;
        for(int i = 0; i < array.length;i++){
            for(int j=0; j < array[i].length; j++){
                temp[k] = array[i][j];
                k++;
            }
        }
        Arrays.sort(temp);
        k = -1;
        for(int i = 0; i < array.length; i++){
            for(int j=0; j < array[i].length; j++){
                k++;
                array[i][j] = temp[k];
            }
        }
        System.out.println(Arrays.deepToString(array));

    }

}
