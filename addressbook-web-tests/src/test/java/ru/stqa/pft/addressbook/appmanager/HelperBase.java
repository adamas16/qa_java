package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

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
    public static void clickWithVisibility(By locator, String text) {
        click(locator);
        selectClick(locator,text);
    }

    public static void click(By locator) {
        driver.findElement(locator).click();
    }

    public static void selectClick(By locator, String text){
        new Select(driver.findElement(locator)).selectByVisibleText(text);
    }
}
