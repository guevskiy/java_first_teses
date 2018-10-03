package com.gmail.guevskiyart.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager{
    private WebDriver driver;

    private SessionHelper sessionHelper;
    private GroupHelper groupHelper;
    private NavigationHelper navigationHelper;

    public void init() {
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        //driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver. get("http://allintradeone.com/app");
        driver. get("http://addressbook:8087/index.php");
        groupHelper = new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        driver.quit();
    }

    public void loginTrade(String admin, String secret) {
        driver.findElement(By.name("login")).sendKeys(admin);
        driver.findElement(By.name("password")).sendKeys(secret);

        driver.findElement(By.cssSelector("button.confirmbutton")).click();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
