package decorator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransparentMatrixTest {

    @Test
    void getElemenTransp() {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        MatrixImpl impl = new MatrixImpl(a);
        int currentResult = new TransparentMatrix(impl).getElement(2,2);
        Assert.assertEquals(9,currentResult);

    }

    @Test
    void getElemenTranspNext() {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        MatrixImpl impl = new MatrixImpl(a);
        int currentResult = new TransparentMatrix(impl).getElement(0,2);
        Assert.assertEquals(7,currentResult);

    }
}
