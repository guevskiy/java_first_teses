package com.gmail.guevskiyart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {
    WebDriver driver;
    Actions action;


    public void inicializeDriver(){
        driver = new ChromeDriver();
        action = new Actions(driver);
    }
}
