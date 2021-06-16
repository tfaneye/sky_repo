package com.sky.browserFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {

    protected static WebDriver driver;


    public WebDriver initialiseBrowser(){

        BrowserStore bs = new BrowserStore();
        this.driver = bs.CreateBrowser();

        return driver;
    }

    public static WebDriver getDriver(){
        return driver;
    }


    public void cleanBrowser(){
        if(driver != null){
            driver.quit();
        }
    }
}
