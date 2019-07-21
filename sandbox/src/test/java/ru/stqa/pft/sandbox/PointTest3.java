package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.rft.Point;

public class PointTest3 {

  @Test

  public void testDistance() {

    Point p;
    p = new Point(100,-55,94,-63);
    Assert.assertEquals(p.distance(),10.0);


  }
}
