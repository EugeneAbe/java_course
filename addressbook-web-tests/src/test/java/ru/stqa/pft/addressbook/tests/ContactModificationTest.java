package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.HelperBase;
import ru.stqa.pft.addressbook.model.fillFormAddContact;

public class ContactModificationTest extends TestBase {

    @Test
    public void testContactModification() {

        app.getContactHelper().clickEdit();
        app.getContactHelper().fillContactForm(new fillFormAddContact("Victor", "Zoy", "Robertowich", "Saint Petersburg", "8-800-555-35-35", "zoyushka@yandex.ru"));
        app.getContactHelper().clickUpdate();
    }
}
