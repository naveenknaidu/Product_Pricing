package ie.uat1irishlifehealth;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    WebDriver hDriver;


    public HomePage(WebDriver hDriver){
        this.hDriver = hDriver;
        PageFactory.initElements(hDriver,this);
    }

    @FindBy(linkText = "Next step")
    WebElement nextStep;

    @Step("Clicking on the next step button")
    public void clickOnNextStep(){
        nextStep.click();
    }
}
