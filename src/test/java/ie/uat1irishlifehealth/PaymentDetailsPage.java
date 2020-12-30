package ie.uat1irishlifehealth;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentDetailsPage {

    WebDriver pDriver;

    public PaymentDetailsPage(WebDriver pdriver){
        this.pDriver=pdriver;
        PageFactory.initElements(pdriver,this);
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div[4]/div[4]/aside/div[1]/div/div[1]/div[3]/button")
    WebElement priceButton;
    //*[@id="form"]/div[4]/div[4]/aside/div[1]/div/div[1]/div[3]/button


    @Step("Click on pricebreak down button")
    public void clickOnPriceButton(){
        WebDriverWait wait = new WebDriverWait(pDriver,20);
        wait.until(ExpectedConditions.elementToBeClickable(priceButton));
        priceButton.click();
    }
}
