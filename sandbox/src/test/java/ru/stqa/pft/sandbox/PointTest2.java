package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.rft.Point;

public class PointTest2 {

  @Test

  public void testDistance() {

    Point p;
    p = new Point(2,-1,0,3);
    Assert.assertEquals(p.distance(),5.0);


  }
}
