package com.sky.hooks;

import com.sky.browserFactory.Browser;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class StepHooks {

    private Browser browser;
    private WebDriver driver;

    public StepHooks(Browser browser) {
        this.browser = browser;
    }

    @Before
    public void setUPTest(){
        this.driver = browser.initialiseBrowser();
    }

    @After
    public void tearDownTest(){
        browser.cleanBrowser();
    }
}
