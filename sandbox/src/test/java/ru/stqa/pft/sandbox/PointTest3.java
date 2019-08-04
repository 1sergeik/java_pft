package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.rft.P1;

public class PointTest3 {

  @Test

  public void testDistance() {

    P1 p;
    p = new P1(100,-55,94,-63);
    Assert.assertEquals(p.distance(),10.0);


  }
}
