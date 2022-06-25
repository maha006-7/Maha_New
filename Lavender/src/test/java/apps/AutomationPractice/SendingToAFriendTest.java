package apps.AutomationPractice;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPracticePages.AccessingAccountPage;
import pages.AutomationPracticePages.AccessingWomenPage;
import pages.AutomationPracticePages.SigninPage;

public class SendingToAFriendTest extends CommonAPI {
    @Test
    public void sendingTshirts() {
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
        accessingAccountPage.clickSendToAFriendBtn();
        accessingAccountPage.typeNameOfFriend("John");
        accessingAccountPage.typeEmailOfFriend("john@gmail.com");
        accessingAccountPage.clickFinalSendToFriendBtn();
        String expectedSendToAFriendHeading = "Send to a friend";
        Assert.assertEquals(expectedSendToAFriendHeading, accessingAccountPage.getSendToAFriendHeading());
    }
    @Test
    public void sendingBlouse(){
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
        accessingAccountPage.clickSendToAFriendBtn();
        accessingAccountPage.typeNameOfFriend("John");
        accessingAccountPage.typeEmailOfFriend("john@gmail.com");
        accessingAccountPage.clickFinalSendToFriendBtn();
        String expectedSendToAFriendHeading = "Send to a friend";
        Assert.assertEquals(expectedSendToAFriendHeading, accessingAccountPage.getSendToAFriendHeading());
    }
    @Test
    public void sendingCasualDress(){
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
        accessingAccountPage.clickSendToAFriendBtn();
        accessingAccountPage.typeNameOfFriend("John");
        accessingAccountPage.typeEmailOfFriend("john@gmail.com");
        accessingAccountPage.clickFinalSendToFriendBtn();
        String expectedSendToAFriendHeading = "Send to a friend";
        Assert.assertEquals(expectedSendToAFriendHeading, accessingAccountPage.getSendToAFriendHeading());
    }
    @Test
    public void sendingEveningDress(){
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
        accessingAccountPage.clickSendToAFriendBtn();
        accessingAccountPage.typeNameOfFriend("John");
        accessingAccountPage.typeEmailOfFriend("john@gmail.com");
        accessingAccountPage.clickFinalSendToFriendBtn();
        String expectedSendToAFriendHeading = "Send to a friend";
        Assert.assertEquals(expectedSendToAFriendHeading, accessingAccountPage.getSendToAFriendHeading());
    }
    @Test
    public void SendingSummerDress(){
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
        accessingAccountPage.clickSendToAFriendBtn();
        accessingAccountPage.typeNameOfFriend("John");
        accessingAccountPage.typeEmailOfFriend("john@gmail.com");
        accessingAccountPage.clickFinalSendToFriendBtn();
        String expectedSendToAFriendHeading = "Send to a friend";
        Assert.assertEquals(expectedSendToAFriendHeading, accessingAccountPage.getSendToAFriendHeading());
    }
}
