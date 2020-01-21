package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.GroupHelper;
import ru.stqa.pft.addressbook.appmanager.NavigationHelper;
import ru.stqa.pft.addressbook.appmanager.SessionHelper;

public class GroupDeletionTest extends TestBase{
    @Test
    public static void testGroupDeletion(){
        SessionHelper.autoLogin("admin", "secret");
        NavigationHelper.gotoGroupPage();
        GroupHelper.selectGroup();
        GroupHelper.deleteGroupPage();
        NavigationHelper.gotoGroupPage();
        SessionHelper.logout();

    }

}
