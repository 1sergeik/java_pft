package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.rft.P1;

public class PointTest2 {

  @Test

  public void testDistance() {

    P1 p;
    p = new P1(2,-1,0,3);
    Assert.assertEquals(p.distance(),5.0);


  }
}
