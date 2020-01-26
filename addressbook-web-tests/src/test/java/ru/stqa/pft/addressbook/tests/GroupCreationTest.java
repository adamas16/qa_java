package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.GroupHelper;
import ru.stqa.pft.addressbook.appmanager.NavigationHelper;
import ru.stqa.pft.addressbook.appmanager.SessionHelper;
import ru.stqa.pft.addressbook.model.GlobalVars;

public class GroupCreationTest extends TestBase{
    public WebDriver driver;
    @Test
    public void testGroupCreationTests() throws Exception {

        SessionHelper.autoLogin("admin","secret");
        NavigationHelper.gotoGroupPage();
        GroupHelper.initGroupCreation();
        GroupHelper.fillGroupForm(new GlobalVars("test1", "test2", "test3"));
        GroupHelper.submitGroupCreation();
        NavigationHelper.gotoMainPageAndLogout();

    }


}
