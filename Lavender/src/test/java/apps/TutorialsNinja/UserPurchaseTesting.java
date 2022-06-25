
package apps.TutorialsNinja;

import base.CommonAPI;
import org.testng.Assert;
import pages.TutorialsNinjaPages.HomePage;
import pages.TutorialsNinjaPages.SearchPage;
import org.testng.annotations.Test;
import pages.TutorialsNinjaPages.ShoppingCartPage;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class UserPurchaseTesting extends CommonAPI {


    @Test
    public void addToCartFunction() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String iphoneItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P101");
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        homePage.searchElement(iphoneItem);
        homePage.clickMagnifyingGlass();
        searchPage.addToCartButton();
        Assert.assertTrue(searchPage.addedToCartAlert());
    }

    @Test
    public void viewCartAfterItemAdded() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String iphoneItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P101");
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        homePage.searchElement(iphoneItem);
        homePage.clickMagnifyingGlass();
        searchPage.addToCartButton();
        homePage.viewCartButton();
        String shoppingCartTabName= searchPage.shoppingCartTabTitle();
        String shoppingCartTabHeading= excelReader.getDataFromCell("Function Buttons", 2, 0);
        Assert.assertEquals(shoppingCartTabHeading, shoppingCartTabName);
    }

    @Test
    public void enterCouponCode() {
            ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
            String iphoneItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P101");
            String shippingCouponCode = excelReader.getValueForGivenHeaderAndKey("Benefits", "Benefits", "Shipping");
            HomePage homePage = new HomePage(getDriver());
            SearchPage searchPage = new SearchPage(getDriver());
            ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
            homePage.searchElementAndEnter(iphoneItem);
            searchPage.addToCartButton();
            homePage.viewCartButton();
            shoppingCartPage.useCouponCodeOption();
            shoppingCartPage.typeCouponCode(shippingCouponCode);
            shoppingCartPage.clickApplyCouponButton();
            Assert.assertTrue(searchPage.couponCodeAlertMessage());
        }

        @Test
        public void estimateShippingAndTaxesForProduct() {
            ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
            String iphoneItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P101");
            HomePage homePage = new HomePage(getDriver());
            SearchPage searchPage = new SearchPage(getDriver());
            ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
            homePage.searchElementAndEnter(iphoneItem);
            homePage.clickMagnifyingGlass();
            searchPage.addToCartButton();
            homePage.viewCartButton();
            shoppingCartPage.estimateShippingAndTaxesOption();
            shoppingCartPage.selectCountryOptionFromDropDown("United States");
            shoppingCartPage.typeZipCode("10021");
            shoppingCartPage.clickGetQuoteButton();
            String missingCountryMessage = excelReader.getValueForGivenHeaderAndKey("Headings", "Page-ID", "CR-001");
            String shippingAndTaxesEstimationErrorMessage= shoppingCartPage.estimateShippingAndTaxesErrorMessage();
            Assert.assertEquals(missingCountryMessage, shippingAndTaxesEstimationErrorMessage);
        }

        @Test
        public void viewCheckoutPage() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String sonyVAIOItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P203");
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        homePage.searchElement(sonyVAIOItem);
        homePage.clickMagnifyingGlass();
        searchPage.addToCartButton();
        homePage.viewCheckoutButton();
        String checkoutHeadingMessage=shoppingCartPage.checkoutHeadingText();
        String checkoutName = excelReader.getDataFromCell("Function Buttons", 1, 0);
        Assert.assertEquals(checkoutName, checkoutHeadingMessage);
        }

    @Test
    public void useGiftCertificate(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String iphoneItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P101");
        String giftCertificateCode = excelReader.getValueForGivenHeaderAndKey("Benefits", "Benefits", "Gift Certificate");
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        homePage.searchElementAndEnter(iphoneItem);
        searchPage.addToCartButton();
        homePage.viewCartButton();
        shoppingCartPage.useGiftCertificateOptionOption();
        shoppingCartPage.typeGiftCertificateCode(giftCertificateCode);
        shoppingCartPage.clickApplyGiftCertificateButton();
        Assert.assertTrue(shoppingCartPage.giftCertificateInteraction());

    }

   @Test
    public void changingItemQuantity(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String iphoneItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P101");
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        homePage.searchElementAndEnter(iphoneItem);
        searchPage.addToCartButton();
        homePage.viewCartButton();
        shoppingCartPage.clickQuantityBar();
        shoppingCartPage.clearQuantityBar();
        shoppingCartPage.enterQuantityAmount("2");
        shoppingCartPage.updateCartButton();
        Assert.assertTrue(shoppingCartPage.updateCartButtonFunction());

    }

    @Test
    public void continueShoppingButton(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String iphoneItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P101");
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        homePage.searchElementAndEnter(iphoneItem);
        searchPage.addToCartButton();
        homePage.viewCartButton();
        shoppingCartPage.clickContinueShoppingButtonFromShoppingCart();
        Assert.assertTrue(homePage.isLogoPresent());
    }

    @Test
    public void returnToHomePageFromShoppingPage(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String iphoneItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P101");
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        homePage.searchElementAndEnter(iphoneItem);
        searchPage.addToCartButton();
        homePage.viewCartButton();
        shoppingCartPage.clickReturnHomeButton();
        Assert.assertTrue(homePage.isLogoPresent());

    }




}

