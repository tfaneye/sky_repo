package com.sky.page_objects;

import com.sky.util.Config;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }



    public HomePage loadHomePage() {
        String baseUrl = Config.getTestData("base.url");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().to(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.switchTo().frame("sp_message_iframe_474555");
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/button[2]")).click();
        driver.switchTo().defaultContent();
        return PageFactory.initElements(driver, HomePage.class);
    }
}
