package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.GlobalVars;
import ru.stqa.pft.addressbook.model.GlobalVars1;

public class GroupHelper extends HelperBase{
    public static String UrlAddress = "https://localhost/addressbook";

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public static void fillContactForm(GlobalVars1 globalVars1) {
        type(By.name("firstname"), globalVars1.getName());
        driver.findElement(By.name("middlename")).clear();
        driver.findElement(By.name("middlename")).sendKeys(globalVars1.getPatronymic());
        type(By.name("lastname"), globalVars1.getSurname());
        type(By.name("nickname"), globalVars1.getNickname());
        driver.findElement(By.name("title")).clear();
        driver.findElement(By.name("title")).sendKeys(globalVars1.getTitle());
        type(By.name("company"), globalVars1.getCompany());
        type(By.name("address"), globalVars1.getAddress());
        type(By.name("home"), globalVars1.getHome());
        type(By.name("mobile"), globalVars1.getMobile());
        type(By.name("work"), globalVars1.getWorkPhone());
        type(By.name("fax"), globalVars1.getFax());
        type(By.name("email"), globalVars1.getMail1());
        type(By.name("email2"), globalVars1.getMail2());
        type(By.name("email3"), globalVars1.getMail3());
        type(By.name("homepage"), globalVars1.getHomepage());
        click(By.name("bday"));
        new Select(driver.findElement(By.name("bday"))).selectByVisibleText(globalVars1.getbDay());
        click(By.name("bmonth"));
        new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText(globalVars1.getbMonth());
        click(By.name("bmonth"));
        type(By.name("byear"), globalVars1.getbYear());
        click(By.name("aday"));
        new Select(driver.findElement(By.name("aday"))).selectByVisibleText(globalVars1.getaDay());
        click(By.name("amonth"));
        new Select(driver.findElement(By.name("amonth"))).selectByVisibleText(globalVars1.getaMonth());
        click(By.name("amonth"));
        type(By.name("ayear"), globalVars1.getaYear());
        click(By.name("new_group"));
        new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(globalVars1.getGroupContact());
        click(By.name("new_group"));
        type(By.name("address2"), globalVars1.getAddress2());
        type(By.name("phone2"), globalVars1.getPhone2());
        type(By.name("notes"), globalVars1.getNotes());
    }

    public static void selectGroup() {
        click(By.name("selected[]"));
    }

    public static void deleteGroupPage() {
        click(By.name("delete"));
    }

    public static void timeout(Integer second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void initGroupCreation() {
        click(By.name("new"));
    }

    public static void fillGroupForm(GlobalVars globalVars) {
        type(By.name("group_name"), globalVars.getName());
        type(By.name("group_header"), globalVars.getHeader());
        type(By.name("group_footer"), globalVars.getFooter());
    }

    public static void submitGroupCreation() {
        click(By.name("submit"));
    }

    public static void submitContactCreation() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }
}
