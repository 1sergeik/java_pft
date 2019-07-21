package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.rft.Point;

public class PointTest {

  @Test

  public void testDistance() {

    Point p;
    p = new Point(3,-1,0,3);
    Assert.assertEquals(p.distance(),5.0);


  }
}
