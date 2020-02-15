package ru.stqa.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.addressbook.model.fillFormAddContact;

public class ContactCreate {
    private WebDriver wd;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        wd = new ChromeDriver();
        //driver = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login("admin", "secret");
    }

    @Test
    public void testContactCreate() throws Exception {
        addContactTab();
        fillFormAddContact(new fillFormAddContact("Doink", "Clown", "The", "Lipetzk,17", "777", "doink@mail.ru"));
        logout();
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        wd.quit();
    }

    private void login(String userLogin, String userPassword) {
        wd.get("http://localhost/addressbook/");
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(userLogin);
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(userPassword);
        wd.findElement(By.xpath("//input[@value='Login']")).click();
    }


    private void logout() {
        wd.findElement(By.id("logo")).click();
        wd.findElement(By.linkText("Logout")).click();
    }

    private void fillFormAddContact(fillFormAddContact fillFormAddContact) {
        wd.findElement(By.name("firstname")).sendKeys(fillFormAddContact.getContactFirstName());
        wd.findElement(By.name("lastname")).sendKeys(fillFormAddContact.getContactLastName());
        wd.findElement(By.name("middlename")).sendKeys(fillFormAddContact.getContactMidName());
        wd.findElement(By.name("address")).sendKeys(fillFormAddContact.getContactAddress());
        wd.findElement(By.name("home")).sendKeys(fillFormAddContact.getContactHomePhone());
        wd.findElement(By.name("email")).sendKeys(fillFormAddContact.getContactEmail());
        wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    private void addContactTab() {
        wd.findElement(By.linkText("add new")).click();
    }

    private boolean isElementPresent(By by) {
        try {
            wd.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

}
