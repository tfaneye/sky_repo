package com.sky.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

    @FindBy(id = "username")
    private WebElement usernameElement = null;

    @FindBy(id = "password")
    private WebElement passwordElement = null;

    @FindBy(id = "signinButton")
    private WebElement signInButtonElement = null;

    @FindBy(tagName = "li")
    private WebElement mesageElement = null;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public SignInPage enterSignInDetails(String username, String password){

        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        signInButtonElement.click();

        return PageFactory.initElements(driver, SignInPage.class);


    }

    public String validateSignIn(){
        return mesageElement.getText();

    }
}
