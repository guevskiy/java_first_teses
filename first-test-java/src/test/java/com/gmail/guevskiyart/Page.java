package com.gmail.guevskiyart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page extends Base{

    public Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}
