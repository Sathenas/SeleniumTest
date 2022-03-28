package com.odevselenium.page;

import com.odevselenium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {
    Methods methods ;
    Logger logger = LogManager.getLogger(ProductPage.class);
    public ProductPage(){
        methods = new Methods();
    }
    public void selectProduct(){
        methods.sendKeys(By.id("search-input"),"Oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.scrollWithAction(By.xpath("//*[@id=\"product-596239\"]/div[1]/div[2]/a/span"));
        methods.click(By.xpath("//*[@id='product-570901']/div[2]/div[3]/a[5]/i"));
        methods.click(By.xpath("//*[@id=\"product-596239\"]/div[2]/div[3]/a[4]/i"));
        methods.click(By.xpath("//*[@id=\"product-602280\"]/div[2]/div[3]/a[4]/i"));
        methods.click(By.xpath("//*[@id=\"product-602282\"]/div[2]/div[3]/a[4]/i"));

        methods.click(By.cssSelector("div[class='menu top my-list']>ul>li>a"));

        methods.click(By.xpath("//*[@id='header-top']/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));

        methods.click(By.xpath("//*[@id='header-bottom']/div/div[2]/a"));

        methods.click(By.cssSelector(".lvl1catalog>a"));

        methods.click(By.xpath("//*[@id='landing-point']/div[4]/a[2]/img"));

        methods.selectByText(By.cssSelector("div[class='sort']>select"),"Yüksek Oylama");

        methods.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/ul/li[1]/div[2]/ul/li[3]/span"));

        methods.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/ul/li[1]/div[2]/ul/li[3]/div/div[1]/div/ul[2]/li[14]/a"));

        methods.click(By.xpath("//*[@id=\"product-544545\"]/div[3]/div/a/img"));
        methods.click(By.xpath("//*[@id=\"button-cart\"]"));

        methods.click(By.cssSelector("div[class='menu top my-list']>ul>li>a"));

        methods.click(By.xpath("//*[@id='header-top']/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));

        methods.click(By.xpath("//*[@id=\"product-596239\"]/div[2]/div[3]/a[3]/i"));

        methods.click(By.xpath("//*[@id=\"cart\"]/div[1]"));

        methods.click(By.xpath("//*[@id=\"js-cart\"]"));

        methods.clearUrun(By.cssSelector("input[style='width:22px']"),"2");

        methods.click(By.cssSelector("i[class='fa fa-refresh green-icon']"));

        methods.click(By.xpath("//*[@id=\"cart_module\"]/div[4]/div[1]/a"));

        methods.click(By.xpath("//*[@id=\"shipping-tabs\"]/a[2]"));

        methods.sendKeys(By.xpath("//*[@id=\"address-firstname-companyname\"]"),"Arda");

        methods.sendKeys(By.xpath("//*[@id=\"address-lastname-title\"]"),"Soykarafakılı");

        methods.selectByText(By.xpath("//*[@id=\"address-zone-id\"]"),"Ankara");

        methods.selectByText(By.xpath("//*[@id=\"address-county-id\"]"),"Çankaya");

        methods.sendKeys(By.xpath("//*[@id=\"district\"]"),"ÇAYYOLU MAH");

        methods.sendKeys(By.xpath("//*[@id=\"address-address-text\"]"),"BAHÇELİEVLER");

        methods.sendKeys(By.xpath("//*[@id=\"address-postcode\"]"),"06810");

        methods.sendKeys(By.xpath("//*[@id=\"address-telephone\"]"),"3122417294");

        methods.sendKeys(By.xpath("//*[@id=\"address-mobile-telephone\"]"),"505752525");
        methods.sendKeys(By.xpath("//*[@id=\"address-tax-id\"]"),"33865878514");
        methods.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        methods.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        methods.click(By.xpath("//*[@id=\"logo\"]/a/img"));




    }




    public void attributeTest(){
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
        System.out.println("Alınan text = " +attribute);
        logger.info("Alınan text = " +attribute);
        methods.waitBySeconds(2);
    }
    public void textControl(){
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan text = " + text);
        logger.info("Alınan text = " + text);
    }
    public void valueControl(){
        methods.sendKeys(By.id("search-input"),"testinium");
        String value = methods.getValue(By.id("search-input"));
        System.out.println("Alınan text:" + value);
        logger.info("Alınan text :" + value);
        Assert.assertEquals("testinium",value);
        methods.waitBySeconds(3);
    }
}
