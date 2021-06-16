package com.sky.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(linkText = "Deals")
    private WebElement dealElement = null;

    @FindBy(linkText = "Sign in")
    private WebElement signInElement = null;

    @FindBy(className = "search-toggle__icon")
    private WebElement searchElement = null;

    @FindBy(xpath = "//*[@id=\"masthead-navigation\"]/div/div[1]/div[2]/div/div/div/div/div/div/div/input")
    private WebElement searchFieldElement = null;

    @FindBy(linkText = "Sky Shop")
    private WebElement editorialTitleElement = null;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public DealPage navigateToDealPage(){
        dealElement.click();

        return PageFactory.initElements(driver, DealPage.class);
    }

    public SignInPage goToSignInPage(){
        signInElement.click();
        return PageFactory.initElements(driver, SignInPage.class);

    }

    public HomePage searchForItem(String item){
        searchElement.click();
        searchFieldElement.sendKeys(item);

        //submitSearchElement.click();
        return PageFactory.initElements(driver, HomePage.class);

    }

    public String validateSearch(){

        return editorialTitleElement.getText();

    }

}
