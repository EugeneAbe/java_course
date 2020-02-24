package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactDeletionTest extends TestBase {

    @Test
    public void testContactDeletion() {
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
        app.getContactHelper().chooseFirstContact();
        app.getContactHelper().clickDelete();
        app.getContactHelper().closeAlert();
    }
}
