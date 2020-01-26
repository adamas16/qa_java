package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.GroupHelper;
import ru.stqa.pft.addressbook.appmanager.NavigationHelper;
import ru.stqa.pft.addressbook.appmanager.SessionHelper;
import ru.stqa.pft.addressbook.model.GlobalVars1;

public class ContactModificationTest extends TestBase {
    @Test
    public void testContactModification(){
        SessionHelper.autoLogin("admin", "secret");
        NavigationHelper.selectContactForEdit("Романов","Дмитрий");
        GroupHelper.fillContactForm(new GlobalVars1("Дмитрий_edited", "Сергеевич_edited","Романов_edited","","","","","","","","","","","","","10","July","1234","16","November","2018","test1","","",""));
        GroupHelper.updateForm();
        NavigationHelper.gotoMainPageAndLogout();
    }
}
