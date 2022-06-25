

package apps.DemoBlaze;

import base.CommonAPI;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.DemoBlazePages.ContactPage;
import pages.DemoBlazePages.HomePage;
import pages.DemoBlazePages.ProductPage;
public class Verify extends CommonAPI {

//    private final Logger LOG = LoggerFactory.getLogger(Verify.class);
    @Test
    public void MonitorsPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.Monitors();
        waitFor(3);
    }
    @Test
    public void LaptopsPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.Laptops();
        waitFor(3);
    }
    @Test
    public void LaptopPagesThenNext() {
        HomePage homePage = new HomePage(getDriver());
        homePage.HomeIcon();
        waitFor(3);
        homePage.Laptops();
        waitFor(3);
        homePage.Next();
        waitFor(3);
        homePage.Previous();
        waitFor(3);
        homePage.HomeIcon();
        waitFor(3);
    }
    @Test
    public void NextButton() {
        HomePage homePage = new HomePage(getDriver());
        homePage.Next();
        waitFor(3);
    }
    @Test
    public void PreviousButton() {
        HomePage homePage = new HomePage(getDriver());
        homePage.Previous();
        waitFor(3);
    }
    @Test
    public void ViewCart() {
        HomePage homePage = new HomePage(getDriver());
        homePage.CartPage();
        waitFor(3);
    }
    @Test
    public void HomeStore() {
        HomePage homePage = new HomePage(getDriver());
        homePage.HomeStorePage();
        waitFor(3);
    }
    @Test
    public void HomeIcons() {
        HomePage homePage = new HomePage(getDriver());
        homePage.HomeIcon();
        waitFor(3);
    }
    @Test
    public void AddToCart() {
        HomePage homePage = new HomePage(getDriver());
        homePage.Laptops();
        waitFor(3);
    }
    @Test
    public void CategoriesButton() {
        HomePage homePage = new HomePage(getDriver());
        homePage.Categories();
        waitFor(3);
    }
    @Test
    public void Contact() {
        HomePage homePage = new HomePage(getDriver());
        homePage.ContactBtn();
        waitFor(3);
    }
    @Test
    public void PhonesPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.Phones();
        waitFor(3);
    }
    @Test
    public void SlideArrows() {
        HomePage homePage = new HomePage(getDriver());
        homePage.SlideArrow();
        waitFor(3);
    }
    @Test
    public void AllSlideArrows() {
        HomePage homePage = new HomePage(getDriver());
        homePage.HomeIcon();
        waitFor(3);
        homePage.SlideArrow();
        waitFor(3);
        homePage.SlideArrow();
        waitFor(3);
        homePage.SlideArrow();
        waitFor(3);
    }
    @Test
    public void AboutUsPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.HomeIcon();
        waitFor(5);
        homePage.AboutUsPage();
        waitFor(4);
    }


    @Test
    public void AboutUsVidOpen(){
        HomePage homePage = new HomePage(getDriver());
        homePage.HomeIcon();
        waitFor(5);
        homePage.AboutUsPage();
        waitFor(4);
        homePage.AboutUsVideo();
        waitFor(15);
        homePage.CloseAboutUs();
        waitFor(4);
    }
    @Test
    public void ScrollBottom() {
        HomePage homePage = new HomePage(getDriver());
        homePage.HomeStorePage();
        waitFor(3);
        homePage.ScrollToBottom();
        waitFor(3);
    }
    @Test
    public void SlideThenMessage() {
        HomePage homePage = new HomePage(getDriver());
        ContactPage contactPage = new ContactPage(getDriver());
        homePage.HomeIcon();
        waitFor(2);
        homePage.SlideArrow();
        waitFor(2);
        homePage.SlideArrow();
        waitFor(2);
        homePage.ContactBtn();
        waitFor(3);
        contactPage.ContactEmailTab();
        waitFor(3);
        contactPage.ContactNameTab();
        waitFor(3);
        contactPage.NewMessage();
        waitFor(3);
        contactPage.SendMessage();
        waitFor(4);
    }
    @Test
    public void AboutThenContact() {
        HomePage homePage = new HomePage(getDriver());
        ContactPage contactPage = new ContactPage(getDriver());
        homePage.AboutUsPage();
        waitFor(3);
        homePage.CloseAboutUs();
        homePage.ContactBtn();
        contactPage.ContactEmailTab();
        waitFor(3);
        contactPage.ContactNameTab();
        waitFor(3);
        contactPage.NewMessage();
        waitFor(3);
        contactPage.AboutUsMessage();
        waitFor(4);
        contactPage.SendMessage();
        waitFor(3);
    }

    @Test
    public void ViewEachMonitor() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.HomeIcon();
        homePage.LogInClick();
        waitFor(3);
        homePage.LogInUser();
        waitFor(3);
        homePage.SignInPass();
        waitFor(3);
        homePage.LogInButtonGo();
        waitFor(3);
        waitFor(3);
        homePage.Monitors();
        waitFor(3);
        productPage.AsusMonitorBtn();
        waitFor(3);
        homePage.HomeIcon();
        waitFor(3);
        homePage.Monitors();
        waitFor(3);
        productPage.UseAppleMonitor();
        waitFor(3);
        homePage.HomeIcon();
    }
//
    @Test
    public void ViewEachLaptop() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.HomeStorePage();
        waitFor(2);
        homePage.LogInClick();
        waitFor(3);
        homePage.LogInUser();
        waitFor(3);
        homePage.SignInPass();
        waitFor(3);
        homePage.LogInButtonGo();
        waitFor(3);
        homePage.HomeBtn();
        waitFor(3);
        homePage.Laptops();
        waitFor(3);
        productPage.DellLaptop();
        waitFor(3);
        homePage.HomeIcon();
        waitFor(3);
        homePage.Laptops();
        waitFor(3);
        productPage.SonyLaptopOne();
        waitFor(3);
        homePage.HomeIcon();
        waitFor(3);
        homePage.Laptops();
        waitFor(3);
        productPage.SonyLaptopTwo();
        waitFor(3);
        homePage.HomeIcon();
        waitFor(3);
        homePage.Laptops();
        waitFor(3);
        productPage.LaptopThree();
        waitFor(3);
        homePage.HomeIcon();
        waitFor(3);
        homePage.Laptops();
        waitFor(3);
        productPage.LaptopFour();
        waitFor(3);
    }
    @Test
    public void SlideThenScroll() {
        HomePage homePage = new HomePage(getDriver());
        homePage.HomeBtn();
        waitFor(2);
        homePage.SlideArrow();
        waitFor(2);
        homePage.SlideArrow();
        waitFor(2);
        homePage.Previous();
        waitFor(3);
    }

    @Test
    public void SlideThenAbout() {
        HomePage homePage = new HomePage(getDriver());
        homePage.HomeIcon();
        waitFor(2);
        homePage.SlideArrow();
        waitFor(2);
        homePage.SlideArrow();
        waitFor(2);
        homePage.HomeIcon();
        waitFor(3);
        homePage.AboutUsPage();
        waitFor(3);
        homePage.CloseAboutUs();

    }
}


