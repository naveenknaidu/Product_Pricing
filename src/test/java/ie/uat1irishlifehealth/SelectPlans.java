package ie.uat1irishlifehealth;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SelectPlans {

    WebDriver sDriver;

    public SelectPlans(WebDriver sDriver){
        this.sDriver = sDriver;
        PageFactory.initElements(sDriver, this);
    }

//    @FindBy(linkText = "Get a quote")
//    List<WebElement> getAQuoteButtons;

    @FindBy(xpath = "//*[@id=\"plnUpdateResults\"]/section/div[1]/div[1]/header/a")
    WebElement getQuoteOne;

    @FindBy(xpath = "//*[@id=\"plnUpdateResults\"]/section/div[1]/div[2]/header/a")
    WebElement getQuoteTwo;

    @FindBy(xpath = "//*[@id=\"plnUpdateResults\"]/section/div[1]/div[3]/header/a")
    WebElement getQuoteThree;

    @Step("Selecting the quote button as per customer surname")
    public void clickOnGetAQuote(String number){
        if (number.equalsIgnoreCase("1")){
            getQuoteOne.click();
        }else if (number.equalsIgnoreCase("2")){
            getQuoteTwo.click();
        }else if (number.equalsIgnoreCase("3")){
            getQuoteThree.click();
        }




    }
}
