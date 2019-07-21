package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.rft.Square;

public class SquareTests {
  @Test


  public void testArea(){

    Square s;
    s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);

  }
}
