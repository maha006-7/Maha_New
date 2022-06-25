package apps.AutomationPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPracticePages.SigninPage;


public class SigninTest extends base.CommonAPI {


    @Test
    public void signin() {

        SigninPage signinPage = new SigninPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        String text = "Anica Farnaz";
        Assert.assertEquals(text,signinPage.getHeaderText());
    }

    @Test
    public void SigninInvalidEmail() {
        SigninPage signinPage = new SigninPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("abcd@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();

        String expectedSigninErrorHeading = "Authentication failed.";
        Assert.assertEquals(expectedSigninErrorHeading, signinPage.getSigninError());
    }

    @Test
    public void signinInvalidPassword() {
        SigninPage signinPage = new SigninPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("123456789");
        signinPage.clickFinalSignin();

        String expectedSigninErrorHeading = "Authentication failed.";
        Assert.assertEquals(expectedSigninErrorHeading, signinPage.getSigninError());
    }

    @Test
    public void forgottenPassword() {
        SigninPage signinPage = new SigninPage(getDriver());
        signinPage.clickSignin();
        signinPage.clickForgotPassword();
        signinPage.typeForgotPasswordEmail("anicatohfa@gmail.com");
        signinPage.clickRetrievePassword();
        signinPage.clickBackToLogin();
        String expectedConfirmationPasswordHeading = "A confirmation email has been sent to your address: anicatohfa@gmail.com";
        Assert.assertEquals(expectedConfirmationPasswordHeading, signinPage.getConfirmationPassword());
    }


}