package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    initAddNewContact();
    fillContactForm(new ContactData("Eva", "Semenovna", "Petrova", "Ekaterinburg, Vilonova 6 - 7", "+791290999198", "PetrovaEva@ya.ru"));
    submitNewContact();
    gotoHome();
  }

}
