package com.gmail.guevskiyart.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    private WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoGroupPage() {
        System.out.println(driver.manage().window().getSize());
        driver.findElement(By.linkText("groups")).click();
    }
}
