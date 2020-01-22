package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public static String UrlAddress = "https://localhost/addressbook";

    public static void autoLogin(String login, String password) {
        driver.get(UrlAddress);
        type(By.name("user"),login);
        type(By.name("pass"), password);
        click(By.xpath("//input[@value='Login']"));
    }

    public static void logout() {
        ApplicationManager.driver.findElement(By.linkText("Logout")).click();
    }
}
