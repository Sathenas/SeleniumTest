package com.odevselenium.test;

import com.odevselenium.driver.BaseTest;
import com.odevselenium.page.HomePage;
import org.junit.Test;

public class HomeTest extends BaseTest {

    @Test
    public void homeTest(){
        HomePage homePage= new HomePage();

        homePage.home();
    }

}
