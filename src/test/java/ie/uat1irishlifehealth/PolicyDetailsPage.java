package ie.uat1irishlifehealth;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PolicyDetailsPage {

    WebDriver pDriver;

    public PolicyDetailsPage(WebDriver pDriver){
        this.pDriver = pDriver;
        PageFactory.initElements(pDriver, this);
    }

    @FindBy(xpath = "//*[@id=\"startDate\"]")
    WebElement startDate;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]/a")
    WebElement selectDate;

    @FindBy(xpath = "//*[@id=\"p_lt_ctl00_pageplaceholder_p_lt_ctl00_F_01PolicyDetails_plcUp_holderTitle\"]")
    WebElement title;

    @FindBy(id = "firstNameHolder")
    WebElement firstName;

    @FindBy(id = "surnameHolder")
    WebElement surName;

    @FindBy(id = "emailHolder")
    WebElement email;

    @FindBy(id = "mobileHolder")
    WebElement mobileNumber;

    @FindBy(id = "dobHolder")
    WebElement dateOfBirth;

    @FindBy(xpath = "//*[@id=\"p_lt_ctl00_pageplaceholder_p_lt_ctl00_F_01PolicyDetails_sys_pnlUpdate\"]/div[3]/article/div/section[2]/div[10]/div[2]/label[2]")
    WebElement radioButtonNo;

    @FindBy(xpath = "//*[@id=\"p_lt_ctl00_pageplaceholder_p_lt_ctl00_F_01PolicyDetails_plcUp_btnContinueToPayment\"]")
    WebElement getYourQuote;


    @Step("Click on start date")
    public void selectStartDate(){
        startDate.click();
    }

    @Step("Select the date")
    public void selectDate(){
        WebDriverWait wait = new WebDriverWait(pDriver,20);
        wait.until(ExpectedConditions.elementToBeClickable(selectDate));
        selectDate.click();
    }

    @Step("Enter title")
    public void selectTitle(String useTitle){
        Select selectTitle = new Select(title);
        selectTitle.selectByVisibleText(useTitle);
    }

    @Step("Enter first name")
    public void enterFirstName(String useFirstName){
        firstName.sendKeys(useFirstName);
    }

    @Step("Enter surname")
    public void enterSurname(String useSurName){
        surName.sendKeys(useSurName);
    }

    @Step("Enter email address")
    public void enterEmailAddress(String useEmail){
        email.sendKeys(useEmail);
    }

    @Step("Enter mobile number")
    public void enterMobileNumber(String useMobileNumber){
        mobileNumber.sendKeys(useMobileNumber);
    }

    @Step("Enter date of birth")
    public void enterDateOfBirth(String useDOB){
        dateOfBirth.sendKeys(useDOB);
    }

    @Step("Clikc on no radio button")
    public void selectRadioButton(){
        radioButtonNo.click();
    }

    @Step("Click on get your quote button")
    public void clickOnGetQuote(){
        getYourQuote.click();
    }



}
