package pages.TutorialsNinjaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegisterAccountPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(RegisterAccountPage.class);

    @FindBy(css="#input-firstname")
    private WebElement registrationFirstNameInputBar;

    @FindBy(css="#input-lastname")
    private WebElement registrationLastNameInputBar;

    @FindBy(css="#input-email")
    private WebElement registrationEmailInputBar;

    @FindBy(css="#input-telephone")
    private WebElement registrationTelephoneInputBar;

    @FindBy(css="#input-password")
    private WebElement registrationPasswordInputBar;

    @FindBy(css="#input-confirm")
    private WebElement registrationConfirmPasswordInputBar;

    @FindBy(xpath="//*[@id='content']/form/div/div/input[1]")
    private WebElement privacyPolicyCheckBox;

    @FindBy(css="input[class='btn btn-primary']")
    private WebElement registrationContinueButton;

    @FindBy(xpath="//*[@id='content']/h1")
    private WebElement registrationHeadingText;

    public RegisterAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void typeFirstNameForRegistration(String firstName){
        type(registrationFirstNameInputBar, firstName);
        LOG.info("success typing first name into input bar");
    }

    public void typeLastNameForRegistration(String lastName){
        type(registrationLastNameInputBar, lastName);
        LOG.info("success typing last name into input bar");
    }

    public void typeEmailForRegistration(String emailAddress){
        type(registrationEmailInputBar, emailAddress);
        LOG.info("success typing email address into input bar");
    }

    public void typeTelephoneForRegistration(String telephone){
        type(registrationTelephoneInputBar, telephone);
        LOG.info("success typing phone number into input bar");
    }

    public void typePasswordForRegistration(String password){
        type(registrationPasswordInputBar, password);
        LOG.info("success typing registration password into input bar");
    }

    public void typeConfirmPasswordForRegistration(String password){
        type(registrationConfirmPasswordInputBar, password);
        LOG.info("success typing confirmation password into input bar");
    }

    public void clickCheckBoxForPrivacyPolicy(){
        click(privacyPolicyCheckBox);
        LOG.info("success flagging privacy policy box");
    }

    public void clickContinueRegistrationButton(){
        click(registrationContinueButton);
        LOG.info("success clicking registration continue button");
    }

    public String getRegistrationHeader() {
        return getElementText(registrationHeadingText);
    }








}
