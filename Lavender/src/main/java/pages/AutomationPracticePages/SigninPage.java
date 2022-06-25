package pages.AutomationPracticePages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SigninPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(SigninPage.class);
    @FindBy (xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    private WebElement signinbtn;
    @FindBy ( xpath = "//input[@id='email']")
       private WebElement email;



    @FindBy ( xpath = "//input[@id='passwd']")
    private WebElement password;
    @FindBy (xpath = "//*[@id='SubmitLogin']/span")
    private WebElement finalSigninbtn;
    @FindBy (xpath = "//a[@class='account']/span")
    private WebElement headerText;
    @FindBy (xpath = "//*[@id=\"center_column\"]/div[1]/ol/li")
    private WebElement signinError;
    @FindBy (xpath = "//*[@id=\"login_form\"]/div/p[1]/a")
    private WebElement forgotPassword;
    @FindBy (xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/fieldset/div/input")
    private WebElement forgotPasswordEmail;
    @FindBy (xpath = "//*[@id=\"form_forgotpassword\"]/fieldset/p/button/span")
    private WebElement retrievePassword;
    @FindBy ( xpath = "//*[@id=\"center_column\"]/ul/li/a/span")
    private WebElement backToLogin;
    @FindBy (xpath = "//*[@id=\"center_column\"]/div/p")
    private WebElement confirmationPassword;
    public SigninPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public String getHeaderText(){

        return getElementText(headerText);
    }
    public void clickSignin(){
        click(signinbtn);
        LOG.info("Click on sign in btn successful");
    }
    public void typeEmail(String item){
        type(email,item);
        LOG.info("Type email successful");
    }
    public void typePassword(String item){
        type(password,item);
        LOG.info("Type email successful");
    }
    public void clickFinalSignin(){
        click(finalSigninbtn);
        LOG.info("Click on final sign in btn successful");
    }
    public String getSigninError(){
        return getElementText(signinError);
    }
    public String clickForgotPassword(){
        return getElementText(forgotPassword) ;
    }
    public void typeForgotPasswordEmail(String item){
        type(forgotPasswordEmail,item);
        LOG.info("Type forgot password successful");
    }
    public void clickRetrievePassword(){
        click(retrievePassword);
        LOG.info("Click on retrive password successful");
    }
    public void clickBackToLogin(){
        click(backToLogin);
        LOG.info("Click on back to login");
    }
    public String getConfirmationPassword(){
        return getElementText(confirmationPassword);
    }


    }




