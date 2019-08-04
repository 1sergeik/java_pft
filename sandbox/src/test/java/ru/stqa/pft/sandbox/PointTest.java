package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.rft.Point;

public class PointTest {

  @Test

  public void testDistance() {

    Point p1;
    p1 = new Point(3,-1);
    Point p2;
    p2 = new Point (0,3);
    Assert.assertEquals(p1.distance(p1,p2),5.0);


  }
}
