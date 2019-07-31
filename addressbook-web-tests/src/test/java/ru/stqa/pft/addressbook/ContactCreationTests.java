package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactCreationTests {
  private WebDriver wd;


  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testContactCreation() throws Exception {
    wd.get("http://localhost/addressbook/");
    wd.findElement(By.xpath("//body")).click();
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys("admin");
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys("secret");
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Пароль:'])[1]/following::input[2]")).click();
    wd.findElement(By.linkText("Добавить контакт")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Адрес:'])[1]/following::input[1]")).click();
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys("Sergei");
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys("Koryakin");
    wd.findElement(By.name("nickname")).clear();
    wd.findElement(By.name("nickname")).sendKeys("SergeiK");
    wd.findElement(By.name("title")).clear();
    wd.findElement(By.name("title")).sendKeys("engineer");
    wd.findElement(By.name("company")).clear();
    wd.findElement(By.name("company")).sendKeys("Xelicon");
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys("Moskow");
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys("+79218462210");
    wd.findElement(By.name("theform")).click();
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys("");
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Примечание:'])[1]/following::input[1]")).click();
    wd.findElement(By.linkText("Выйти")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();

  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }


}
