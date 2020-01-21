package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    public static WebDriver driver;

    public HelperBase(WebDriver driver){
        this.driver = driver;
    }

    public static void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public static void click(By locator) {
        driver.findElement(locator).click();
    }
}
