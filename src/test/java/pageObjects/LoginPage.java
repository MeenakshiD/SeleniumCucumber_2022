package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class LoginPage {

    WebDriver Idriver;

    public LoginPage(WebDriver rdriver) {

        Idriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }

    @FindBy(id = "Email")
    @CacheLookup
    WebElement txtUserName;

    @FindBy(id = "Password")
    @CacheLookup
    WebElement txtPassword;


    @FindBy(xpath = "//*[@type='submit']")
    @CacheLookup
    WebElement txtLoginbtn;


    //@FindBy(linkText = "Logout")
    @FindBy(xpath ="//a[@class='nav-link'][@href='/logout']")
    @CacheLookup
    WebElement txtLogoutbtn;



    public void setTxtUserName(String uName) {
        txtUserName.clear();
        txtUserName.sendKeys(uName);

    }

    public void setTxtPassword(String pwd) {
        txtPassword.clear();
        txtPassword.sendKeys(pwd);
        Idriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //rdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void setTxtLoginbtn() {

        txtLoginbtn.click();

    }

    public void setTxtLogoutbtn(){

        txtLogoutbtn.click();

    }
}

