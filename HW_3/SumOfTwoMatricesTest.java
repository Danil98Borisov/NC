package decorator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoMatricesTest {

    @Test
    void getElementNull() {
        int[][] b = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] a = {{13,14,15},{16,17,18},{19,20,21},{22,23,24}};
        int currentResult = new SumOfTwoMatrices(a,b).getElement(0,0);
        Assert.assertEquals(14,currentResult);
    }

    @Test
    void getElementTest() {
        int[][] b = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] a = {{13,14,15},{16,17,18},{19,20,21},{22,23,24}};
        int currentResult = new SumOfTwoMatrices(a,b).getElement(3,2);
        Assert.assertEquals(36,currentResult);
    }
}