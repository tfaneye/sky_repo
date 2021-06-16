package com.sky.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;

public class DealPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"root\"]/section[1]/div/div/div[1]/div/div[1]/div/div[2]/div/span")
    private WebElement dealOneElement = null;

    @FindBy(xpath = "//*[@id=\"root\"]/section[1]/div/div/div[2]/div/div[1]/div/div[2]/div/span")
    private WebElement dealTwoElement = null;

    @FindBy(xpath = "//*[@id=\"root\"]/section[1]/div/div/div[3]/div/div[1]/div/div[2]/div/span")
    private WebElement dealThreeElement = null;

    public DealPage(WebDriver driver) {
        super(driver);
    }

    public String validatePage(){
        return driver.getCurrentUrl();
    }

    public Map<String, String> getDealsPrice(){
        String dealOnePrice = dealOneElement.getText();
        String dealTwoPrice = dealTwoElement.getText();
        String dealThreePrice = dealThreeElement.getText();
        Map<String, String> loadPrice = new HashMap<>();
        loadPrice.put("PriceOne", dealOnePrice);
        loadPrice.put("PriceTwo", dealTwoPrice);
        loadPrice.put("PriceThree", dealThreePrice);

        return loadPrice;




    }
}
