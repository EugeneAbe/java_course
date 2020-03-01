package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactHelper extends HelperBase {

    private ApplicationManager applicationManager;

    public ContactHelper(ApplicationManager applicationManager) {
        super(applicationManager.wd);
        this.applicationManager = applicationManager;
    }

    protected void addContactTab() {
        click(By.linkText("add new"));
    }

    public void fillContactForm(ContactData fillFormAddContact, boolean creation) {
        type(By.name("firstname"), fillFormAddContact.getContactFirstName());
        type(By.name("lastname"), fillFormAddContact.getContactLastName());
        type(By.name("middlename"), fillFormAddContact.getContactMidName());
        type(By.name("address"), fillFormAddContact.getContactAddress());
        type(By.name("home"), fillFormAddContact.getContactHomePhone());
        type(By.name("email"), fillFormAddContact.getContactEmail());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(fillFormAddContact.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void clickEnter() {
        click(By.name("submit"));
    }

    public void clickEdit() {
        click(By.xpath("//img[@alt='Edit']"));

    }

    public void clickUpdate() {
        click(By.name("update"));
    }

    public void chooseFirstContact() {
        click(By.name("selected[]"));

    }

    public void clickDelete() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void createContact(ContactData contact) {
        applicationManager.getNavigationHelper().gotoAddNewPage();
        fillContactForm(contact, true);
        clickEnter();
        applicationManager.getNavigationHelper().gotoHome();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }
}
