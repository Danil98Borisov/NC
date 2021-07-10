package shapesNC;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getNegativeRadius() {
        Shape currentResult = new Circle( - 1.0);

        Assert.assertEquals(Math.PI, currentResult.getArea(),0);
    }

    @Test
    void getAreaFromUnitRadius() {
        Shape currentResult = new Circle( 1.0);

        Assert.assertEquals(Math.PI, currentResult.getArea(),0);
    }

    @Test
    void getAreaFromNullRadius() {
        Shape currentResult = new Circle( 0);

        Assert.assertEquals(0, currentResult.getArea(),0);
    }
}