
package apps.TutorialsNinja;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TutorialsNinjaPages.*;
import utility.ConnectDB;
import utility.ExcelReader;

import java.util.List;

import static utility.Utility.currentDir;

public class UserAccountTesting extends CommonAPI {

    ConnectDB connectDB = new ConnectDB();
    List<String> userName = connectDB.readMysqlDataBaseColumn("SignIn", "Email_Address");
    String username = userName.get(0);
    List<String> userPassword = connectDB.readMysqlDataBaseColumn("SignIn", "Password");
    String password = userPassword.get(0);


   @Test
    public void registerNewAccount() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String userAccountCreationHeading = excelReader.getValueForGivenHeaderAndKey("User Account Information", "Message ID", "M100");
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        RegisterAccountPage registerAccountPage = new RegisterAccountPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.clickContinueRegistrationButton();
        registerAccountPage.typeFirstNameForRegistration("lav");
        registerAccountPage.typeLastNameForRegistration("val");
        //change email everytime
        registerAccountPage.typeEmailForRegistration("lavval007646477092@gmail.com");
        registerAccountPage.typeTelephoneForRegistration("1234567");
        registerAccountPage.typePasswordForRegistration("lavlav");
        registerAccountPage.typeConfirmPasswordForRegistration("lavlav");
        registerAccountPage.clickCheckBoxForPrivacyPolicy();
        registerAccountPage.clickContinueRegistrationButton();
        String registrationHeading = registerAccountPage.getRegistrationHeader();
        Assert.assertEquals(userAccountCreationHeading, registrationHeading);
    }

    @Test
    public void registerNewAccountWithoutAgreeingToPolicy() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String userRegisterAccountHeading = excelReader.getValueForGivenHeaderAndKey("User Account Information", "Message ID", "M110");
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        RegisterAccountPage registerAccountPage = new RegisterAccountPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.clickContinueRegistrationButton();
        registerAccountPage.typeFirstNameForRegistration("lav");
        registerAccountPage.typeLastNameForRegistration("val");
        //change email everytime
        registerAccountPage.typeEmailForRegistration("lavval008888676760920@gmail.com");
        registerAccountPage.typeTelephoneForRegistration("1234567");
        registerAccountPage.typePasswordForRegistration("lavlav");
        registerAccountPage.typeConfirmPasswordForRegistration("lavlav");
        registerAccountPage.clickContinueRegistrationButton();
        String registrationHeading = registerAccountPage.getRegistrationHeader();
        Assert.assertEquals(userRegisterAccountHeading, registrationHeading);
    }


    @Test
    public void loginWithValidCredentials() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String userAccountHeading = excelReader.getValueForGivenHeaderAndKey("User Account Information", "Message ID", "M200");
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        UserAccountPage userAccountPage = new UserAccountPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        String myAccountHeading = userAccountPage.myAccountHeadingText();
        Assert.assertEquals(userAccountHeading, myAccountHeading);
    }

    @Test
    public void loginWithInValidEmail() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String returningCustomerHeading = excelReader.getValueForGivenHeaderAndKey("User Account Information", "Message ID", "M210");
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin("lavlav@gmail.com");
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        String returningUserHeading = loginPage.returningUserHeading();
        Assert.assertEquals(returningCustomerHeading, returningUserHeading);
    }

    @Test
    public void loginWithInValidPassword() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin("lavlav2000");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.passwordAlertDisplay());
    }

    @Test
    public void forgotPasswordFunction() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String userForgotPassword = excelReader.getValueForGivenHeaderAndKey("User Account Information", "Message ID", "M300");
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.clickForgottenPasswordButton();
        String forgotPasswordHeading = loginPage.forgotPasswordHeading();
        Assert.assertEquals(userForgotPassword, forgotPasswordHeading);
    }

    @Test
    public void editYourAccountInformationFunction() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String userEditInformation = excelReader.getValueForGivenHeaderAndKey("User Account Information", "Message ID", "M310");
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        EditInformationPage editInformationPage = new EditInformationPage(getDriver());
        UserAccountPage userAccountPage = new UserAccountPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        userAccountPage.clickEditAccountInformation();
        String editAccountInformation = editInformationPage.editInformationTabName();
        Assert.assertEquals(userEditInformation, editAccountInformation);
    }

    @Test
    public void editYourPhoneNumber() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        UserAccountPage userAccountPage = new UserAccountPage(getDriver());
        EditInformationPage editInformationPage = new EditInformationPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        userAccountPage.clickEditAccountInformation();
        editInformationPage.enterPhoneInEditAccountInformation("1234");
        editInformationPage.clickContinueButtonInEditInformationPage();
        //Assert.assertTrue(editInformationPage.updatedAccountAlert());
    }

    @Test
    public void editYourEmailAddress() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        UserAccountPage userAccountPage = new UserAccountPage(getDriver());
        EditInformationPage editInformationPage = new EditInformationPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        userAccountPage.clickEditAccountInformation();
        editInformationPage.clearEmailInputBar();
        editInformationPage.enterEmailInEditAccountInformation("lavlav30090@gmail.com");
        //editInformationPage.clickContinueButtonInEditInformationPage();
        //Assert.assertTrue(editInformationPage.updatedAccountAlert());
    }

    @Test
    public void changeYourPassword() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        UserAccountPage userAccountPage = new UserAccountPage(getDriver());
        ChangePasswordPage changePasswordPage = new ChangePasswordPage(getDriver());
        EditInformationPage editInformationPage = new EditInformationPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        userAccountPage.clickChangeYourPasswordOption();
        changePasswordPage.enterNewPassword("lavlav30");
        changePasswordPage.confirmNewPassword("lavlav30");
        //changePasswordPage.clickChangePasswordContinueButton();
        //Assert.assertTrue(editInformationPage.updatedAccountAlert());
    }

    @Test
    public void modifyWishList(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String userModifyWishList = excelReader.getValueForGivenHeaderAndKey("User Account Information", "Message ID", "M320");
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        UserAccountPage userAccountPage = new UserAccountPage(getDriver());
        EditInformationPage editInformationPage = new EditInformationPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        userAccountPage.clickModifyYourWishList();
        String wishListHeadingText = userAccountPage.myWishListHeadingText();
        Assert.assertEquals(userModifyWishList, wishListHeadingText);
    }

    @Test
    public void removeFromWishList(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String iphoneItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P101");
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        UserAccountPage userAccountPage = new UserAccountPage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        MyWishListPage myWishListPage = new MyWishListPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        userAccountPage.clickSearchBarInUserAccountPage();
        userAccountPage.typeAndEnterIntoSearBarFromUserAccountPage(iphoneItem);
        searchPage.addToWishListFromSearchResult();
        homePage.clickHomepageWishListButton();
        myWishListPage.clickRemoveFromWishListButton();
        Assert.assertTrue(myWishListPage.removedFromWishListAlert());
    }

    @Test
    public void addFromWishListToCart(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String iphoneItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P101");
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        UserAccountPage userAccountPage = new UserAccountPage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        MyWishListPage myWishListPage = new MyWishListPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        userAccountPage.clickSearchBarInUserAccountPage();
        userAccountPage.typeAndEnterIntoSearBarFromUserAccountPage(iphoneItem);
        searchPage.addToWishListFromSearchResult();
        homePage.clickHomepageWishListButton();
        myWishListPage.clickAddToCartFromWishListButton();
        Assert.assertTrue(myWishListPage.addedFromWishListToShoppingCartAlert());
    }

    @Test
    public void changeFirstName(){
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        UserAccountPage userAccountPage = new UserAccountPage(getDriver());
        EditInformationPage editInformationPage = new EditInformationPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        userAccountPage.clickEditAccountInformation();
        editInformationPage.clearFirstNameInInputBar();
        editInformationPage.enterFirstNameInEditAccountInformation("lavv");
        Assert.assertTrue(editInformationPage.firstNameVerification());
    }

    @Test
    public void changeLastName(){
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        UserAccountPage userAccountPage = new UserAccountPage(getDriver());
        EditInformationPage editInformationPage = new EditInformationPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        userAccountPage.clickEditAccountInformation();
        editInformationPage.clearLastNameInInputBar();
        editInformationPage.enterLastNameInEditAccountInformation("vval");
        Assert.assertTrue(editInformationPage.lastNameVerification());
    }

     @Test
    public void changeYourPasswordWithWrongConfirmation() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        UserAccountPage userAccountPage = new UserAccountPage(getDriver());
        ChangePasswordPage changePasswordPage = new ChangePasswordPage(getDriver());
        EditInformationPage editInformationPage = new EditInformationPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        userAccountPage.clickChangeYourPasswordOption();
        changePasswordPage.enterNewPassword("lavlav30");
        changePasswordPage.confirmNewPassword("lavlav3000000");
        changePasswordPage.clickChangePasswordContinueButton();
 //       Assert.assertTrue(editInformationPage.updatedAccountAlert());
    }

    @Test
    public void viewOrderHistory(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String orderHistory = excelReader.getDataFromCell("User Account Services", 1, 0 );
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        UserAccountPage userAccountPage = new UserAccountPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        userAccountPage.clickViewYourOrderHistory();
        String orderHistoryHeading = userAccountPage.orderHistoryHeading();
        Assert.assertEquals(orderHistory, orderHistoryHeading);

    }

    @Test
    public void viewDownloads(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String accountDownloads = excelReader.getDataFromCell("User Account Services", 2, 0 );
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        UserAccountPage userAccountPage = new UserAccountPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        userAccountPage.clickDownloads();
        String accountDownload = userAccountPage.accountDownloadsHeading();
        Assert.assertEquals(accountDownloads, accountDownload);

    }

   @Test
    public void viewYourRewardPoints(){
       ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
       String viewRewards = excelReader.getDataFromCell("User Account Services", 3, 0 );
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        UserAccountPage userAccountPage = new UserAccountPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        userAccountPage.clickYourRewardsPoints();
        String viewRewardPoints = userAccountPage.yourRewardsPointsHeading();
        Assert.assertEquals(viewRewards,viewRewardPoints);
    }

    @Test
    public void viewYourReturnRequests(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String userReturnRequests = excelReader.getDataFromCell("User Account Services", 4, 0 );
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        UserAccountPage userAccountPage = new UserAccountPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        userAccountPage.clickViewYourReturnRequests();
        String viewUserReturnRequest =userAccountPage. productReturnsHeading();
        Assert.assertEquals(userReturnRequests, viewUserReturnRequest);

    }

    @Test
    public void viewYourTransactions(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String viewTransactions = excelReader.getDataFromCell("User Account Services", 5, 0 );
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        UserAccountPage userAccountPage = new UserAccountPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        userAccountPage.clickYourTransactions();
        String userTransactions = userAccountPage.yourTransactionsHeading();
        Assert.assertEquals(viewTransactions, userTransactions);

    }

   @Test
    public void viewRecurringPayments(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String recurringPayments = excelReader.getDataFromCell("User Account Services", 6, 0 );
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        UserAccountPage userAccountPage = new UserAccountPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        userAccountPage.clickRecurringPayments();
        String userRecurringPayments = userAccountPage.recurringPayment();
        Assert.assertEquals(recurringPayments, userRecurringPayments);

    }


 @Test
    public void logoutOfAccount() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String accountLogout = excelReader.getValueForGivenHeaderAndKey("User Account Information", "Message ID", "M400");
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        UserAccountPage userAccountPage = new UserAccountPage(getDriver());
        homePage.clickMyAccountDropdownButton();
        homePage.selectLoginOptionFromMyAccountDropdown();
        loginPage.enterEmailAddressToLogin(username);
        loginPage.enterPasswordToLogin(password);
        loginPage.clickLoginButton();
        userAccountPage.clickLogoutButton();
        String logoutOfAccount = userAccountPage.accountLogoutHeading();
        Assert.assertEquals(accountLogout, logoutOfAccount);

    }

}

