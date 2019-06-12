package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.initAddNewContact();
    app.getContactHelper().fillContactForm(new ContactData("Eva", "Semenovna", "Petrova", "Ekaterinburg, Vilonova 6 - 7", "+791290999198", "PetrovaEva@ya.ru"));
    app.submitNewContact();
    app.gotoHome();
  }

}
