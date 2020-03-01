package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {

    private ApplicationManager applicationManager;

    public NavigationHelper(ApplicationManager applicationManager) {
        super(applicationManager.wd);
        this.applicationManager = applicationManager;
    }

    public void gotoGroupPage() {
        if (isElementPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))) {
            return;
        } else {
            click(By.linkText("groups"));
        }

    }

    public void gotoAddNewPage() {
        if ((isElementPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Edit / add address book entry")
                && wd.findElement(By.name("submit")).getText().equals("Enter"))) {
            return;
        }
        click(By.linkText("add new"));
    }

    public void gotoHome() {
        if (isElementPresent(By.id("maintable"))) {
            return;
        }
        click(By.linkText("home"));
    }
}
