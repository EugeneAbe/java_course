package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.fillFormAddContact;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    protected void addContactTab() {
        click(By.linkText("add new"));
    }

    public void fillContactForm(fillFormAddContact fillFormAddContact) {
        type(By.name("firstname"), fillFormAddContact.getContactFirstName());
        type(By.name("lastname"), fillFormAddContact.getContactLastName());
        type(By.name("middlename"), fillFormAddContact.getContactMidName());
        type(By.name("address"), fillFormAddContact.getContactAddress());
        type(By.name("home"), fillFormAddContact.getContactHomePhone());
        type(By.name("email"), fillFormAddContact.getContactEmail());
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
}
