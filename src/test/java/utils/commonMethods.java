package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class commonMethods {
//    OpenBrowser
public static WebDriver driver;
@BeforeMethod(alwaysRun = true)
    public void openBrowser(){
    String url = "http://localhost:7080/login";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }
//    closBrowser
    
    
@AfterMethod(alwaysRun = true)
public void closeBrowser(){
    driver.quit();
}

//sendKeys
public void sendKeys(WebElement element, String text){
    element.clear();
    element.sendKeys(text);
}

}
