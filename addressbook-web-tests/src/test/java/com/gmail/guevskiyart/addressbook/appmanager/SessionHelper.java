package com.gmail.guevskiyart.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper {
    WebDriver driver;

    public SessionHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String admin, String secret) {
        driver.findElement(By.name("user")).sendKeys(admin);
        driver.findElement(By.name("pass")).sendKeys(secret);

        driver.findElement(By.cssSelector("input[value='Login']")).click();
    }
}
