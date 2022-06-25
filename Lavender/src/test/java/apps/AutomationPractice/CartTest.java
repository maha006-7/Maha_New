package apps.AutomationPractice;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPracticePages.AccessingAccountPage;
import pages.AutomationPracticePages.AccessingWomenPage;
import pages.AutomationPracticePages.HomePage;
import pages.AutomationPracticePages.SigninPage;

public class CartTest extends CommonAPI {
    @Test
    public void tshirtsToCart() {
        SigninPage signinPage = new SigninPage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        AccessingWomenPage accessingWomenPage = new AccessingWomenPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        accessingWomenPage.clickWomenbtn();
        accessingWomenPage.clickTopsbtn();
        accessingWomenPage.clickTshirtsbtn();
        accessingWomenPage.clickFadedShortSleeveTshirt();
        accessingAccountPage.clickAddToCart();
        waitFor(3);
        String expectedAddedToCartHeading = "Product successfully added to your shopping cart";
        Assert.assertEquals(expectedAddedToCartHeading, accessingAccountPage.getAddedToCart());
    }

    @Test
    public void blouseToCart() {
        SigninPage signinPage = new SigninPage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        AccessingWomenPage accessingWomenPage = new AccessingWomenPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        accessingWomenPage.clickWomenbtn();
        accessingWomenPage.clickTopsbtn();
        accessingWomenPage.clickBlousesbtn();
        accessingWomenPage.clickblouse();
        accessingAccountPage.clickAddToCart();
        waitFor(3);
        String expectedAddedToCartHeading = "Product successfully added to your shopping cart";
        Assert.assertEquals(expectedAddedToCartHeading, accessingAccountPage.getAddedToCart());
    }

    @Test
    public void casualDressToCart() {
        SigninPage signinPage = new SigninPage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        AccessingWomenPage accessingWomenPage = new AccessingWomenPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        accessingWomenPage.clickWomenbtn();
        accessingWomenPage.clickdressesbtn();
        accessingWomenPage.clickcasualdressesbtn();
        accessingWomenPage.clickPrintedDress();
        accessingAccountPage.clickAddToCart();
        waitFor(3);
        String expectedAddedToCartHeading = "Product successfully added to your shopping cart";
        Assert.assertEquals(expectedAddedToCartHeading, accessingAccountPage.getAddedToCart());
    }

    @Test
    public void eveningDressToCart() {
        SigninPage signinPage = new SigninPage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        AccessingWomenPage accessingWomenPage = new AccessingWomenPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        accessingWomenPage.clickWomenbtn();
        accessingWomenPage.clickdressesbtn();
        accessingWomenPage.clickEveningdressesbtn();
        accessingWomenPage.clickEveningPrintedDress();
        accessingAccountPage.clickAddToCart();
        waitFor(3);
        String expectedAddedToCartHeading = "Product successfully added to your shopping cart";
        Assert.assertEquals(expectedAddedToCartHeading, accessingAccountPage.getAddedToCart());
    }

    @Test
    public void summerDressToCart() {
        SigninPage signinPage = new SigninPage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        AccessingWomenPage accessingWomenPage = new AccessingWomenPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        accessingWomenPage.clickWomenbtn();
        accessingWomenPage.clickdressesbtn();
        accessingWomenPage.clickSummerdressesbtn();
        accessingWomenPage.clickPrintedChiffonDress();
        accessingAccountPage.clickAddToCart();
        waitFor(3);
        String expectedAddedToCartHeading = "Product successfully added to your shopping cart";
        Assert.assertEquals(expectedAddedToCartHeading, accessingAccountPage.getAddedToCart());

    }

    @Test
    public void itemToCart() {
        HomePage homePage = new HomePage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        homePage.typeSearchField("dresses");
        homePage.clickSearchBtn();
        accessingAccountPage.clickPrintedSummerDress();
        accessingAccountPage.clickAddToCart();
        waitFor(3);
        String expectedAddedToCartHeading = "Product successfully added to your shopping cart";
        Assert.assertEquals(expectedAddedToCartHeading, accessingAccountPage.getAddedToCart());

    }


}
