package com.gmail.guevskiyart.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase  {
    @Test
    public void testGroupDeletion(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();

    }

    @Test
    public void testGroupCount(){
        app.getNavigationHelper().gotoGroupPage();
        int nn = app.getGroupHelper().getCountOfExistingGroups();
        Assert.assertEquals(15, nn);
    }

    @Test
    public void testWindowSize(){
        String sz = app.getNavigationHelper().getWindowSize();
        Assert.assertEquals("size", sz);
    }

}
