package decorator;

public class TransparentMatrix implements Matrix {
    int[][] a;

    public TransparentMatrix(int[][] a) {
        this.a = a;
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
          return a[i][j];
    }
}
