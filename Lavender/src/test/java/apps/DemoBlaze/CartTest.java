
package apps.DemoBlaze;

import base.CommonAPI;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.DemoBlazePages.HomePage;
import pages.DemoBlazePages.ProductPage;

public class CartTest extends CommonAPI {

//    private final Logger LOG = LoggerFactory.getLogger(CartTest.class);
    @Test(enabled = false)
    public void ViewCart() {
        HomePage homePage = new HomePage(getDriver());
        homePage.CartPage();
        waitFor(3);
    }

    @Test(enabled = false)
    public void AddIphoneSixToCart() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.HomeIcon();
        productPage.IphoneSix();
        waitFor(2);
        productPage.AddProduct();
        waitFor(5);
    }
    @Test(enabled = false)
    public void AddNexus() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        productPage.NexusPhone();
        waitFor(3);
        productPage.AddProduct();
        homePage.HomeStorePage();
    }
    @Test
    public void AddAsusMonitorToCart() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.Monitors();
        waitFor(3);
        productPage.AsusMonitorBtn();
        waitFor(2);
        productPage.AddProduct();
        homePage.HomeStorePage();
    }
    @Test
    public void AddIphoneToCart() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.HomeIcon();
        productPage.IphoneSix();
        waitFor(2);
        productPage.AddProduct();
        waitFor(5);
    }
    @Test
    public void DeleteAppleMonitor() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.HomeBtn();
        homePage.Monitors();
        waitFor(4);
        productPage.UseAppleMonitor();
        waitFor(4);
        productPage.AddProduct();
        waitFor(1);
        homePage.HomeIcon();
        waitFor(3);
        homePage.CartPage();
        waitFor(2);
        productPage.DeleteFromCart();
        waitFor(3);
    }
    @Test
    public void AddRemoveCheckout() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.HomeIcon();
        productPage.UseAppleMonitor();
        waitFor(3);
        productPage.AddProduct();
        waitFor(4);
        homePage.CartPage();
        waitFor(3);
        productPage.DeleteFromCart();
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
        waitFor(2);
        homePage.EnterMonth();
        waitFor(2);
        homePage.EnterYear();
        waitFor(2);
        homePage.ClickPurchase();
        waitFor(2);
    }
    @Test
    public void AddPhoneMonitor() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.HomeIcon();
        waitFor(3);
        productPage.IphoneSix();
        waitFor(3);
        productPage.AddProduct();
        homePage.HomeStorePage();
        waitFor(5);
        homePage.Categories();
        homePage.Monitors();
        waitFor(2);
        productPage.AddProduct();
        homePage.HomeStorePage();
        waitFor(1);
    }
    @Test
    public void EmptyCartCheckout() {
        HomePage homePage = new HomePage(getDriver());
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

    }
    @Test
    public void CartThenAddMonitor() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.CartPage();
        waitFor(5);
        homePage.HomeIcon();
        waitFor(2);
        homePage.Monitors();
        productPage.AsusMonitorBtn();
        waitFor(2);
        productPage.AddProduct();
    }
    @Test
    public void AddAppleProducts() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.HomeIcon();
        waitFor(2);
        homePage.Monitors();
        productPage.AddProduct();
        waitFor(3);
        homePage.HomeIcon();
        waitFor(1);

    }
    @Test
    public void AboutUsPageCheck() {
        HomePage homePage = new HomePage(getDriver());
        homePage.HomeStorePage();
        waitFor(5);
        homePage.AboutUsPage();
        waitFor(4);
        homePage.CloseAboutUs();
        waitFor(2);
    }

    @Test
    public void CatNextPrev() {
        HomePage homePage = new HomePage(getDriver());
        homePage.Categories();
        waitFor(3);
        homePage.Next();
        waitFor(2);
        homePage.Previous();
        waitFor(3);
    }
    @Test
    public void CartThenHome() {
        HomePage homePage = new HomePage(getDriver());
        homePage.CartPage();
        waitFor(4);
        homePage.HomeIcon();
        waitFor(2);
    }

    @Test
    public void SlideArrowCheckOut() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.SlideArrow();
        waitFor(3);
        homePage.Phones();
        productPage.SamSungPhone();
        productPage.AddProduct();
    }
    @Test
    public void BrowsePhonesThenHome() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.Phones();
        waitFor(4);
        homePage.Next();
        waitFor(4);
        homePage.Previous();
        waitFor(3);
        productPage.IphoneSix();
        waitFor(5);
        homePage.HomeIcon();
    }
    @Test
    public void AddDeleteTwo() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.HomeBtn();
        homePage.Monitors();
        waitFor(3);
        productPage.AsusMonitorBtn();
        waitFor(4);
        productPage.AddProduct();
        waitFor(3);
        productPage.IphoneSix();
        waitFor(3);
        productPage.AddProduct();
        waitFor(3);
        homePage.HomeIcon();
        waitFor(5);
        homePage.CartPage();
        waitFor(3);
        productPage.DeleteFromCart();
        waitFor(2);
        productPage.DeleteFromCart();
        waitFor(4);
    }
    @Test
    public void InvalidCheckOut() {
        HomePage homePage = new HomePage(getDriver());
        homePage.HomeIcon();
        waitFor(2);
        homePage.CartPage();
        waitFor(4);
        homePage.PlaceOrder();
        waitFor(1);
        homePage.EnterWrongName();
        waitFor(2);
        homePage.EnterWrongCountryName();
        waitFor(2);
        homePage.EnterWrongCity();
        waitFor(2);
        homePage.EnterWrongCardName();
        waitFor(1);
        homePage.EnterWrongMonth();
        waitFor(1);
        homePage.EnterWrongYear();
        waitFor(1);
        homePage.ClickPurchase();
        waitFor(4);
    }
    @Test
    public void AddProductToCart() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.HomeIcon();
        productPage.IphoneSix();
        waitFor(4);
        productPage.AddProduct();
        waitFor(3);
    }
    @Test
    public void AddSonyCheckOut() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.HomeStorePage();
        waitFor(3);
        homePage.Phones();
        waitFor(3);
        productPage.SonyPhone();
        waitFor(3);
        productPage.AddProduct();
        waitFor(2);
    }

    @Test
    public void ViewHTCAddSamsung() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.HomeIcon();
        homePage.Phones();
        waitFor(3);
        productPage.HTE();
        waitFor(3);
        homePage.HomeIcon();
        homePage.Phones();
        waitFor(3);
        productPage.SonyPhone();
        waitFor(2);
        productPage.AddProduct();
        waitFor(2);
    }

    @Test
    public void AddThree() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.LogInClick();
        waitFor(2);
        homePage.LogInUser();
        waitFor(2);
        homePage.SignInPass();
        waitFor(2);
        homePage.LogInButtonGo();
        waitFor(2);
        homePage.HomeStorePage();
        waitFor(3);
        productPage.SamSungPhone();
        waitFor(2);
        productPage.AddProduct();
        homePage.HomeStorePage();
        waitFor(3);
        productPage.NexusPhone();
        waitFor(2);
        productPage.AddProduct();
        homePage.HomeStorePage();
        productPage.IphoneSix();
        productPage.AddProduct();
        waitFor(3);
        homePage.HomeStorePage();
        waitFor(3);
        homePage.CartPage();
    }

    @Test
    public void AddDellLap() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.HomeIcon();
        waitFor(3);
        homePage.Laptops();
        productPage.DellLaptop();
        waitFor(3);
        productPage.AddProduct();
        waitFor(3);
    }
    @Test
    public void AddTwoRandom() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.HomeIcon();
        waitFor(3);
        homePage.Laptops();
        waitFor(3);
        productPage.DellLaptop();
        waitFor(3);
        productPage.AddProduct();
        waitFor(3);
        homePage.HomeBtn();
        productPage.AsusMonitorBtn();
        waitFor(3);
        productPage.AddProduct();
        waitFor(3);
        homePage.CartPage();
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
    }
    @Test
    public void DellSony() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.HomeIcon();
        waitFor(3);
        homePage.Laptops();
        waitFor(3);
        productPage.DellLaptop();
        waitFor(3);
        productPage.AddProduct();
        waitFor(3);
        homePage.HomeBtn();
        productPage.SonyPhone();
        waitFor(3);
        productPage.AddProduct();
        waitFor(3);
        homePage.CartPage();
        waitFor(2);
        homePage.PlaceOrder();
        waitFor(1);
        homePage.EnterWrongName();
        waitFor(2);
        homePage.EnterWrongCountryName();
        waitFor(2);
        homePage.EnterWrongCity();
        waitFor(2);
        homePage.EnterWrongCardName();
        waitFor(1);
        homePage.EnterWrongMonth();
        waitFor(1);
        homePage.EnterWrongYear();
        waitFor(3);
        homePage.ClickPurchase();
        waitFor(3);
    }

    @Test
    public void AddProductWrongLogin() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.HomeStorePage();
        homePage.Categories();
        waitFor(3);
        productPage.AsusMonitorBtn();
        productPage.AddProduct();
        homePage.HomeStorePage();
        waitFor(3);
        homePage.LogInClick();
        waitFor(3);
        homePage.WrongSignInUser();
        waitFor(3);
        homePage.WrongSignInPass();
        waitFor(3);
    }

    @Test
    public void SignInSonyCheckout() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.HomeBtn();
        homePage.LogInClick();
        waitFor(3);
        homePage.LogInCheckOut();
        waitFor(3);
        homePage.LogInPassCheckOut();
        waitFor(3);
        homePage.LogInButtonGo();
        waitFor(3);
        homePage.HomeIcon();
        waitFor(2);
        homePage.Laptops();
        waitFor(3);
        productPage.SonyLaptopOne();
        waitFor(3);
        productPage.AddProduct();
        waitFor(3);
        productPage.SonyLaptopTwo();
        waitFor(3);
        productPage.AddProduct();
        waitFor(3);
        homePage.CartPage();
        waitFor(3);
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
    }
    @Test
    public void SignUpAndAddTwo() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.SignUp();
        waitFor(3);
        homePage.SignUpNewUsername();
        waitFor(3);
        homePage.SignUpPassword();
        waitFor(2);
        homePage.HomeIcon();
        waitFor(2);
        homePage.Monitors();
        productPage.AsusMonitorBtn();
        productPage.AddProduct();
        homePage.HomeStorePage();
        waitFor(3);
        homePage.Monitors();
        productPage.UseAppleMonitor();
        waitFor(3);
        productPage.AddProduct();
        waitFor(3);
    }
}

