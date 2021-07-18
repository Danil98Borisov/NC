package decorator;

public class SumOfTwoMatrices implements Matrix {
    int a[][];
    int b[][];

    public SumOfTwoMatrices(int[][] a, int[][] b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return a[i][j]+b[i][j];
    }
}