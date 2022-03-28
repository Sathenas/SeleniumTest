package com.odevselenium.test;

import com.odevselenium.driver.BaseTest;
import com.odevselenium.page.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
}