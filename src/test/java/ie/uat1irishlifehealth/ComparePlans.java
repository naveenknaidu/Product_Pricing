package ie.uat1irishlifehealth;


import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComparePlans {

    WebDriver cDriver;


    public ComparePlans(WebDriver cDriver){
        this.cDriver = cDriver;
        PageFactory.initElements(cDriver,this);
    }

    @FindBy(linkText = "Compare plans")
    WebElement compareStep;

    @Step("Clicking on the compare step button")
    public void clickOnCompareStep(){
        compareStep.click();
    }
}
