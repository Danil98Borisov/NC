package shapesNC;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getAreaFromNegativeC() {
        Shape currentC = new Square(-1);

        Assert.assertEquals(1,currentC.getArea(),0);
    }

    @Test
    void getAreaFromNormalC() {
        Shape currentC = new Square(5);

        Assert.assertEquals(25,currentC.getArea(),0);
    }

    @Test
    void getAreaFromNullC() {
        Shape currentC = new Square(0);

        Assert.assertEquals(0,currentC.getArea(),0);
    }
}
