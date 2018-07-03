package com.gmail.guevskiyart;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class FirstTest {
     WebDriver driver = new ChromeDriver();
    Actions action = new Actions(driver);

//    MainPage page = new MainPage(driver);

    @Before
    public  void setUp() {
       System.setProperty("webdriver.chrome.driver", "E:\\My documents\\first-test-java\\chromedriver.exe");

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        //driver.get("http://allintradeone.com/login");
        driver.get("http://executeautomation.com/demosite/Dragging.html");
    }

    @After
    public void tearDoun() {
        driver.quit();
    }

    //-------------------------------------------------------
    @Test
    public void TestTest_DnD_001() throws InterruptedException {
       Thread.sleep(2000);

       action.moveToElement(driver.findElement(By.cssSelector("#item4")))
               .clickAndHold()
               .moveByOffset(0, -80)
               .release().perform();

        Thread.sleep(4000);
    }

    @Test
    public void TestTest_DnD_002() throws InterruptedException {
        Thread.sleep(2000);

        action.moveToElement(driver.findElement(By.cssSelector("#item4")))
                .clickAndHold()
                .moveByOffset(0, -80)
                .release().perform();

        Thread.sleep(2000);

        action.moveToElement(driver.findElement(By.cssSelector("#item5")))
                .clickAndHold()
                .moveByOffset(0, -80)
                .release().perform();

        Thread.sleep(2000);

        action.moveToElement(driver.findElement(By.cssSelector("#item3")))
                .clickAndHold()
                .moveByOffset(0, -80)
                .release().perform();

        Thread.sleep(4000);

    }


//    @FindBy(css = "app-security-table-row div.sec-table-row")
//    public WebElement row;

    public  WebElement marketModuleRow(int nn){
        return driver.findElements(By.cssSelector("app-security-table-row div.sec-table-row")).get(nn);
    }

    public  WebElement chart(int nn){
        return driver.findElements(By.cssSelector("split-area.comp")).get(nn);
    }

    @FindBy(css = "split-area.comp.chart-active")
    public WebElement chartActive;

    @Test
    public void Test_01() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\My documents\\first-test-java\\chromedriver.exe");

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");

        driver.findElement(By.cssSelector("input#lst-ib")).sendKeys("заработать миллион");
        Thread.sleep(1000);
//        input[value = 'Поиск в Google']
        driver.findElement(By.cssSelector("input[value = 'Поиск в Google']")).click();
        Thread.sleep(4000);
    }

    @Test
    public void Login() throws InterruptedException {
        logGin();
        Thread.sleep(4000);

    }

    @Test
    public void firstTest() {
        logGin();

        selectCategory("Bonds");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Test_1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\My documents\\first-test-java\\chromedriver.exe");

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("http://dev.allintradeone.com/login");
//        driver.get("http://localhost:4200/login");

        logGin();
        Thread.sleep(4000);

//        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.cssSelector("div.resize-right svg g")))
                .moveByOffset(-300, 0)
                .release().perform();

        Thread.sleep(3000);

        action.clickAndHold(chart(2)).moveByOffset(10,10).release()
                .perform();

//        action.clickAndHold(marketModuleRow(3)).moveToElement(chartActive).release().perform();

//        action.dragAndDrop(marketModuleRow(3), chartActive).perform();
        Thread.sleep(4000);


        selectCategory("Bonds");
//        splitSelectMarket(5);
        logoutAndSave("001");
        Thread.sleep(4000);

//        logGin();
//        Thread.sleep(3000);
//        splitSelectMarket(4);
//        logoutAndSave("0012");
    }

    @Test
    public void Test_resizeTest() throws InterruptedException {
        logGin();
        Thread.sleep(2000);

        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.cssSelector("div.resize-right svg g")))
                .moveByOffset(-1200, 0)
                .release().perform();
        Thread.sleep(2000);
        //selectAccount(1);
        userCase_SelectSortingColumn("Morning nominal value");
        Thread.sleep(4000);
