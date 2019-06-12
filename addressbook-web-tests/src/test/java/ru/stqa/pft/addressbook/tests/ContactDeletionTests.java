package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {


  @Test
  public void testContactDeletionTests() throws Exception {
    app.getContactHelper().selectedContact();
    app.getContactHelper().deletedContact();
    app.getContactHelper().assertDeletedContact();
    app.getNavigationHelper().gotoHomePage();
  }


}
