package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver ilhDriver;

    //Invoking browser
    public static WebDriver openBrowser(WebDriver driver, String browserName, String getURL){
        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(getURL);
            return driver;
        }else if(browserName.equalsIgnoreCase("IE")){
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(getURL);
            return driver;
        }else if(browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(getURL);
            return driver;
        }else if(browserName.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(getURL);
            return driver;
        }
        return null;
    }

    //take time stamp
    public String timeStamp(){
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

    //Taking screen shot
    public void takeScreenShot(String fileName, WebDriver driver) throws IOException{
        String dateNow = timeStamp().replace(":","_");
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("C:\\Users\\navee\\Desktop\\Ulster-University-Final-Sem-Project\\ScreenShots\\"+fileName
                +dateNow+".png");
        FileUtils.copyFile(srcFile, destFile);
    }

    //Implicitly waiting for an element on the page
    public void implicitlyWait(){
        ilhDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void pageTearDown(WebDriver driver){
        driver.quit();

    }
}
