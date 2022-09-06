package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to00then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to04then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 2;
        int x2 = 0;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when57to12then6dot403() {
        double expected = 6.403;
        int x1 = 5;
        int y1 = 7;
        int x2 = 1;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when102to93then80dot006() {
        double expected = 80.006;
        int x1 = 10;
        int y1 = 2;
        int x2 = 90;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}