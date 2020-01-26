package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;


import java.util.concurrent.TimeUnit;

public class ApplicationManager{

    public static WebDriver driver;

    //private WaitConditions waitConditions;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;

    public ApplicationManager() {
        sessionHelper = new SessionHelper(driver);
    }

    @AfterMethod
    public static void quit(){
        driver.quit();
    }

    public void init() {
        driver = new ChromeDriver();
       // waitConditions = new WaitConditions(driver);
        groupHelper = new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper (driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
