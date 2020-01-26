package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.NavigationHelper;
import ru.stqa.pft.addressbook.appmanager.SessionHelper;

public class ContactDeletionTest extends TestBase {

    @Test

    public void testContactModification(){
        SessionHelper.autoLogin("admin", "secret");
        NavigationHelper.selectContactForDelete("Романов_edited","Дмитрий_edited");
        NavigationHelper.gotoMainPageAndLogout();
    }
}
