package shapesNC;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EllipseTest {

    @Test
    public void getAreaFromNormalAAndB() {
        Shape currentA = new Ellipse(3,4);

        Assert.assertEquals(12* Math.PI,currentA.getArea(),0);

    }

    @Test
    public void getAreaFromNegativeA() {
        Shape currentA = new Ellipse(-1,1);

        Assert.assertEquals(Math.PI,currentA.getArea(),0);

    }

    @Test
    public void getAreaFromNegativeB() {
        Shape currentB = new Ellipse(1,-1);

        Assert.assertEquals(Math.PI,currentB.getArea(),0);
    }
    @Test
    public void getAreaFromNullA() {
        Shape currentA = new Ellipse(0,1);

        Assert.assertEquals(0,currentA.getArea(),0);

    }

    @Test
    public void getAreaFromNullB() {
        Shape currentB = new Ellipse(1, 0);

        Assert.assertEquals(0, currentB.getArea(), 0);
    }
}