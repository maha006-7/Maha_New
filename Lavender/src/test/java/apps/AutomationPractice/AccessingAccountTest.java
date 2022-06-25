package apps.AutomationPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPracticePages.AccessingAccountPage;
import pages.AutomationPracticePages.AccessingWomenPage;
import pages.AutomationPracticePages.SigninPage;

public class AccessingAccountTest extends base.CommonAPI {
    @Test
    public void orderhistory() {
        SigninPage signinPage = new SigninPage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        accessingAccountPage.clickOrderHistoryAndDetails();
        String expectedSearchResultHeading = "ORDER HISTORY";
        Assert.assertEquals(expectedSearchResultHeading, accessingAccountPage.getHeadingName());

    }


    @Test
    public void creditslip() {
        SigninPage signinPage = new SigninPage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        String expectedSearchResultMessage = "MY ACCOUNT";
        Assert.assertEquals(expectedSearchResultMessage, accessingAccountPage.getMessageName());
    }


    @Test
    public void address() {
        SigninPage signinPage = new SigninPage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        accessingAccountPage.clickMyAddress();
        String expectedAccessingMyAddressMessage = "MY ADDRESSES";
        Assert.assertEquals(expectedAccessingMyAddressMessage, accessingAccountPage.getAccessingAddressMessage());
    }

    @Test
    public void updatingaddressLine2() {
        SigninPage signinPage = new SigninPage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        accessingAccountPage.clickMyAddress();
        accessingAccountPage.clickUpdatingAddress();
        accessingAccountPage.typeMyAddressLine2Field("123123");
        accessingAccountPage.clickSaveAddressbtn();
        String expectedUpdatingAddressLine2Field = "MY ADDRESS 2";
        Assert.assertEquals(expectedUpdatingAddressLine2Field, accessingAccountPage.getUpdatingAddressLine2Fieldheading());

    }


    @Test
    public void addingNewaddress() {
        SigninPage signinPage = new SigninPage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        accessingAccountPage.clickMyAddress();
        accessingAccountPage.clickAddNewAddressbtn();
        accessingAccountPage.typeAddress1field("123678");
        accessingAccountPage.typeCityField("new york");
        accessingAccountPage.clickState();
        accessingAccountPage.clickNewYork();
        accessingAccountPage.typeZipCodeField("11436");
        accessingAccountPage.typeHomePhoneField("123456789");
        accessingAccountPage.typeMobilePhoneField("987654321");
        accessingAccountPage.typeReference(" 2");
        accessingAccountPage.clickSaveNewAddressBtn();
        String pageTitle = getPageTitle();
        Assert.assertEquals("Address - My Store", pageTitle);

    }

    @Test
    public void deletingaddress() {
        SigninPage signinPage = new SigninPage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        accessingAccountPage.clickMyAddress();
        accessingAccountPage.clickDeleteAddress();
        String pageTitle = getPageTitle();
        Assert.assertEquals("Address - My Store", pageTitle);
    }


    @Test
    public void personalinfo(){
        SigninPage signinPage = new SigninPage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        accessingAccountPage.clickPersonalInfo();
        String expectedPersonalInfoHeading = "YOUR PERSONAL INFORMATION";
        Assert.assertEquals(expectedPersonalInfoHeading,accessingAccountPage.getPersonalInfoHeading());
    }


    @Test
    public void wishlist() {
        SigninPage signinPage = new SigninPage(getDriver());
        AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        accessingAccountPage.clickWishlistBtn();
        String expectedAccessingWishlistHeading = "MY WISHLISTS";
        Assert.assertEquals(expectedAccessingWishlistHeading, accessingAccountPage.getAccessingWishlistHeading());
    }
    @Test
       public void addingWishlist(){
            SigninPage signinPage = new SigninPage(getDriver());
            AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());

