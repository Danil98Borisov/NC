package decorator;

public class TransparentMatrix implements Matrix {
    private final Matrix a;

    public TransparentMatrix(Matrix a) {
        this.a = a;
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {

        return a.getElement(j,i);
    }
}
