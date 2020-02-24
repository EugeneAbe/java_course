package ru.stqa.pft.addressbook.tests;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreateTest extends TestBase{


    @Test
    public void testContactCreate() throws Exception {

        app.getNavigationHelper().gotoAddNewPage();
        app.getContactHelper().createContact(new ContactData("Jogan",
                "Sebastjan", "Bach",
                "Groznii", "777",
                "musician@mail.ru", "Beatles"));
    }


}
