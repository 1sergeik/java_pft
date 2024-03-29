package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase{

  public SessionHelper(FirefoxDriver wd) {

    super(wd);
  }
  public void login(String username, String password) {
    type(By.name("user"), username);
    type(By.name("pass"),password );

    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    click(By.xpath("//input[@value='Login']"));
  }
}
