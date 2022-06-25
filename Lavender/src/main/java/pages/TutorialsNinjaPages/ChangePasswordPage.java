package pages.TutorialsNinjaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChangePasswordPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ChangePasswordPage.class);

    @FindBy(css = "#input-password")
    private WebElement newPasswordInputBar;

    @FindBy(css = "#input-confirm")
    private WebElement confirmNewPasswordInputBar;

    @FindBy(xpath="//*[@id='content']/form/div/div[2]/input")
    private WebElement continueChangePasswordButton;

    @FindBy(css="div[class='text-danger']")
    private WebElement noMatchingPasswordConfirmationAlert;

    public ChangePasswordPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterNewPassword(String newPassword) {
        type(newPasswordInputBar, newPassword);
        LOG.info("success entering password in the password input bar");
    }

    public void confirmNewPassword(String newPassword){
        type(confirmNewPasswordInputBar, newPassword);
        LOG.info("success confirming password ");
    }

    public void clickChangePasswordContinueButton(){
        click(continueChangePasswordButton);
        LOG.info("click continue button for change password success");
    }

    public String noMatchingPasswordConfirmationMessage(){
        return getElementText(noMatchingPasswordConfirmationAlert);
    }


}