//        logoutAndSave("001");
//        Thread.sleep(2000);

//        logGin();
//        Thread.sleep(2000);
//        action.clickAndHold(driver.findElement(By.cssSelector("div.resize-right svg g")))
//                .moveByOffset(-800, 0)
//                .release().perform();
        //selectAccount(0);
        Thread.sleep(4000);
    }

    @Test
    public void secondTest2() throws InterruptedException {
        logGin();

        Thread.sleep(2000);

        action.clickAndHold(driver.findElement(By.cssSelector("div.resize-right svg g")))
                .moveByOffset(-1400, 0)
                .release().perform();

        System.out.println(column_Name(5).getText());
        for (int i = 0; i < 16; i++){
            ColumnSortableIcon(i).click();
            Thread.sleep(1000);
        }

        Thread.sleep(3000);
    }

    //---------------------------------------------------
    @Test
    public void simpleTest_if() throws InterruptedException {

//        for (int i = 0; i<15; i++   )
//        {
//            System.out.print( i);
//            if (i == nn){
//                System.out.println( " Да, я загадал число " + i);
//            } else {
//                System.out.println(" - не то число");
//            }
//        }
        methodPerebora(7);

        for (int i = 0; i<25; i++) {
            System.out.print("-");
        }

        methodPerebora(3);

    }

    public void methodPerebora (int nn) {
        for (int i = 0; i<15; i++)
        {
            System.out.print( i);
            if (i == nn){
                System.out.println(" Да, я загадал число " + i);
            } else {
                System.out.println(" - не то число");
            }
        }
    }

    //---------------------------------------------------------------------

    public WebElement ColumnSortableIcon(int nn)
    {
        return driver.findElements(By.cssSelector("app-user-case-datatable thead th")).get(nn).findElement(By.cssSelector("div.ui-column-main div:nth-child(3) span"));
    }

    public WebElement column_Name(int nn)
    {
        return driver.findElements(By.cssSelector("app-user-case-datatable thead th")).get(nn).findElement(By.cssSelector("div.ui-column-main div:nth-child(2) span"));
    }

    public void userCase_SelectSortingColumn(String ColumnName)
    {
        int count = driver.findElements(By.cssSelector("app-user-case-datatable thead th")).size();
        String name;
               for (int i = 0; i < count; i++)
        {
            name = column_Name(i).getText();
            System.out.println(name);
           if (column_Name(i).getText() == "Currency") System.out.println(i + " - Эврика!!!");

        }
    }

    public void logGin(){

        driver.findElement(By.name("login")).sendKeys("aio5");
        driver.findElement(By.name("password")).sendKeys("12345");

        driver.findElement(By.cssSelector("div.confirmbuttondiv button")).click();
    }

    public void selectCategory(String name) {
        driver.findElement(By.cssSelector("button.btn.categories-select-btn.dropdown-toggle.picker")).click();
        driver.findElement(By.linkText(name)).click();
    }

    public void selectAccount(int nn) {
        driver.findElement(By.cssSelector("button.btn.account-select-btn.dropdown-toggle.picker")).click();
        driver.findElements(By.cssSelector("button.btn.account-select-btn.dropdown-toggle.picker ~ ul li")).get(nn).click();
    }

    public void logoutAndSave(String layoutName) {
        driver.findElement(By.cssSelector("div.logoutbtn")).click();
        driver.findElement(By.cssSelector("input.layout-input")).sendKeys(layoutName);
        driver.findElement(By.cssSelector("button.dialog-logout-btn-y")).click();
    }

    public void logoutWithoutSave() {
        driver.findElement(By.cssSelector("div.logoutbtn")).click();
        driver.findElement(By.cssSelector("button.dialog-logout-btn-n")).click();
    }

    public void splitSelectMarket(int nn) {
        driver.findElement(By.cssSelector("div.resize-container-market app-split-select div.split-icon")).click();
        driver.findElements(By.cssSelector("app-split-select div.splitselectarea div div")).get(nn).click();
    }

    public void splitSelectMarket() {

    }

}


