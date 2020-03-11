package ru.stqa.pft.addressbook.tests;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactCreateTest extends TestBase{


    @Test
    public void testContactCreate() throws Exception {

        app.getNavigationHelper().gotoGroupPage();
        if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("Beatles", "RingoStar", "Paul Maccartney"));
        }
        app.getNavigationHelper().gotoAddNewPage();
        app.getContactHelper().createContact(new ContactData("Jogan",
                "Sebastjan", "Bach",
                "Groznii", "777",
                "musician@mail.ru", "Beatles"));
    }


}
