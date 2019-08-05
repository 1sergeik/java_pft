package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupDeletionTests extends TestBase{

  @Test
  public void testGroupDelition() {
    gotoGroupPage();
    selectGroup();
    deletSelectedGroups();
    gotoGroupPage();
    gotoHomePage();
    logout();
  }

}
