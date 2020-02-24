package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactModificationTest extends TestBase {

    @Test
    public void testContactModification() {
        app.getNavigationHelper().gotoHome();
        if (! app.getContactHelper().isThereAContact()) {
            app.getNavigationHelper().gotoGroupPage();
            if (! app.getGroupHelper().isThereAGroup()) {
                app.getGroupHelper().createGroup(new GroupData("Beatles", "RingoStar", "Paul Maccartney"));
            }
            app.getContactHelper().createContact(new ContactData("Joseph",
                    "Wissarionowich", "Stalin",
                    "Tbilisi", "777",
                    "stalin@mail.ru", "Beatles"));
        }
        app.getContactHelper().clickEdit();
        app.getContactHelper().fillContactForm(new ContactData("Victor",
                "Zoy", "Robertowich", "Saint Petersburg",
                "8-800-555-35-35", "zoyushka@yandex.ru", null), false);
        app.getContactHelper().clickUpdate();
    }
}