        signinPage.clickSignin();
        signinPage.typeEmail("anicatohfa@gmail.com");
        signinPage.typePassword("12345");
        signinPage.clickFinalSignin();
        accessingAccountPage.clickWishlistBtn();
        accessingAccountPage.typeAddNewWishlist("m1");
        accessingAccountPage.clickSaveNewWishlistBtn();
        String expectedAddNewWishlistHeading = "m1";
        Assert.assertEquals(expectedAddNewWishlistHeading,accessingAccountPage.getAddNewWishlistHeading());
    }


        @Test
    public void viewingWishlist() {
            SigninPage signinPage = new SigninPage(getDriver());
            AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
            signinPage.clickSignin();
            signinPage.typeEmail("anicatohfa@gmail.com");
            signinPage.typePassword("12345");
            signinPage.clickFinalSignin();
            accessingAccountPage.clickWishlistBtn();
            accessingAccountPage.clickm1ViewBtn();
        }

            @Test
            public void updatingAddress () {
                SigninPage signinPage = new SigninPage(getDriver());
                AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
                signinPage.clickSignin();
                signinPage.typeEmail("anicatohfa@gmail.com");
                signinPage.typePassword("12345");
                signinPage.clickFinalSignin();
                accessingAccountPage.clickMyAddress();
                accessingAccountPage.clickUpdatingAddress();
                accessingAccountPage.clearAddressLine1();
                accessingAccountPage.typeAddressLine1("123678");
                accessingAccountPage.clickSaveNewAddressBtn();
                String expectedUpdatingAddressLine2Field = "MY ADDRESS 2";
                Assert.assertEquals(expectedUpdatingAddressLine2Field, accessingAccountPage.getUpdatingAddressLine2Fieldheading());
            }
            @Test
            public void changingCity () {
                SigninPage signinPage = new SigninPage(getDriver());
                AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
                signinPage.clickSignin();
                signinPage.typeEmail("anicatohfa@gmail.com");
                signinPage.typePassword("12345");
                signinPage.clickFinalSignin();
                accessingAccountPage.clickMyAddress();
                accessingAccountPage.clickUpdatingAddress();
                accessingAccountPage.clearCity();
                accessingAccountPage.typeCity("Jamaica");
                accessingAccountPage.clickSaveNewAddressBtn();
                String expectedUpdatingAddressLine2Field = "MY ADDRESS 2";
                Assert.assertEquals(expectedUpdatingAddressLine2Field, accessingAccountPage.getUpdatingAddressLine2Fieldheading());
            }

            @Test
            public void changeZipCode () {
                SigninPage signinPage = new SigninPage(getDriver());
                AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
                signinPage.clickSignin();
                signinPage.typeEmail("anicatohfa@gmail.com");
                signinPage.typePassword("12345");
                signinPage.clickFinalSignin();
                accessingAccountPage.clickMyAddress();
                accessingAccountPage.clickUpdatingAddress();
                accessingAccountPage.clearZipCode();
                accessingAccountPage.typeZipCodeField("11433");
                accessingAccountPage.clickSaveNewAddressBtn();
                String expectedUpdatingAddressLine2Field = "MY ADDRESS 2";
                Assert.assertEquals(expectedUpdatingAddressLine2Field, accessingAccountPage.getUpdatingAddressLine2Fieldheading());
            }
            @Test
            public void changingHomePhone () {
                SigninPage signinPage = new SigninPage(getDriver());
                AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
                signinPage.clickSignin();
                signinPage.typeEmail("anicatohfa@gmail.com");
                signinPage.typePassword("12345");
                signinPage.clickFinalSignin();
                accessingAccountPage.clickMyAddress();
                accessingAccountPage.clickUpdatingAddress();
                accessingAccountPage.clearHomePhone();
                accessingAccountPage.typeHomePhoneField("123789");
                accessingAccountPage.clickSaveNewAddressBtn();
                String expectedUpdatingAddressLine2Field = "MY ADDRESS 2";
                Assert.assertEquals(expectedUpdatingAddressLine2Field, accessingAccountPage.getUpdatingAddressLine2Fieldheading());

            }
            @Test
            public void changingMobilePhone () {
                SigninPage signinPage = new SigninPage(getDriver());
                AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
                signinPage.clickSignin();
                signinPage.typeEmail("anicatohfa@gmail.com");
                signinPage.typePassword("12345");
                signinPage.clickFinalSignin();
                accessingAccountPage.clickMyAddress();
                accessingAccountPage.clickUpdatingAddress();
                accessingAccountPage.clearMobilePhone();
                accessingAccountPage.typeMobilePhoneField("789123");
                accessingAccountPage.clickSaveNewAddressBtn();
                String expectedUpdatingAddressLine2Field = "MY ADDRESS 2";
                Assert.assertEquals(expectedUpdatingAddressLine2Field, accessingAccountPage.getUpdatingAddressLine2Fieldheading());

            }
            @Test
    public void accessingDelivery(){
                AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
                AccessingWomenPage accessingWomenPage = new AccessingWomenPage(getDriver());
                accessingWomenPage.clickTshirts();
                accessingAccountPage.clickInformationBtn();
                accessingAccountPage.clickDeliveryBtn();
                String expectedDeliveryHeading = "Delivery";
                Assert.assertEquals(expectedDeliveryHeading,accessingAccountPage.getDeliveryHeading());
            }
            @Test
    public void accessingLegalNotice(){
                AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
                AccessingWomenPage accessingWomenPage = new AccessingWomenPage(getDriver());
                accessingWomenPage.clickTshirts();
                accessingAccountPage.clickInformationBtn();
                accessingAccountPage.clickLegalNotice();
                String expectedLegalNoticeHeading = "Legal Notice";
                Assert.assertEquals(expectedLegalNoticeHeading,accessingAccountPage.getLegalNoticeHeading());
            }
            @Test
    public void accessingTerms(){
                AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
                AccessingWomenPage accessingWomenPage = new AccessingWomenPage(getDriver());
                accessingWomenPage.clickTshirts();
                accessingAccountPage.clickInformationBtn();
                accessingAccountPage.clickTerms();
                String expectedTermsHeading = "Terms and conditions of use";
                Assert.assertEquals(expectedTermsHeading,accessingAccountPage.getTermsHeading());
            }
            @Test
    public void accessingAboutUs(){
                AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
                AccessingWomenPage accessingWomenPage = new AccessingWomenPage(getDriver());
                accessingWomenPage.clickTshirts();
                accessingAccountPage.clickInformationBtn();
                accessingAccountPage.clickAboutUs();
                String expectedAboutUsHeading ="About us";
                Assert.assertEquals(expectedAboutUsHeading,accessingAccountPage.getAboutUsHeading());
            }
            @Test
    public void accessingSecurePayment(){
                AccessingAccountPage accessingAccountPage = new AccessingAccountPage(getDriver());
                AccessingWomenPage accessingWomenPage = new AccessingWomenPage(getDriver());
                accessingWomenPage.clickTshirts();
                accessingAccountPage.clickInformationBtn();
                accessingAccountPage.clickSecurePayment();
                String expectedSecurePaymentHeading ="Secure payment";
                Assert.assertEquals(expectedSecurePaymentHeading,accessingAccountPage.getSecurePaymentHeading());
            }
        }
