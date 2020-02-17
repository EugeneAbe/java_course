package ru.stqa.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.addressbook.model.fillFormAddContact;

public class ContactCreate extends TestBase{


    @Test
    public void testContactCreate() throws Exception {

        app.getNavigationHelper().gotoAddNewPage();
        app.getContactHelper().fillContactForm(new fillFormAddContact("Joseph", "Wissarionowich", "Stalin", "Tbilisi", "777", "stalin@mail.ru"));
        app.getContactHelper().clickEnter();

    }


}
