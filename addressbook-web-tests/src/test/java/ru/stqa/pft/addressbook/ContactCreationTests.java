package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactCreationTests {
  private WebDriver dw;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    dw = new FirefoxDriver();
    dw.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    login("admin", "secret");
  }

  private void login(String username, String password) {
    dw.get("http://localhost/addressbook/");
    dw.findElement(By.name("user")).click();
    dw.findElement(By.name("user")).clear();
    dw.findElement(By.name("user")).sendKeys(username);
    dw.findElement(By.id("LoginForm")).click();
    dw.findElement(By.name("pass")).click();
    dw.findElement(By.name("pass")).clear();
    dw.findElement(By.name("pass")).sendKeys(password);
    dw.findElement(By.xpath("//input[@value='Login']")).click();
  }


  @Test
  public void testContactCreation() throws Exception {
    gotoContactCreationForm();
    fillContactCreationForm(new ContactData("Sergei", "Koryakin", "+79218462210", "1sergeik@gmail.com"));
    submitContactCreation();
    returnHomePage();
    logout();
  }

  private void logout() {
    dw.findElement(By.linkText("Logout")).click();
  }

  private void returnHomePage() {
    dw.findElement(By.linkText("home")).click();
  }

  private void submitContactCreation() {
    dw.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
  }

  private void fillContactCreationForm(ContactData contactData) {
    dw.findElement(By.name("firstname")).click();
    dw.findElement(By.name("firstname")).clear();
    dw.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
    dw.findElement(By.name("lastname")).click();
    dw.findElement(By.name("lastname")).clear();
    dw.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
    dw.findElement(By.name("mobile")).click();
    dw.findElement(By.name("mobile")).clear();
    dw.findElement(By.name("mobile")).sendKeys(contactData.getMobile());
    dw.findElement(By.name("email")).click();
    dw.findElement(By.name("email")).clear();
    dw.findElement(By.name("email")).sendKeys(contactData.getEmail());
  }

  private void gotoContactCreationForm() {
    dw.findElement(By.linkText("add new")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    dw.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      dw.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      dw.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
