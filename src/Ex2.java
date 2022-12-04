public class Ex2 {
    public static void main (String[] args) {

        String[][] chess = new String[8][8];

        for (int t = 0; t < chess.length; t++){
            for (int j = 0; j < chess.length; j++) {
                if ((t + j)  % 2 == 0) {
                    chess[t][j] = "W";
                }else {
                    chess[t][j] = "B";
                }
                System.out.print(chess[t][j] + " ");
            }
            System.out.println();
        }
    }
}
