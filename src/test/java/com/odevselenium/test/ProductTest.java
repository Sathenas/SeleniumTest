package com.odevselenium.test;

import com.odevselenium.driver.BaseTest;
import com.odevselenium.page.LoginPage;
import com.odevselenium.page.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {
    @Test
    public void productTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        loginPage.login();
        productPage.selectProduct();
    }
    @Test
    public void getAttributeTest(){
        ProductPage productPage = new ProductPage();
        productPage.attributeTest();
    }
    @Test
    public void getTextTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        loginPage.login();
        productPage.textControl();
    }
    @Test
    public void valueTest(){
        ProductPage productPage = new ProductPage();
        productPage.valueControl();
    }
}
