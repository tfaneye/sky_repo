package com.sky.support;

import com.sky.browserFactory.Browser;
import com.sky.page_objects.BasePage;
import com.sky.page_objects.HomePage;
import org.openqa.selenium.support.PageFactory;

public class WorldHelper extends Browser {
    private BasePage basePage;
    private HomePage homePage;

    public BasePage getBasePage() {
        if(basePage == null)
            basePage = new BasePage(driver);
        return basePage;
    }

    public HomePage getHomePage() {
        if (homePage == null)
            homePage = PageFactory.initElements(driver, HomePage.class);
        return homePage;

    }
}
