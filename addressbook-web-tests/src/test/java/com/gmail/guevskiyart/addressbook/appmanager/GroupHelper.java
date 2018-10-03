package com.gmail.guevskiyart.addressbook.appmanager;

import com.gmail.guevskiyart.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper {
    private WebDriver driver;

    public GroupHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
        driver.findElement(By.cssSelector("input[value='Enter information']")).click();
    }

    public void fillGroupForm(int nn, GroupData groupData) {
        driver.findElement(By.name("group_name")).sendKeys(groupData.getGroup_name() + " " + (nn+1));
        driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader() + " " + (nn+1));
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter() + " " + (nn+1));
    }

    public int getCountOfExistingGroups() {
        return driver.findElements(By.cssSelector("span.group")).size();
    }

    public void initGroupCreation() {
        driver.findElement(By.cssSelector("input[value='New group']")).click();
    }

    public void deleteSelectedGroups() {
        driver.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        driver.findElements(By.cssSelector("input[type='checkbox']")).get(0).click();
    }
}
