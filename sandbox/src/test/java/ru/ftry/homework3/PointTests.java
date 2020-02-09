package ru.ftry.homework3;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ftry.homework2.Point;

public class PointTests {

    //проверка gпри плюсовых значениях точек
    @Test
    public void testCalcDistancePlus() {
        Point p1 = new Point(11,22, 1, 2);
        Assert.assertEquals(p1.distance(), 22.360679774997898);
    }

    //проверка минусовых значениях точек
    @Test
    public void testCalcDistanceMinus() {
        Point p1 = new Point(-11,-22, -1, -2);
        Assert.assertEquals(p1.distance(), 22.360679774997898);
    }

    //проверка при нулевом значении точки
    @Test
    public void testCalcDistanceZeroPoint() {
        Point p1 = new Point(0,0, 1, 1);
        Assert.assertEquals(p1.distance(), 1.4142135623730951);
    }

    //проверка одинаковых значений точки
    @Test
    public void testCalcDistanceZero() {
        Point p1 = new Point(1,1, 1, 1);
        Assert.assertEquals(p1.distance(), 0.0);
    }
    
}
