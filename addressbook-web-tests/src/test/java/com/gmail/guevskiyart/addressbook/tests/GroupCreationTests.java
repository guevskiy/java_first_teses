package com.gmail.guevskiyart.addressbook.tests;

import com.gmail.guevskiyart.addressbook.model.GroupData;
import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation(){
        app.getNavigationHelper().gotoGroupPage();

        int nn = app.getGroupHelper().getCountOfExistingGroups();

        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(nn, new GroupData("group_name", "header", "footer"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
