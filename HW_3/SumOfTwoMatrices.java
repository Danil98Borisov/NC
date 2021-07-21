package decorator;

public class SumOfTwoMatrices implements Matrix {
    private final Matrix a;
    private final Matrix b;

    public SumOfTwoMatrices(Matrix a, Matrix b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return a.getElement(i,j)+b.getElement(i,j);
    }
}
