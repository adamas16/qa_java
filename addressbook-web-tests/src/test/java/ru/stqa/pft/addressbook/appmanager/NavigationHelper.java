package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public static void gotoMainPageAndLogout() {
        click(By.xpath("//li/a[text()='home']"));
        click(By.linkText("Logout"));
    }

    public static void gotoGroupPage() {
        click(By.linkText("groups"));
    }

    public static void gotoContactPage() {
        click(By.linkText("add new"));
    }
}
