package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.GroupHelper;
import ru.stqa.pft.addressbook.appmanager.NavigationHelper;
import ru.stqa.pft.addressbook.appmanager.SessionHelper;
import ru.stqa.pft.addressbook.model.GlobalVars;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification (){

        SessionHelper.autoLogin("admin", "secret");
        NavigationHelper.gotoGroupPage();
        GroupHelper.timeout(2);
        GroupHelper.selectGroup("selected[]",""); // groupName = "selected[]", groupXpath"//input[@title='Select (test1)']"
        GroupHelper.initGroupModification();
        GroupHelper.fillGroupForm(new GlobalVars("test1_edited", "test2_edited", "test3_edited"));
        GroupHelper.updateForm();
        NavigationHelper.gotoMainPageAndLogout();



    }

}
