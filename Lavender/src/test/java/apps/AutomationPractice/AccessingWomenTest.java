package apps.AutomationPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPracticePages.AccessingWomenPage;

public class AccessingWomenTest extends base.CommonAPI {
    @Test
    public void accessingTshirts() {
        AccessingWomenPage accessingWomenPage = new AccessingWomenPage(getDriver());
        accessingWomenPage.clickWomenbtn();
        accessingWomenPage.clickTopsbtn();
        accessingWomenPage.clickTshirtsbtn();

        String message = accessingWomenPage.getHeaderText();
        Assert.assertEquals("T-SHIRTS ", message);
    }

    @Test
    public void accessingblouses() {
        AccessingWomenPage accessingWomenPage = new AccessingWomenPage(getDriver());
        accessingWomenPage.clickWomenbtn();
        accessingWomenPage.clickTopsbtn();
        accessingWomenPage.clickBlousesbtn();

        String expectedBlouseHeading = "Blouses";
        Assert.assertEquals(expectedBlouseHeading, accessingWomenPage.getBlouseHeading());
    }

    @Test
    public void accessingcasualdresses() {
        AccessingWomenPage accessingWomenPage = new AccessingWomenPage(getDriver());
        accessingWomenPage.clickWomenbtn();
        accessingWomenPage.clickdressesbtn();
        accessingWomenPage.clickcasualdressesbtn();
        String caption = "Casual Dresses";
        Assert.assertEquals(caption, accessingWomenPage.getCasualDressesHeading());

    }

    @Test
    public void eveningdresses() {
        AccessingWomenPage accessingWomenPage = new AccessingWomenPage(getDriver());
        accessingWomenPage.clickWomenbtn();
        accessingWomenPage.clickdressesbtn();
        accessingWomenPage.clickEveningdressesbtn();
        String message = accessingWomenPage.getEveningDressesHeading();
        Assert.assertEquals("Evening Dresses", message);
    }

    @Test
    public void summerdresses() {
        AccessingWomenPage accessingWomenPage = new AccessingWomenPage(getDriver());
        accessingWomenPage.clickWomenbtn();
        accessingWomenPage.clickdressesbtn();
        accessingWomenPage.clickSummerdressesbtn();
        String expectedBlouseHeading = "Summer Dresses";
        Assert.assertEquals(expectedBlouseHeading, accessingWomenPage.getSummerDressesHeading());
    }
}
