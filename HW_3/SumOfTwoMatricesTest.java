package decorator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoMatricesTest {

    @Test
    void getElementNull() {
        int[][] b = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] a = {{13,14,15}, {16,17,18}, {19,20,21}, {22,23,24}};
        MatrixImpl impl1 = new MatrixImpl(a);
        MatrixImpl impl2 = new MatrixImpl(b);
        int currentResult = new SumOfTwoMatrices(impl1, impl2).getElement(2,1);
        Assert.assertEquals(28,currentResult);
    }

    @Test
    void getElementTest() {
        int[][] b = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] a = {{13,14,15},{16,17,18},{19,20,21},{22,23,24}};
        MatrixImpl impl1 = new MatrixImpl(a);
        MatrixImpl impl2 = new MatrixImpl(b);
        int currentResult = new SumOfTwoMatrices(impl1,impl2).getElement(3,2);
        Assert.assertEquals(36,currentResult);
    }
}
