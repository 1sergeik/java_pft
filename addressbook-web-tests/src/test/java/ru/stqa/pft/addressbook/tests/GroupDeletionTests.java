package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDelition() {
    app.gotoGroupPage();
    app.selectGroup();
    app.deletSelectedGroups();
    app.gotoGroupPage();
    app.gotoHomePage();
    app.logout();
  }

}
