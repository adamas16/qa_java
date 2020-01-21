package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(WebDriver driver) {
        super(driver);
    }


    public static void autoLogin(String login, String password) {
        type(By.name("user"),login);
        type(By.name("pass"), password);
        click(By.xpath("//input[@value='Login']"));
    }

    public static void logout() {
        ApplicationManager.driver.findElement(By.linkText("Logout")).click();
    }
}
