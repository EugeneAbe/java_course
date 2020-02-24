package ru.stqa.pft.addressbook.tests;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.fillFormAddContact;

public class ContactCreateTest extends TestBase{


    @Test
    public void testContactCreate() throws Exception {

        app.getNavigationHelper().gotoAddNewPage();
        app.getContactHelper().fillContactForm(new fillFormAddContact("Joseph",
                "Wissarionowich", "Stalin",
                "Tbilisi", "777",
                "stalin@mail.ru", "Beatles"), true);
        app.getContactHelper().clickEnter();

    }


}
