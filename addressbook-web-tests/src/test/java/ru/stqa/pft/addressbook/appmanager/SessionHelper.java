package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    private ApplicationManager applicationManager;

    public SessionHelper(ApplicationManager applicationManager) {
        super(applicationManager.wd);
        this.applicationManager = applicationManager;
    }

    public void login(String userName, String password) {
        wd.get("http://localhost/addressbook/");
        type(By.name("user"), userName);
        type(By.name("pass"), password);
        click(By.xpath("//input[@value='Login']"));
    }
}
