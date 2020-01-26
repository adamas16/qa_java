package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class NavigationHelper extends HelperBase {

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

    public static void selectContactForEdit(String surname, String name) {
        String fXpath = ("//td[text()='" + surname + "']/following-sibling::td[text()='" + name + "']/following-sibling::td[@class='center']//img[@title='Edit']").toString();
        WebElement contactString = driver.findElement(By.xpath(fXpath));
        System.out.println("XPath = " + fXpath);
        contactString.click();
    }

    public static void selectContactForDelete(String surname, String name) {
        String fXpath = ("//td[text()='" + surname + "']/following-sibling::td[text()='" + name + "']/ancestor::tr/td/input[@title='Select ("+ name + " " + surname +")']").toString();
        WebElement contactString = driver.findElement(By.xpath(fXpath));
        System.out.println("XPath = " + fXpath);
        contactString.click();
        click(By.xpath("//input[@value='Delete']"));
        driver.switchTo().alert().accept();
    }
}
