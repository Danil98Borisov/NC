package shapesNC;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getAreaFromNegativeHeight() {
        Shape currentBase = new Triangle(-1,1);

        Assert.assertEquals(0.5,currentBase.getArea(),0);
    }

    @Test
    void getAreaFromNegativeBase() {
        Shape currentBase = new Triangle(1,-1);

        Assert.assertEquals(0.5,currentBase.getArea(),0);
    }

    @Test
    void getAreaFromNormalHeightAndBase() {
        Shape currentBase = new Triangle(2,3);

        Assert.assertEquals(3,currentBase.getArea(),0);
    }

    @Test
    void getAreaFromNullHeight() {
        Shape currentBase = new Triangle(0,1);

        Assert.assertEquals(0,currentBase.getArea(),0);
    }

    @Test
    void getAreaFromNullBase() {
        Shape currentBase = new Triangle(1,0);

        Assert.assertEquals(0,currentBase.getArea(),0);
    }

}