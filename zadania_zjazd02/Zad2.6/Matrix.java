import java.util.Random;

class Matrix {

    final int rows = 3;
    final int columns = 3;
    final int[][] matrix = new int[rows][columns];


    public void matrix() {
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(20);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }

    public  void transposition() {
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

    }
}
