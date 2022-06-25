package pages.DemoBlazePages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(HomePage.class);

    @FindBy(css="#login2")
    private WebElement logIn;

    @FindBy(css = "#loginusername")
    private WebElement logInUser;

    @FindBy(css = "#loginpassword")
    private WebElement logInPass;

    @FindBy(xpath="//*[@id='logInModal']/div/div/div[3]/button[2]")
    private WebElement logInButton;

    @FindBy(css="#signin2")
    private WebElement signUp;

    @FindBy(css="#sign-username")
    private WebElement signUpUser;

    @FindBy(css="#sign-password")
    private WebElement signUpPass;

    @FindBy(xpath = "//*[@id='signInModal']/div/div/div[3]/button[2]")
    private WebElement signUpEnter;

    @FindBy(xpath = "//*[@id='navbarExample']/ul/li[1]/a")
    private WebElement homeButton;

    @FindBy(xpath = "//*[@id='navbarExample']/ul/li[2]/a")
    private WebElement contactButton;

    @FindBy(xpath="//*[@id='navbarExample']/ul/li[3]/a")
    private WebElement aboutUsButton;

    @FindBy(xpath = "//*[@id='example-video_html5_api']")
    private WebElement aboutUsVideoBtn;

    @FindBy(xpath="//*[@id='videoModal']/div/div/div[3]/button")
    private WebElement closeAboutUsBtn;


    @FindBy(xpath= "//*[@id='navbarExample']/ul/li[4]/a")
    private WebElement cartButton;

    @FindBy(xpath ="//*[@class='carousel-control-next']")
    private WebElement slideArrowBtn;

    @FindBy(xpath ="//*[@class='list-group']/a[2]")
    private WebElement phonesButton;

    @FindBy(xpath= "//*[@class='list-group']/a[3]")
    private WebElement laptopsButton;

    @FindBy(xpath = "//*[@class='list-group']/a[4]")
    private WebElement monitorsButton;

    @FindBy(css="#prev2")
    private WebElement previousBtn;

    @FindBy(xpath = "//*[@id='next2']")
    private WebElement nextBtn;

    @FindBy(xpath = "//*[@id='cat']")
    private WebElement catBtn;

    @FindBy(xpath = "//*[@id='nava']/img")
    private WebElement homeIconBtn;

    @FindBy(xpath = "//*[@id='nava']")
    private WebElement homeStoreBtn;

    @FindBy(xpath = "//*[@id='tbodyid']/div[5]/div/div/h4/a")
    private WebElement iphoneSixBtn;

    @FindBy(xpath = "//*[@id='page-wrapper']/div/div[2]/button")
    private WebElement PlaceOrderBtn;

    @FindBy(css= "#name")
    private WebElement OrderNameBtn;

    @FindBy(css = "#country")
    private WebElement OrderNameCountry;

    @FindBy(css = "#city")
    private WebElement OrderNameCity;

    @FindBy(css = "#card")
    private WebElement OrderNameCard;

    @FindBy(css = "#month")
    private WebElement OrderNameMonth;

    @FindBy(css = "#year")
    private WebElement OrderNameYear;

    @FindBy(xpath = "//*[@id='orderModal']/div/div/div[3]/button[2]")
    private WebElement PurchaseBtn;

    @FindBy(xpath = "//*[@id='fotcont']/div[3]/div/div/h4/img")
    private WebElement Bottompage;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    //reusable steps
    public void LogInClick() {
        click(logIn);
        LOG.info("click on login button tab");

    }

    public void LogInButtonGo() {
        click(logInButton);
        LOG.info("click on log in button successful");
    }

    public void LogInUser() {
        type(logInUser, "PNTRandom12345");
        LOG.info("enter login username");
    }
    public void LogInCheckOut() {
        type(logInUser, "pntuser123");
        LOG.info("enter login information for checkout test");
    }
    public void WrongSignInUser() {
        type(logInUser, "random");
        LOG.info("enter wrong login information for test");
    }
    public void WrongSignInPass() {
        type(logInPass, "123");
        LOG.info("enter wrong login password for test");
    }
    public void SignInPass() {
        type(logInPass, "12345");
        LOG.info("enter signin password");
    }
    public void LogInPassCheckOut() {
        type(logInPass, "1234");
        LOG.info("enter login information for checkout test");
    }

    public void HomeBtn() {
        click(homeButton);
        LOG.info("click on home button");
    }

    public void ContactBtn() {
        click(contactButton);
        LOG.info("click on contact button");
    }

    public void AboutUsPage() {
        click(aboutUsButton);
        LOG.info("click on About Us page");
    }
    public void CloseAboutUs() {
        click(closeAboutUsBtn);
        LOG.info("close about us page");
    }
    public void AboutUsVideo() {
        click(aboutUsVideoBtn);
        LOG.info("play about us video");
    }
    public void CartPage() {
        click(cartButton);
        LOG.info("click on Cart page");
    }
    public void SlideArrow() {
        click(slideArrowBtn);
        LOG.info("click on slide arrow");
    }
    public void Previous() {
        click(previousBtn);
        LOG.info("click previous button");
    }
    public void Next() {
        click(nextBtn);
        LOG.info("click next button");
    }

    public void Categories() {
        click(catBtn);
        LOG.info("click categories button");
    }

    public void Monitors() {
        click(monitorsButton);
        LOG.info("click monitors button");

    }

    public void Phones() {
        click(phonesButton);
        LOG.info("click phones button");
    }

    public void Laptops() {
        click(laptopsButton);
        LOG.info("click laptops button");
    }

    public void HomeIcon() {
        click(homeButton);
        LOG.info("click on home icon button");
    }

    public void HomeStorePage() {
        click(homeStoreBtn);
        LOG.info("click on HomeStore letters");
    }
    public void SignUp() {
        click(signUp);
        LOG.info("click on Sign Up tab");
    }
    public void SignUpUsername() {
        type(signUpUser, "PNTRandom123456");
        LOG.info("type signup username for test");
    }
    public void SignUpNewUsername() {
        type(signUpUser, "chandika1234");
        LOG.info("type signup username for new test");
    }
    public void SignUpPassword() {
        type(signUpPass, "12345");
        LOG.info("type signup password for new test");
    }
    public void SignUpGo() {
        click(signUpEnter);
        LOG.info("click signup button");
    }
    public void PlaceOrder() {
        click(PlaceOrderBtn);
        LOG.info("place order button");
    }

    public void EnterName() {
        type(OrderNameBtn, "Jane Doe");
        LOG.info("enter checkout name");
    }
    public void EnterCountryName() {
        type(OrderNameCountry, "USA");
        LOG.info("enter checkout country name");
    }
    public void EnterCity() {
        type(OrderNameCity, "Washington DC");
        LOG.info("enter checkout city name");
    }
    public void EnterCardName() {
        type(OrderNameCard, "1234567890");
        LOG.info("enter card name");
    }
    public void EnterMonth() {
        type(OrderNameMonth, "June");
        LOG.info("enter month");
    }
    public void EnterYear() {
        type(OrderNameYear, "2026");
        LOG.info("enter year");
    }

    public void ClickPurchase() {
        click(PurchaseBtn);
        LOG.info("click purchase button");
    }
    public void EnterWrongName() {
        type(OrderNameBtn, "invalidUser");
        LOG.info("enter wrong name for test");
    }
    public void EnterWrongCountryName() {
        type(OrderNameCountry, "no where");
        LOG.info("enter wrong country name for test");
    }
    public void EnterWrongCardName() {
        type(OrderNameCard, "No one");
        LOG.info("enter wrong card name for test");
    }
    public void EnterWrongMonth() {
        type(OrderNameMonth, "Saturn");
        LOG.info("enter wrong month name");
    }
    public void EnterWrongCity() {
        type(OrderNameCity, "no where");
        LOG.info("enter wrong city name");
    }
    public void EnterWrongYear() {
        type(OrderNameYear, "10");
        LOG.info("enter wrong year");
    }

    public void ScrollToBottom() {
        click(previousBtn);
        LOG.info("scroll to bottom of page");
    }
}
