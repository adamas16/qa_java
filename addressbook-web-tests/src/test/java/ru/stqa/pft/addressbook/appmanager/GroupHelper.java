package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GlobalVars;
import ru.stqa.pft.addressbook.model.GlobalVars1;

public class GroupHelper extends HelperBase{


    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public static void fillContactForm(GlobalVars1 globalVars1) {
        type(By.name("firstname"), globalVars1.getName());
        type(By.name("middlename"), globalVars1.getPatronymic());
        type(By.name("lastname"), globalVars1.getSurname());
        type(By.name("nickname"), globalVars1.getNickname());
        type(By.name("title"),globalVars1.getTitle());
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
        clickWithVisibility(By.name("bday"),globalVars1.getbDay());
        clickWithVisibility(By.name("bmonth"),globalVars1.getbMonth());
        type(By.name("byear"), globalVars1.getbYear());
        clickWithVisibility(By.name("aday"),globalVars1.getaDay());
        click(By.name("amonth"));
        clickWithVisibility(By.name("amonth"),globalVars1.getaMonth());
        type(By.name("ayear"), globalVars1.getaYear());
        checkGroupListInContactModificationForm(globalVars1, "списка группы", "//select[@name=\"new_group\"]");
        type(By.name("address2"), globalVars1.getAddress2());
        type(By.name("phone2"), globalVars1.getPhone2());
        type(By.name("notes"), globalVars1.getNotes());
        timeout(5);
    }

    public static void checkGroupListInContactModificationForm(GlobalVars1 globalVars1, String nameElement, String locator) {
        try
        {
            if(driver.findElement(By.xpath(locator)).isDisplayed() )
            {
                clickWithVisibility(By.xpath(locator), globalVars1.getGroupContact());
                click(By.xpath(locator));
            }
        }
        catch(Exception e)
        {
            System.out.println("Элемент " + nameElement + " не отображен");
        }
    }


    public static void selectGroup(String groupName,String groupXPAth) {

        if (groupName == "" && groupXPAth.length()>0 ){
            click(By.xpath(groupXPAth));
        }
        else if(groupName.length()>0 && groupXPAth == "") {
            click(By.name(groupName));
        }else{
        System.out.println("Выбери либо xpath, либо name");
        driver.quit();
            }
    }

    public static void updateForm(){
        click(By.xpath("//input[@name=\"update\"]"));
    }

    public static void deleteGroup() {
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

    public static void initGroupModification() {
        click(By.name("edit"));
    }

}
