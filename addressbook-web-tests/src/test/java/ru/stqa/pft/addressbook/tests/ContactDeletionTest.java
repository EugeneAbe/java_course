package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {

    @Test
    public void testContactDeletion() {

        app.getNavigationHelper().gotoHome();
        app.getContactHelper().chooseFirstContact();
        app.getContactHelper().clickDelete();
        app.getContactHelper().closeAlert();
    }
}
