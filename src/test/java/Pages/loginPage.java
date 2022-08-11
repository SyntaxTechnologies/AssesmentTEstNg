package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.commonMethods;

public class loginPage extends commonMethods {
    @FindBy(id="username")
    public WebElement userNameField;


    @FindBy(id="password")
    public WebElement passwordField;


    @FindBy(xpath="//button[@type='submit']")
    public WebElement loginBtn;

    @FindBy(className = "subheader")
    public WebElement succesMsg;


    @FindBy(id = "flash")
    public WebElement errorMsg;

    public loginPage(){
        PageFactory.initElements(driver,this);

    }
//   8:50

}
