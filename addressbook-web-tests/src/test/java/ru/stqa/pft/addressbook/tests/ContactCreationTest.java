package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.GroupHelper;
import ru.stqa.pft.addressbook.appmanager.NavigationHelper;
import ru.stqa.pft.addressbook.appmanager.SessionHelper;
import ru.stqa.pft.addressbook.model.GlobalVars1;

public class ContactCreationTest extends TestBase {

    @Test
    public static void testContactCreation() {
        SessionHelper.autoLogin("admin", "secret");
        NavigationHelper.gotoContactPage();
        GroupHelper.fillContactForm(new GlobalVars1("Дмитрий", "Сергеевич", "Романов", "arrnel", "title", "Roseltorg", "Russia", "Home", "random mobile", "random phone", "random fax", "mail@mail.mail", "mail@mail.mail", "mail@mail.mail", "random.org.page", "2", "October", "1111", "12", "October", "1111", "test1", "home", "1111111111", "random"));
        GroupHelper.timeout(5);
        GroupHelper.submitContactCreation();
        NavigationHelper.gotoMainPageAndLogout();
    }
}
