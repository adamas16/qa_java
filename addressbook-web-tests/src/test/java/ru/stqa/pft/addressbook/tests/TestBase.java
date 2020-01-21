package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {


    public ApplicationManager app = new ApplicationManager();

    @AfterClass(alwaysRun = true)
    public static void tearDown() throws Exception {
        ApplicationManager.quit();
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }


}
