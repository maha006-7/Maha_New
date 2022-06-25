package apps.AutomationPractice;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPracticePages.AccessingWomenPage;
import pages.AutomationPracticePages.HomePage;



public class SearchTest extends base.CommonAPI {
    @Test
    public void searchDress() {
        HomePage homePage = new HomePage(getDriver());
        homePage.typeSearchField("dresses");
        homePage.clickSearchBtn();
        String expectedSearchDressHeading = "\"DRESSES\"";
        Assert.assertEquals(expectedSearchDressHeading, homePage.getSearchDressHeading());
    }
    @Test
    public void searchTshirts(){
        HomePage homePage = new HomePage(getDriver());
        AccessingWomenPage accessingWomenPage=new AccessingWomenPage(getDriver());
        homePage.typeSearchField("T-shirts");
        homePage.clickSearchBtn();
        accessingWomenPage.clickFadedShortSleeveTshirt();
        String expectedSearchHeading = "Quantity";
        Assert.assertEquals(expectedSearchHeading, homePage.getSearchResult());
    }
    @Test
    public void searchBlouses(){
        HomePage homePage = new HomePage(getDriver());
        AccessingWomenPage accessingWomenPage=new AccessingWomenPage(getDriver());
        homePage.typeSearchField("Blouses");
        homePage.clickSearchBtn();
        accessingWomenPage.clickblouse();
        String expectedSearchHeading = "Quantity";
        Assert.assertEquals(expectedSearchHeading, homePage.getSearchResult());

    }
   @Test
    public void searchCasualDress(){
       HomePage homePage = new HomePage(getDriver());
       AccessingWomenPage accessingWomenPage =new AccessingWomenPage(getDriver());
       homePage.typeSearchField("Casual Dresses");
       homePage.clickSearchBtn();
       accessingWomenPage.clickPrintedDress();
       String expectedSearchHeading = "Quantity";
       Assert.assertEquals(expectedSearchHeading, homePage.getSearchResult());
   }
   @Test
    public void searchEveningDress(){
       HomePage homePage = new HomePage(getDriver());
       AccessingWomenPage accessingWomenPage =new AccessingWomenPage(getDriver());
       homePage.typeSearchField("Evening Dresses");
       homePage.clickSearchBtn();
       accessingWomenPage.clickEveningPrintedDress();
       String expectedSearchHeading = "Quantity";
       Assert.assertEquals(expectedSearchHeading, homePage.getSearchResult());

   }
   @Test
    public void searchSummerDress(){
       HomePage homePage = new HomePage(getDriver());
       AccessingWomenPage accessingWomenPage =new AccessingWomenPage(getDriver());
       homePage.typeSearchField("Summer Dresses");
       homePage.clickSearchBtn();
       accessingWomenPage.clickPrintedChiffonDress();
       String expectedSearchHeading = "Quantity";
       Assert.assertEquals(expectedSearchHeading, homePage.getSearchResult());
   }
   @Test
    public void searchChiffonDress(){
       HomePage homePage = new HomePage(getDriver());
       AccessingWomenPage accessingWomenPage =new AccessingWomenPage(getDriver());
       homePage.typeSearchField("Summer Dresses");
       homePage.clickSearchBtn();
       accessingWomenPage.clickPrintedChiffonDress();
       String expectedSearchHeading = "Quantity";
       Assert.assertEquals(expectedSearchHeading, homePage.getSearchResult());
   }
}

