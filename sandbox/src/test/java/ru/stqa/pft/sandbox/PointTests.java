package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  private void testDistanceWithPlus(){
    Point p1 = new Point(4,5);
    Point p2 = new Point(1, 6);
    Assert.assertEquals(p2.distance(p1), 3.1622776601683795);
  }

  @Test
  private void testDistanceWithMinus(){
    Point p1 = new Point(-1, -1);
    Point p2 = new Point(-5, -6);
    Assert.assertEquals(p2.distance(p1), 6.4031242374328485);
  }

  @Test
  private void testDistanceWithZeros(){
    Point p1 = new Point(0, 0);
    Point p2 = new Point(0, 0);
    Assert.assertEquals(p2.distance(p1), 0.0);
  }
}
