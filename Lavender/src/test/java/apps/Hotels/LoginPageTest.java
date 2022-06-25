
package apps.Hotels;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.HotelsPages.LoginPage;
import utility.ExcelReader;
import utility.Utility;

import java.time.Duration;
import java.util.Properties;
import java.util.Set;

public class LoginPageTest extends CommonAPI {


    //Using excel reader
    @Test
    public void loginWithValidCredentials() {
        ExcelReader reader = new ExcelReader("/Users/mahaakhazzan/Desktop/Lavender/data/SampleSheet.xlsx");
        String email = reader.getDataFromCell("Maha", 1, 0);
        String password = reader.getDataFromCell("Maha", 1, 1);
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        loginPage.clickSignBtn();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        isPresent(getDriver().findElement(By.xpath("//div[@id=\"gc-custom-header-nav-bar-acct-menu\"]/button")));

    }

    String invalidEmail = "randomemail@gmail.com";
    String password = "test1234";

    @Test
    public void loginWithInvalidCredentials() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        loginPage.clickSignBtn();
        loginPage.typeEmail(invalidEmail);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        isPresent(getDriver().findElement(By.xpath("//h3 [@class=\"uitk-error-summary-heading\"]")));

    }

    /*//Using data provider
    @Test (dataProvider = "loginInvalidCredentials")
    public void loginWithInvalidCredentials(String invalidEmail, String password) {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        loginPage.clickSignBtn();
        loginPage.typeEmail(invalidEmail);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        isPresent(getDriver().findElement(By.xpath("//h3 [@class=\"uitk-error-summary-heading\"]")));

    }
    @DataProvider(name="loginInvalidCredentials")
    public Object[][] loginInvalidCredentialsDataProvider(){
        Object[][] data = new Object[2][2];
        data[0][0] = "randomemail@gmail.com";
        data[0][1] = "TestHotels!";

        data[1][0] = "mahaa94co@gmail.com";
        data[1][1] = "TestHotels!";
        return data;
    }*/

    String newName = "Maha";

    @Test
    public void updateName() {
        ExcelReader reader = new ExcelReader("/Users/mahaakhazzan/Desktop/Lavender/data/SampleSheet.xlsx");
        String email = reader.getDataFromCell("Maha", 1, 0);
        String password = reader.getDataFromCell("Maha", 1, 1);
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        loginPage.clickSignBtn();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        loginPage.clickUserName();
        loginPage.clickAccount();
        loginPage.clickUpdateYourAccountSettings();
        loginPage.clickEditYourDetails();
        loginPage.clearName();
        loginPage.typeNewName(newName);
        loginPage.clickSaveYourDetails();
        loginPage.clickSaveYourDetails();
        String assertionText = loginPage.getAssertionText();
        Assert.assertEquals(assertionText, "Changes to your details have been saved.");
    }

    String newLastName = "Ak";

    @Test
    public void updateLastname() {
        ExcelReader reader = new ExcelReader("/Users/mahaakhazzan/Desktop/Lavender/data/SampleSheet.xlsx");
        String email = reader.getDataFromCell("Maha", 1, 0);
        String password = reader.getDataFromCell("Maha", 1, 1);
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        loginPage.clickSignBtn();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        loginPage.clickUserName();
        loginPage.clickAccount();
        loginPage.clickUpdateYourAccountSettings();
        loginPage.clickEditYourDetails();
        loginPage.clearLastName();
        loginPage.typeNewLastName(newLastName);
        loginPage.clickSaveYourDetails();
        loginPage.clickSaveYourDetails();
        String assertionText = loginPage.getAssertionText();
        Assert.assertEquals(assertionText, "Changes to your details have been saved.");
    }

    String zipCode = "80231";


    @Test
    public void addZipCode() {
        ExcelReader reader = new ExcelReader("/Users/mahaakhazzan/Desktop/Lavender/data/SampleSheet.xlsx");
        String email = reader.getDataFromCell("Maha", 1, 0);
        String password = reader.getDataFromCell("Maha", 1, 1);
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        loginPage.clickSignBtn();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        loginPage.clickUserName();
        loginPage.clickAccount();
        loginPage.clickUpdateYourAccountSettings();
        loginPage.clickEditYourDetails();
        loginPage.clearZipCode();
        loginPage.typeZipCode(zipCode);
        loginPage.clickSaveYourDetails();
        loginPage.clickSaveYourDetails();
        String assertionText = loginPage.getAssertionText();
        Assert.assertEquals(assertionText, "Changes to your details have been saved.");
    }

    String country = "Spain";

    //Handling dropdown

    @Test
    public void changeCountry() {
        ExcelReader reader = new ExcelReader("/Users/mahaakhazzan/Desktop/Lavender/data/SampleSheet.xlsx");
        String email = reader.getDataFromCell("Maha", 1, 0);
        String password = reader.getDataFromCell("Maha", 1, 1);
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        loginPage.clickSignBtn();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        loginPage.clickUserName();
        loginPage.clickAccount();
        loginPage.clickUpdateYourAccountSettings();
        loginPage.clickEditYourDetails();
        loginPage.selectCountry(country);
        loginPage.clickSaveYourDetails();
        loginPage.clickSaveYourDetails();
        String assertionText = loginPage.getAssertionText();
        Assert.assertEquals(assertionText, "Changes to your details have been saved.");
    }

    String phoneNumber = "0203938333";


    @Test
    public void updatePhoneNumber() {
        ExcelReader reader = new ExcelReader("/Users/mahaakhazzan/Desktop/Lavender/data/SampleSheet.xlsx");
        String email = reader.getDataFromCell("Maha", 1, 0);
        String password = reader.getDataFromCell("Maha", 1, 1);
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        waitFor(2);
        loginPage.clickSignBtn();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        loginPage.clickUserName();
        loginPage.clickAccount();
        loginPage.clickUpdateYourAccountSettings();
        loginPage.clickEditYourDetails();
        loginPage.clearPhoneNumber();
        loginPage.typePhoneNumber(phoneNumber);
        loginPage.clickSaveYourDetails();
        loginPage.clickSaveYourDetails();
        String assertionText = loginPage.getAssertionText();
        Assert.assertEquals(assertionText, "Changes to your details have been saved.");
    }


    @Test
    public void changePassword() {
        ExcelReader reader = new ExcelReader("/Users/mahaakhazzan/Desktop/Lavender/data/SampleSheet.xlsx");
        String email = reader.getDataFromCell("Maha", 1, 0);
        String password = reader.getDataFromCell("Maha", 1, 1);
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        waitFor(2);
        loginPage.clickSignBtn();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        loginPage.clickUserName();
        loginPage.clickAccount();
        loginPage.clickUpdateYourAccountSettings();
        loginPage.clickEditPassword();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"password\"]/div[1]/h3")));

    }


    @Test
    public void unsubscribeFromMarketingEmails() {
        ExcelReader reader = new ExcelReader("/Users/mahaakhazzan/Desktop/Lavender/data/SampleSheet.xlsx");
        String email = reader.getDataFromCell("Maha", 1, 0);
        String password = reader.getDataFromCell("Maha", 1, 1);
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        waitFor(2);
        loginPage.clickSignBtn();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        loginPage.clickUserName();
        loginPage.clickAccount();
        loginPage.clickUpdateYourAccountSettings();
        loginPage.clickUnsubscribe();
        loginPage.clickUnsubscribeBtn();
        isPresent(getDriver().findElement(By.xpath("//h3[contains(text(),\"Sorry to see you go\")]")));


    }

    @Test
    public void checkReviews() {
        ExcelReader reader = new ExcelReader("/Users/mahaakhazzan/Desktop/Lavender/data/SampleSheet.xlsx");
        String email = reader.getDataFromCell("Maha", 1, 0);
        String password = reader.getDataFromCell("Maha", 1, 1);
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        waitFor(2);
        loginPage.clickSignBtn();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        loginPage.clickUserName();
        loginPage.clickAccount();
        loginPage.clickYourReviews();
        isPresent(getDriver().findElement(By.xpath("//h1[contains(text(),\"Your reviews\")]")));


    }


    @Test
    public void checkYourBookings() {
        ExcelReader reader = new ExcelReader("/Users/mahaakhazzan/Desktop/Lavender/data/SampleSheet.xlsx");
        String email = reader.getDataFromCell("Maha", 1, 0);
        String password = reader.getDataFromCell("Maha", 1, 1);
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        waitFor(2);
        loginPage.clickSignBtn();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        loginPage.clickUserName();
        loginPage.clickAccount();
        loginPage.clickYourBookings();
        String assertionHeader = loginPage.getAssertionHeader();
        Assert.assertEquals(assertionHeader, "Trips");

    }


    @Test
    public void checkListOfFavorites() {
        ExcelReader reader = new ExcelReader("/Users/mahaakhazzan/Desktop/Lavender/data/SampleSheet.xlsx");
        String email = reader.getDataFromCell("Maha", 1, 0);
        String password = reader.getDataFromCell("Maha", 1, 1);
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        waitFor(2);
        loginPage.clickSignBtn();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        loginPage.clickUserName();
        loginPage.clickListOfFavorites();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"uitk-tabs-container\"]/ul/li[1]/a/span")));

    }


    @Test
    public void addFeedback() {
        ExcelReader reader = new ExcelReader("/Users/mahaakhazzan/Desktop/Lavender/data/SampleSheet.xlsx");
        String email = reader.getDataFromCell("Maha", 1, 0);
        String password = reader.getDataFromCell("Maha", 1, 1);
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        waitFor(2);
        loginPage.clickSignBtn();
        waitFor(2);
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        loginPage.clickUserName();
        loginPage.clickFeedback();
        Set<String> child = getDriver().getWindowHandles();
        for (String window : child) {
            getDriver().switchTo().window(window);
        }
        isPresent(getDriver().findElement(By.cssSelector("span[data-localization=\"verbatim-heading\"]")));


    }

    @Test
    public void checkRewards() {
        ExcelReader reader = new ExcelReader("/Users/mahaakhazzan/Desktop/Lavender/data/SampleSheet.xlsx");
        String email = reader.getDataFromCell("Maha", 1, 0);
        String password = reader.getDataFromCell("Maha", 1, 1);
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        waitFor(2);
        loginPage.clickSignBtn();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        loginPage.clickUserName();
        loginPage.clickRewardsActivity();
        isPresent(getDriver().findElement(By.xpath("//div[@class=\"loyalty-header \"]/div[2]/ul/li[4]/a")));
    }


    @Test
    public void signOut() {
        ExcelReader reader = new ExcelReader("/Users/mahaakhazzan/Desktop/Lavender/data/SampleSheet.xlsx");
        String email = reader.getDataFromCell("Maha", 1, 0);
        String password = reader.getDataFromCell("Maha", 1, 1);
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        waitFor(2);
        loginPage.clickSignBtn();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        loginPage.clickUserName();
        loginPage.clickSignOut();
        isPresent(getDriver().findElement(By.id("gc-custom-header-nav-bar-acct-menu")));

    }


    @Test
    public void PaymentsCards() {
        ExcelReader reader = new ExcelReader("/Users/mahaakhazzan/Desktop/Lavender/data/SampleSheet.xlsx");
        String email = reader.getDataFromCell("Maha", 1, 0);
        String password = reader.getDataFromCell("Maha", 1, 1);
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        waitFor(2);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loginPage.getSignInbBtn()));
        loginPage.clickSignBtn();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        loginPage.clickUserName();
        loginPage.clickAccount();
        loginPage.clickManagePaymentsCard();
        isPresent(getDriver().findElement(By.xpath("//h1[contains(text(),\"Your payment cards\")]")));

    }
    //Using Data Provider

 /*   @Test(dataProvider = "managePayment")
    public void managePaymentsCards(String email, String password) {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loginPage.getSignInbBtn()));
        loginPage.clickSignBtn();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        loginPage.clickUserName();
        loginPage.clickAccount();
        loginPage.clickManagePaymentsCard();
        isPresent(getDriver().findElement(By.xpath("//h1[contains(text(),\"Your payment cards\")]")));

    }
    @DataProvider(name="managePayment")
    public Object[][] managePaymentDataProvider(){
        Object[][] data = new Object[2][2];
        //first set of values
        data[0][0] = "akhazzanmaha@gmail.com";
        data[0][1] = "TestHotels01!";

        //second set of value wrong crendentials
        data[1][0] = "nadine1994@gmail.com";
        data[1][1] = "TestHotels!";
        return data;
    }*/

    @Test
    public void checkFavorites() {
        ExcelReader reader = new ExcelReader("/Users/mahaakhazzan/Desktop/Lavender/data/SampleSheet.xlsx");
        String email = reader.getDataFromCell("Maha", 1, 0);
        String password = reader.getDataFromCell("Maha", 1, 1);
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loginPage.getSignInbBtn()));
        loginPage.clickSignBtn();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        loginPage.clickUserName();
        loginPage.clickAccount();
        waitFor(2);
        loginPage.clickFavorites();
        isPresent(getDriver().findElement(By.xpath("//h1[contains(text(),\"Trips\")]")));

    }

    @Test
    public void checkCreditCard() {
        ExcelReader reader = new ExcelReader("/Users/mahaakhazzan/Desktop/Lavender/data/SampleSheet.xlsx");
        String email = reader.getDataFromCell("Maha", 1, 0);
        String password = reader.getDataFromCell("Maha", 1, 1);
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignIn();
        //explicit wait: this waits for a specific element to become visible
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loginPage.getSignInbBtn()));
        loginPage.clickSignBtn();
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        loginPage.clickUserName();
        wait.until(ExpectedConditions.visibilityOf(loginPage.getCreditCards()));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", loginPage.getCreditCards());
        loginPage.clickCreditCards();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div[1]/div[2]/div/div[3]/div/a")));

    }


}

