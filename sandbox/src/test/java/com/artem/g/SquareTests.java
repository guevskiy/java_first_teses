package com.artem.g;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testArea_01() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25);
    }

    @Test
    public void testArea_02() {
        Square s = new Square(6);
        Assert.assertEquals(s.area(), 36);
    }

    @Test
    public void testArea_03() {
        Square s = new Square(8);
        Assert.assertEquals(s.area(), 64);
    }

    @Test
    public void testArea_04() {
        Square s = new Square(10);
        Assert.assertEquals(s.area(), 100);
    }

}
