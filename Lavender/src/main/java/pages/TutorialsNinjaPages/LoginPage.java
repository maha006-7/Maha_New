package pages.TutorialsNinjaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(LoginPage.class);


    @FindBy(css = "#input-email")
    private WebElement enterEmailAddress;

    @FindBy(css = "#input-password")
    private WebElement enterPassword;

    @FindBy(xpath = "//*[@id='content']/div/div[2]/div/form/input")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id='content']/div/div[1]/div/a")
    private WebElement continueRegistrationButton;

    @FindBy(xpath = "//*[@id='content']/div/div[2]/div/form/div[2]/a")
    private WebElement forgottenPasswordButton;

    @FindBy(xpath="//*[@id='content']/div/div[2]/div/h2")
    private WebElement returningUserLoginText;

    @FindBy(xpath="//*[@id='account-login']/div[1]")
    private WebElement warningMessageAlert;

    @FindBy(xpath= "//*[@id='content']/h1")
    private WebElement forgotPasswordHeading;


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterEmailAddressToLogin(String emailAddress) {
        type(enterEmailAddress, emailAddress);
        LOG.info("success typing email address");
    }

    public void enterPasswordToLogin(String password) {
        type(enterPassword, password);
        LOG.info("success typing in password");
    }

    public void clickLoginButton() {
        click(loginButton);
        LOG.info("success clicking login button");
    }

    public void clickContinueRegistrationButton(){
        click(continueRegistrationButton);
        LOG.info("success clicking continue registration button");
    }

    public void clickForgottenPasswordButton() {
        click(forgottenPasswordButton);
        LOG.info("success clicking forgotten password button");
    }

    public String returningUserHeading(){
        return getElementText(returningUserLoginText);
    }

    public boolean passwordAlertDisplay() {
        return warningMessageAlert.isDisplayed();
    }

    public String forgotPasswordHeading(){
        return getElementText(forgotPasswordHeading);
    }



}
