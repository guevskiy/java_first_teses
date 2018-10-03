package com.gmail.guevskiyart.addressbook.tests;

import org.testng.annotations.Test;

public class TestTestTest extends TestBase {

    @Test
    public void testTestTest() throws InterruptedException {
        //driver. get("http://allintradeone.com/app");
        Thread.sleep(3000);
        app.loginTrade("aio5", "12345");
        Thread.sleep(4000);

    }

}
