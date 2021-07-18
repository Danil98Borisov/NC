package decorator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransparentMatrixTest {

    @Test
    void getElemenTransp() {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int currentResult = new TransparentMatrix(a).getElement(3,2);
        Assert.assertEquals(12,currentResult);

    }

    @Test
    void getElemenTranspNext() {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int currentResult = new TransparentMatrix(a).getElement(0,2);
        Assert.assertEquals(3,currentResult);

    }
}