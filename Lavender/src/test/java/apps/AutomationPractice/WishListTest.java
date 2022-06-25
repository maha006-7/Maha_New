package apps.AutomationPractice;

  import base.CommonAPI;
 import org.testng.Assert;
 import org.testng.annotations.Test;
 import pages.AutomationPracticePages.AccessingAccountPage;
import pages.AutomationPracticePages.AccessingWomenPage;
import pages.AutomationPracticePages.HomePage;
import pages.AutomationPracticePages.SigninPage;

public class WishListTest extends CommonAPI {
    @Test
    public void dressToWishlist(){
        SigninPage signinPage = new SigninPage(getDriver());
        HomePage homePage= new HomePage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        homePage.typeSearchField("dresses");
        homePage.clickSearchBtn();
        accessingAccountPage.clickPrintedSummerDress();
        accessingAccountPage.clickAddToWishlist();
        String expectedSummerDressHeading ="Added to your wishlist.";
        Assert.assertEquals(expectedSummerDressHeading,accessingAccountPage.getAddedToWishlist());
    }
    @Test
    public void tshirtsTOWishlist(){
        SigninPage signinPage = new SigninPage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        AccessingWomenPage accessingWomenPage =new AccessingWomenPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        accessingWomenPage.clickWomenbtn();
        accessingWomenPage.clickTopsbtn();
        accessingWomenPage.clickTshirtsbtn();
        accessingWomenPage.clickFadedShortSleeveTshirt();
        accessingAccountPage.clickAddToWishlist();
        String expectedSummerDressHeading ="Added to your wishlist.";
        Assert.assertEquals(expectedSummerDressHeading,accessingAccountPage.getAddedToWishlist());
    }
    @Test
    public void blouseToWishlist(){
        SigninPage signinPage = new SigninPage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        AccessingWomenPage accessingWomenPage =new AccessingWomenPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        accessingWomenPage.clickWomenbtn();
        accessingWomenPage.clickTopsbtn();
        accessingWomenPage.clickBlousesbtn();
        accessingWomenPage.clickblouse();
        accessingAccountPage.clickAddToWishlist();
        String expectedSummerDressHeading ="Added to your wishlist.";
        Assert.assertEquals(expectedSummerDressHeading,accessingAccountPage.getAddedToWishlist());
    }
    @Test
    public  void casualDressToWishlist(){
        SigninPage signinPage = new SigninPage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        AccessingWomenPage accessingWomenPage =new AccessingWomenPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        accessingWomenPage.clickWomenbtn();
        accessingWomenPage.clickdressesbtn();
        accessingWomenPage.clickcasualdressesbtn();
        accessingWomenPage.clickPrintedDress();
        accessingAccountPage.clickAddToWishlist();
        String expectedSummerDressHeading ="Added to your wishlist.";
        Assert.assertEquals(expectedSummerDressHeading,accessingAccountPage.getAddedToWishlist());
    }
    @Test
    public void eveningDressToWishlist(){
        SigninPage signinPage = new SigninPage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        AccessingWomenPage accessingWomenPage =new AccessingWomenPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        accessingWomenPage.clickWomenbtn();
        accessingWomenPage.clickdressesbtn();
        accessingWomenPage.clickEveningdressesbtn();
        accessingWomenPage.clickEveningPrintedDress();
        accessingAccountPage.clickAddToWishlist();
        String expectedSummerDressHeading ="Added to your wishlist.";
        Assert.assertEquals(expectedSummerDressHeading,accessingAccountPage.getAddedToWishlist());
    }
    @Test
    public void summerDressToWishlist(){
        SigninPage signinPage = new SigninPage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        AccessingWomenPage accessingWomenPage =new AccessingWomenPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        accessingWomenPage.clickWomenbtn();
        accessingWomenPage.clickdressesbtn();
        accessingWomenPage.clickSummerdressesbtn();
        accessingWomenPage.clickPrintedChiffonDress();
        accessingAccountPage.clickAddToWishlist();
        String expectedSummerDressHeading ="Added to your wishlist.";
        Assert.assertEquals(expectedSummerDressHeading,accessingAccountPage.getAddedToWishlist());
    }
}