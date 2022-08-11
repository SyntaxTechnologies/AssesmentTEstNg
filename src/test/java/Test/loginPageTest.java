package Test;

import Pages.loginPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.commonMethods;

public class loginPageTest extends commonMethods {

    @Test
    public  void loginSuccessful(){
//        create object of loginPage
        loginPage login=new loginPage();
//        send password
        sendKeys(login.userNameField,"tomsmith");
//        send Password
        sendKeys(login.passwordField,"SuperSecretPassword!");

//        login
        login.loginBtn.click();

//        get the Succes Message
        String actualMsg = login.succesMsg.getText();

//        Expected Success Message
        String expectedMsg="Welcome to the Secure Area. When you are done click logout below.";

//        assertions
        Assert.assertEquals(actualMsg,expectedMsg);
    }

    @Test
    public void InvalidCredentials(){
        loginPage login= new loginPage();

        sendKeys(login.passwordField,"SuperSecretPassword!");

        sendKeys(login.userNameField,"tom");
        login.loginBtn.click();;

        String actualMsg = login.errorMsg.getText();

        String expectedMsg="Your username is invalid!\n"+"×";

        System.out.println(expectedMsg);

        SoftAssert soft =new SoftAssert();
       soft.assertEquals(actualMsg,expectedMsg);
       soft.assertAll();


    }
}
