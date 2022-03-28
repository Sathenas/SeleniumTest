package com.odevselenium.page;

import com.odevselenium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;
    public LoginPage(){
        methods = new Methods();
    }

    public void login(){
        methods.click(By.cssSelector(".menu-top-button.login>a"));
        methods.sendKeys(By.id("login-email"),"arda.soykarafakili@testinium.com");
        methods.sendKeys(By.id("login-password"),"1331107337");
        methods.click(By.cssSelector("div[class='ky-form-buttons']>button"));
        methods.waitBySeconds(50);





    }
}

