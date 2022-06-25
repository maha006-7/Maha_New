package apps.AutomationPractice;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPracticePages.AccessingAccountPage;
import pages.AutomationPracticePages.AccessingWomenPage;
import pages.AutomationPracticePages.SigninPage;

public class WritingReviewTest extends CommonAPI {
    @Test
    public void tshirtsReview(){
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
        accessingAccountPage.clickWriteAReviewBtn();
        accessingAccountPage.typeTitleOfReview("Good");
        accessingAccountPage.typeCommentOfReview("According to my expectation");
        accessingAccountPage.clickReviewSendBtn();
        String expectedNewCommentHeading = "New comment";
        Assert.assertEquals(expectedNewCommentHeading,accessingAccountPage.getNewCommentHeading());
    }
    @Test
    public void blouseReview(){
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
        accessingAccountPage.clickWriteAReviewBtn();
        accessingAccountPage.typeTitleOfReview("Good");
        accessingAccountPage.typeCommentOfReview("According to my expectation");
        accessingAccountPage.clickReviewSendBtn();
        String expectedNewCommentHeading = "New comment";
        Assert.assertEquals(expectedNewCommentHeading,accessingAccountPage.getNewCommentHeading());
    }
    @Test
    public void casualDressReview(){
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
        accessingAccountPage.clickWriteAReviewBtn();
        accessingAccountPage.typeTitleOfReview("Good");
        accessingAccountPage.typeCommentOfReview("According to my expectation");
        accessingAccountPage.clickReviewSendBtn();
        String expectedNewCommentHeading = "New comment";
        Assert.assertEquals(expectedNewCommentHeading,accessingAccountPage.getNewCommentHeading());
    }
    @Test
    public void eveningDressReview(){
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
        accessingAccountPage.clickWriteAReviewBtn();
        accessingAccountPage.typeTitleOfReview("Good");
        accessingAccountPage.typeCommentOfReview("According to my expectation");
        accessingAccountPage.clickReviewSendBtn();
        String expectedNewCommentHeading = "New comment";
        Assert.assertEquals(expectedNewCommentHeading,accessingAccountPage.getNewCommentHeading());
    }
    @Test
    public void summerDressReview(){
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
        accessingAccountPage.clickWriteAReviewBtn();
        accessingAccountPage.typeTitleOfReview("Good");
        accessingAccountPage.typeCommentOfReview("According to my expectation");
        accessingAccountPage.clickReviewSendBtn();
        String expectedNewCommentHeading = "New comment";
        Assert.assertEquals(expectedNewCommentHeading,accessingAccountPage.getNewCommentHeading());
    }
}
