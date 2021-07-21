package decorator;

public class Main{

    public static int[][] createMatrix1(int i, int j){
        int[][] matrix = new int[i][j];
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 3*i + j;
            }
        }
        return matrix;
    }
    public static int[][] createMatrix2(int i, int j){
        int[][] matrix = new int[i][j];
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 2*i + j;
            }
        }
        return matrix;
    }

    public static void printMatrix(int x,int y, Matrix matrix) {
        System.out.println("Матрица: ");
        System.out.println("------");
        int [][] a = new matrix;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.format("%s ", matrix.getElement(i, j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int i = 4;
        int j = 4;

        int[][] matrix1 = createMatrix1(i,j);
        int[][] matrix2 = createMatrix2(i,j);

        Matrix impl1 = new MatrixImpl(matrix1);
        Matrix impl2 = new MatrixImpl(matrix2);

        Matrix transpose = new TransparentMatrix(impl1);
        Matrix sum = new SumOfTwoMatrices(impl1, impl2);

        printMatrix(i, j, impl1);
        printMatrix(i, j, impl2);
        printMatrix(i, j, transpose);
        printMatrix(i, j, sum);
    }

}
