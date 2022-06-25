

package apps.DemoBlaze;
import base.CommonAPI;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.DemoBlazePages.ContactPage;
import pages.DemoBlazePages.HomePage;
import pages.DemoBlazePages.ProductPage;


public class RegisterLogIn extends CommonAPI {

//    private final Logger LOG = LoggerFactory.getLogger(RegisterLogIn.class);
    @Test
    public void SignUpButton() {
        waitFor(3);
        HomePage homePage = new HomePage(getDriver());
        homePage.HomeBtn();
        homePage.SignUp();
        waitFor(3);
        homePage.SignUpUsername();
        waitFor(3);
        homePage.SignUpPassword();
        waitFor(3);
        homePage.SignUpGo();
    }
    @Test
    public void SignInUserAcc() {
        waitFor(5);
        HomePage homePage = new HomePage(getDriver());
        homePage.HomeStorePage();
        homePage.LogInClick();
        waitFor(3);
        homePage.LogInUser();
        waitFor(5);
        homePage.SignInPass();
        waitFor(5);
        homePage.LogInButtonGo();
        waitFor(5);
    }
    @Test
    public void InvalidLogIn() {
        HomePage homePage = new HomePage(getDriver());
        homePage.HomeStorePage();
        waitFor(4);
        homePage.LogInClick();
        waitFor(3);
        homePage.WrongSignInUser();
        waitFor(3);
        homePage.WrongSignInPass();
        waitFor(3);
        homePage.LogInButtonGo();
        waitFor(3);
    }
    @Test
    public void LogInSendMsg() {
        HomePage homePage = new HomePage(getDriver());
        ContactPage contactPage= new ContactPage(getDriver());
        homePage.HomeStorePage();
        waitFor(4);
        homePage.LogInClick();
        waitFor(3);
        homePage.LogInUser();
        homePage.SignInPass();
        waitFor(3);
        homePage.LogInButtonGo();
        waitFor(3);
        homePage.HomeIcon();
        homePage.ContactBtn();
        contactPage.ContactEmailTab();
        contactPage.ContactNameTab();
        waitFor(1);
        contactPage.ContactMessageTab();
        waitFor(4);
        contactPage.SendMessage();
        waitFor(4);
    }
    @Test
    public void AddToCartAny() {
        HomePage homePage = new HomePage(getDriver());
        homePage.Laptops();
        waitFor(3);
    }
    @Test
    public void SendMessage() {
        HomePage homePage = new HomePage(getDriver());
        ContactPage contactPage = new ContactPage(getDriver());
        homePage.HomeIcon();
        waitFor(3);
        homePage.ContactBtn();
        waitFor(3);
        contactPage.ContactEmailTab();
        contactPage.ContactNameTab();
        waitFor(1);
        contactPage.ContactMessageTab();
        waitFor(4);
        contactPage.SendMessage();
        waitFor(4);
    }
    @Test
    public void LogInViewCart() {
        HomePage homePage = new HomePage(getDriver());
        homePage.HomeStorePage();
        waitFor(4);
        homePage.LogInClick();
        waitFor(3);
        homePage.LogInUser();
        homePage.SignInPass();
        waitFor(3);
        homePage.LogInButtonGo();
        waitFor(3);
        homePage.HomeIcon();
        waitFor(3);
        homePage.CartPage();
    }
    @Test
    public void SlideArrowSamSungAdd() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.HomeStorePage();
        waitFor(4);
        homePage.SlideArrow();
        waitFor(2);
        homePage.SlideArrow();
        waitFor(3);
        homePage.Phones();
        productPage.SamSungPhone();
        waitFor(3);
        productPage.AddProduct();
    }

    @Test
    public void LogInContact() {
        HomePage homePage = new HomePage(getDriver());
        ContactPage contactPage = new ContactPage(getDriver());
        homePage.HomeStorePage();
        waitFor(4);
        homePage.LogInClick();
        waitFor(2);
        homePage.LogInUser();
        waitFor(3);
        homePage.SignInPass();
        waitFor(2);
        homePage.LogInButtonGo();
        waitFor(3);
        homePage.HomeIcon();
        waitFor(3);
        homePage.Categories();
        waitFor(3);
        homePage.Previous();
        waitFor(3);
        homePage.Next();
        waitFor(3);
        homePage.ContactBtn();
        waitFor(3);
        contactPage.ContactEmailTab();
        waitFor(3);
        contactPage.ContactNameTab();
        waitFor(3);
        contactPage.ContactMessageTab();
        waitFor(3);
        contactPage.SendMessage();
    }

    @Test
    public void SonyPhoneMsg() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        ContactPage contactPage = new ContactPage(getDriver());
        homePage.HomeIcon();
        waitFor(3);
        homePage.Phones();
        productPage.SonyPhone();
        waitFor(3);
        productPage.AddProduct();
        homePage.HomeIcon();
        waitFor(3);
        homePage.ContactBtn();
        contactPage.SonyEmail();
        contactPage.SonyName();
        waitFor(1);
        contactPage.SonyMessage();
        waitFor(4);
        contactPage.SendMessage();
        waitFor(5);
    }

    @Test
    public void LogViewCart() {
        HomePage homePage = new HomePage(getDriver());
        homePage.LogInClick();
        waitFor(3);
        homePage.LogInUser();
        waitFor(3);
        homePage.SignInPass();
        waitFor(3);
        homePage.LogInButtonGo();
        waitFor(3);
        homePage.CartPage();
        waitFor(2);
    }
    @Test
    public void LogViewCheckout() {
        HomePage homePage = new HomePage(getDriver());
        homePage.HomeBtn();
        homePage.LogInClick();
        waitFor(3);
        homePage.LogInCheckOut();
        waitFor(3);
        homePage.LogInPassCheckOut();
        waitFor(3);
        homePage.LogInButtonGo();
        waitFor(3);
        homePage.CartPage();
        waitFor(2);
        homePage.PlaceOrder();
        waitFor(1);
        homePage.EnterName();
        waitFor(2);
        homePage.EnterCountryName();
        waitFor(2);
        homePage.EnterCity();
        waitFor(2);
        homePage.EnterCardName();
        waitFor(1);
        homePage.EnterMonth();
        waitFor(1);
        homePage.EnterYear();
        waitFor(1);
        homePage.ClickPurchase();
        waitFor(3);
    }

}

