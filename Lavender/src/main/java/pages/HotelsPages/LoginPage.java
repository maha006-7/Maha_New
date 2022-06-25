package pages.HotelsPages;

import base.CommonAPI;
import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class LoginPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(LoginPage.class);

    @FindBy(id = "gc-custom-header-nav-bar-acct-menu")
    private WebElement signIn;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    private WebElement signInbBtn;

    @FindBy(css = "input[type=\"email\"]")
    private WebElement email;

    @FindBy(css = "input[type='password']")
    private WebElement password;

    @FindBy(id = "loginFormSubmitButton")
    private WebElement loginBtn;

    @FindBy(xpath = "//button[@class=\"uitk-button uitk-button-medium uitk-button-has-text uitk-button-tertiary uitk-menu-trigger\"]")
    private WebElement userName;

    @FindBy(xpath = "//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/div/div[2]/a[2]/div")
    private WebElement listOfFavorites;

    @FindBy(css = "a[data-stid=\"member-wallet-details-more-info-link\"]")
    private WebElement rewardsActivity;

    @FindBy(xpath = "//header/nav[@id='secondaryNav']/div[@id='gc-custom-header-nav-bar-acct-menu']/div[1]/div[2]/a[1]")
    private WebElement account;

    @FindBy(xpath = "//*[@id=\"item-settings\"]/a")
    private WebElement updateYourAccountSettings;

    @FindBy(xpath = "//*[@id=\"details\"]/div[2]/div[2]/button")
    private WebElement editYourDetails;

    @FindBy(css = "input[id=\"user-details-lastname\"]")
    private WebElement lastName;

    @FindBy(css = "input[id=\"user-details-lastname\"]")
    private WebElement newLastName;

    @FindBy(xpath = "//*[@id=\"user-details\"]/button[1]")
    private WebElement saveYourDetails;

    @FindBy(xpath = "//*[@id=\"details\"]/div[2]/div[1]/div")
    private WebElement assertionText;

    @FindBy(css = "a[href=\"/account/bookingslist.html?intlid=ACCOUNT\"]")
    private WebElement yourBookings;

    @FindBy(xpath = "//h1[contains(text(),\"Trips\")]")
    private WebElement assertionHeader;

    @FindBy(css = "input[id=\"user-details-firstname\"]")
    private WebElement name;

    @FindBy(css = "input[id=\"user-details-zip\"]")
    private WebElement zipCode;

    @FindBy(css = "select[id=\"user-details-country\"]")
    private WebElement country;

    @FindBy(css = "input[id=\"user-details-phone\"]")
    private WebElement phone;

    @FindBy(xpath = "//*[@id=\"user-password-new\"]")
    private WebElement newPassword;

    @FindBy(xpath = "//*[@id=\"user-password-repeat\"]")
    private WebElement repeatPassword;

    @FindBy(xpath = "//*[@id=\"password\"]/div[2]/div[2]/button")
    private WebElement editPassword;

    @FindBy(css = "a[href=\"/newsletter/unsubscribe.html\"]")
    private WebElement unsubscribe;

    @FindBy(css = "button[id=\"newsletter-unsubscribe-submit\"]")
    private WebElement unsubscribeBtn;

    @FindBy(css = "a[href=\"/profile/reviews.html\"]")
    private WebElement yourReviews;

    @FindBy(xpath = "//header/nav[@id='secondaryNav']/div[@id='gc-custom-header-nav-bar-acct-menu']/div[1]/div[2]/a[6]")
    private WebElement feedback;

    @FindBy(xpath = "//div[contains(text(),\"Sign out\")]")
    private WebElement signOut;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/button[2]")
    private WebElement popUp;

    @FindBy(xpath = "//*[@id=\"item-payments\"]")
    private WebElement managePaymentCards;

    @FindBy(xpath = "//*[@id=\"item-tripplanner\"]/a")
    private WebElement favorites;

    @FindBy(xpath = "//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/div/div[2]/a[5]/div")
    private WebElement creditCards;


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickSignIn() {

        click(signIn);
        LOG.info("clicked");
    }

    public void clickSignBtn() {

        click(signInbBtn);
        LOG.info("clicked");
    }

    public void typeEmail(String textEmail) {
        type(email, textEmail);
        LOG.info("email entered");
    }

    public void typePassword(String textPassword) {

        type(password, textPassword);
        LOG.info("password entered");
    }

    public void clickLoginBtn() {
        click(loginBtn);
        LOG.info("clicked");
    }

    public void clickUserName() {
        click(userName);
        LOG.info("clicked");
    }

    public void clickListOfFavorites() {
        click(listOfFavorites);
        LOG.info("clicked");

    }

    public void clickRewardsActivity() {

        click(rewardsActivity);
        LOG.info("clicked");

    }

    public void clickAccount() {

        click(account);
        LOG.info("clicked");

    }

    public void clickUpdateYourAccountSettings() {

        click(updateYourAccountSettings);
        LOG.info("clicked");

    }

    public void clickEditYourDetails() {

        click(editYourDetails);
        LOG.info("clicked");

    }

    public void clickEditPassword() {

        click(editPassword);
        LOG.info("clicked");

    }

    public void clickUnsubscribe() {

        click(unsubscribe);
        LOG.info("clicked");

    }

    public void clickUnsubscribeBtn() {

        click(unsubscribeBtn);
        LOG.info("clicked");

    }

    public void clickYourReviews() {

        click(yourReviews);
        LOG.info("clicked");

    }

    public void clickFeedback() {
        click(feedback);
        LOG.info("clicked");

    }

    public void clickSignOut() {

        click(signOut);
        LOG.info("clicked");

    }

    public void clearLastName() {

        clear(lastName);
        LOG.info("deleted");

    }

    public void clearName() {

        clear(name);
        LOG.info("deleted");


    }

    public void clearZipCode() {

        clear(zipCode);
        LOG.info("deleted");

    }

    public void clearPhoneNumber() {

        clear(phone);
        LOG.info("deleted");

    }

    public void typeNewLastName(String textNewLastName) {
        type(newLastName, textNewLastName);
        LOG.info("new last name entered");

    }

    public void typeNewName(String textNewName) {

        type(name, textNewName);
        LOG.info("name entered");

    }

    public void typeZipCode(String textZipCode) {

        type(zipCode, textZipCode);
        LOG.info("zipcode entered");

    }

    public void typePhoneNumber(String textPhoneNumber) {

        type(phone, textPhoneNumber);
        LOG.info("phone entered");

    }


    public void selectCountry(String textCountry) {
        selectFromDropdown(country, textCountry);
        LOG.info("country selected");

    }

    public void clickSaveYourDetails() {

        click(saveYourDetails);
        LOG.info("clicked");

    }

    public String getAssertionText() {
        return getElementText(assertionText);
    }

    public void clickYourBookings() {

        click(yourBookings);
        LOG.info("clicked");

    }

    public String getAssertionHeader() {
        return getElementText(assertionHeader);
    }


    public void clickManagePaymentsCard() {

        click(managePaymentCards);
        LOG.info("clicked");

    }

    public void clickFavorites() {

        click(favorites);
        LOG.info("clicked");

    }

    public void clickCreditCards() {

        click(creditCards);
        LOG.info("clicked");

    }

    public WebElement getSignInbBtn() {
        return signInbBtn;
    }

    public WebElement getCreditCards() {
        return creditCards;
    }


}
