package pages.TutorialsNinjaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EditInformationPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(EditInformationPage.class);

    @FindBy(css="#input-firstname")
    private WebElement firstNameInputBar;

    @FindBy(css="#input-lastname")
    private WebElement lastNameInputBar;

    @FindBy(css="#input-email")
    private WebElement emailInputBar;

    @FindBy(css="#input-telephone")
    private WebElement telephoneInputBar;

    @FindBy(xpath="//*[@id='content']/form/div/div[2]/input")
    private WebElement continueButtonInEditInformationPage;

    @FindBy(xpath="//*[@id='account-edit']/ul/li[3]/a")
    private WebElement editInformationTab;

    @FindBy(css="div[class='alert alert-success alert-dismissible']")
    private WebElement updatedAccountInformationAlert;


    public EditInformationPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterFirstNameInEditAccountInformation(String firstName){
        type(firstNameInputBar, firstName);
        LOG.info("first name entered success");
    }

    public void enterLastNameInEditAccountInformation(String lastName){
        type(lastNameInputBar, lastName);
        LOG.info("last named entered success");
    }

    public void enterEmailInEditAccountInformation(String email){
        type(emailInputBar, email);
        LOG.info("email address entered success");
    }

    public void clearFirstNameInInputBar(){
        clear(firstNameInputBar);
        LOG.info("first name in bar cleared success");
    }

    public void clearLastNameInInputBar(){
        clear(lastNameInputBar);
        LOG.info("last name in bar cleared success");
    }

    public void clearEmailInputBar(){
        clear(emailInputBar);
        LOG.info("email address in bar cleared success");
    }


    public void enterPhoneInEditAccountInformation(String telephone){
        type(telephoneInputBar, telephone);
        LOG.info("phone number entered success");
    }

    public void clickContinueButtonInEditInformationPage() {
        click(continueButtonInEditInformationPage);
        LOG.info("continue button in edit information page success");
    }

    public String editInformationTabName(){
        return getElementText(editInformationTab);
    }

    public boolean updatedAccountAlert(){
        return updatedAccountInformationAlert.isDisplayed();
    }

    public boolean firstNameVerification(){
        return firstNameInputBar.isEnabled();
    }

    public boolean lastNameVerification(){
        return lastNameInputBar.isEnabled();
    }


}
