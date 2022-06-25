package pages.HotelsPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class SignUp extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SignUp.class);

    @FindBy(id ="gc-custom-header-nav-bar-acct-menu")
    private WebElement signIn;

    @FindBy(css="a[data-stid=\"link-header-account-signup\"]")
    private WebElement signUp;

    @FindBy(css="input[type=\"email\"]")
    private WebElement email;

    @FindBy(css="input[name=\"firstName\"]")
    private WebElement firstName;

    @FindBy(css="input[name=\"lastName\"]")
    private WebElement lastName;

    @FindBy(css="input[name=\"password\"]")
    private WebElement password;

    @FindBy(css="button[id=\"signupFormSubmitButton\"]")
    private WebElement continueBtn;

    public SignUp(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickSignIn(){
        click(signIn);
        LOG.info("clicked");
    }

    public void clickSignUp(){
        click(signUp);
        LOG.info("clicked");
    }

    public void typeEmail(String textEmail){
        type(email,textEmail);
        LOG.info("email entered");
    }

    public void typeName(String name){
        type(firstName,name);
        LOG.info("first name entered");
    }

    public void typeLastName(String surName){
        type(lastName,surName);
        LOG.info("last name entered");
    }

    public void typePassword(String textPassword) {
        type(password,textPassword);
        LOG.info("password entered");
    }

    public void clickContinue(){
        click(continueBtn);
        LOG.info("clicked");
    }

}