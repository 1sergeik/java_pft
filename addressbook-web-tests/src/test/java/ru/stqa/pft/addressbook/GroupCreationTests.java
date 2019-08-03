package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupCreationTests {
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
  public void testGroupCreation() throws Exception {

    gotoGroupPage();
    initNewGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitNewGroupCreation();
    returnGroupPage();
    logout();
  }

  private void logout() {
    dw.findElement(By.linkText("Logout")).click();
  }

  private void returnGroupPage() {
    dw.findElement(By.linkText("groups")).click();
  }

  private void submitNewGroupCreation() {
    dw.findElement(By.name("submit")).click();
  }

  private void fillGroupForm(GroupData groupData) {
    dw.findElement(By.name("group_name")).click();
    dw.findElement(By.name("group_name")).clear();
    dw.findElement(By.name("group_name")).sendKeys(groupData.getName());
    dw.findElement(By.name("group_header")).click();
    dw.findElement(By.name("group_header")).clear();
    dw.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    dw.findElement(By.name("group_footer")).click();
    dw.findElement(By.name("group_footer")).clear();
    dw.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  private void initNewGroupCreation() {
    dw.findElement(By.name("new")).click();
  }

  private void gotoGroupPage() {
    dw.findElement(By.linkText("groups")).click();
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
