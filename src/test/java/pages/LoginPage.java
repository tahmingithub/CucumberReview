package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage  extends CommonMethods {
    @FindBy(id="txtUsername")
    //Or
    //@FindBy(xpath =)
    public WebElement usernameTextField;

    @FindBy(id="txtPassword")
    public WebElement passwordTextField;

    @FindBy(id="btnLogin")
    public WebElement loginBtn;

    @FindBy(xpath = "//span[@id='spanMessage']")
    public WebElement actualErrorMessage;




    public LoginPage() {
        //our this code will initialize all the elements of the page
        //bcoz when the object creates ,constructor will be called which will
        //initialize all of these elements
        PageFactory.initElements(driver,this);


    }
}