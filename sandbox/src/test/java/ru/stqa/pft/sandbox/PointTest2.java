package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.rft.Point;

public class PointTest2 {

  @Test

  public void testDistance() {

    Point p1;
    p1 = new Point(-5,8);
    Point p2;
    p2 = new Point (-14,20);
    Assert.assertEquals(p1.distance(p1,p2),15.0);


  }
}
