
package apps.TutorialsNinja;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TutorialsNinjaPages.HomePage;
import pages.TutorialsNinjaPages.ProductsPage;
import pages.TutorialsNinjaPages.SearchPage;
import utility.ConnectDB;
import utility.ExcelReader;

import java.util.ArrayList;
import java.util.List;

import static utility.Utility.currentDir;

public class UserSearchTesting extends CommonAPI {
   @Test
    public void searchBarFunction() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String iphoneItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P101");
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        homePage.searchElement(iphoneItem);
        homePage.clickMagnifyingGlass();
        String expectedSearchResultHeading = excelReader.getDataFromCell("ProductList", 1, 2);
        Assert.assertEquals(expectedSearchResultHeading, searchPage.getHeadingName());
    }


    @Test
    public void searchBarFunctionWithWrongName() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String ihomeItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "INVD");
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        homePage.searchElement(ihomeItem);
        homePage.clickMagnifyingGlass();
        String expectedSearchResultHeading = excelReader.getValueForGivenHeaderAndKey("Headings",  "Page-ID", "Search-012");
        Assert.assertEquals(expectedSearchResultHeading, searchPage.getSearchResultMessage());
    }

    @Test
    public void selectSortByNameAToZFromDropdown() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String macItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P406");
        String sortByNameAZ = excelReader.getDataFromCell("SortBy Options", 1, 0);
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        homePage.searchElement(macItem);
        homePage.clickMagnifyingGlass();
        searchPage.selectOptionFromSortByDropdownWithSelectOptions(sortByNameAZ);
        String productsMatchingCriteriaMessage = excelReader.getValueForGivenHeaderAndKey("Headings","Page-ID", "Search-011");
        Assert.assertEquals(productsMatchingCriteriaMessage, searchPage.productsMatchingCriteriaHeading());
    }

   @Test
    public void selectSortByNameZToAFromDropdown() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String macItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P406");
        String sortByNameZA = excelReader.getDataFromCell("SortBy Options", 2, 0);
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        homePage.searchElement(macItem);
        homePage.clickMagnifyingGlass();
        searchPage.selectOptionFromSortByDropdownWithSelectOptions(sortByNameZA);
       String productsMatchingCriteriaMessage = excelReader.getValueForGivenHeaderAndKey("Headings","Page-ID", "Search-011");
       Assert.assertEquals(productsMatchingCriteriaMessage, searchPage.productsMatchingCriteriaHeading());
    }

   @Test
    public void selectSortByPriceHighToLowFromDropdown() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String macItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P406");
        String sortByPriceHighLow = excelReader.getDataFromCell("SortBy Options", 3, 0);
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        homePage.searchElement(macItem);
        homePage.clickMagnifyingGlass();
        searchPage.selectOptionFromSortByDropdownWithSelectOptions(sortByPriceHighLow);
        String productsMatchingCriteriaMessage = excelReader.getValueForGivenHeaderAndKey("Headings","Page-ID", "Search-011");
        Assert.assertEquals(productsMatchingCriteriaMessage, searchPage.productsMatchingCriteriaHeading());
    }

    @Test
    public void selectSortByPriceLowToHighFromDropdown() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String macItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P406");
        String sortByPriceLowHigh = excelReader.getDataFromCell("SortBy Options", 4, 0);
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        homePage.searchElement(macItem);
        homePage.clickMagnifyingGlass();
        searchPage.selectOptionFromSortByDropdownWithSelectOptions(sortByPriceLowHigh);
        String productsMatchingCriteriaMessage = excelReader.getValueForGivenHeaderAndKey("Headings","Page-ID", "Search-011");
        Assert.assertEquals(productsMatchingCriteriaMessage,searchPage.productsMatchingCriteriaHeading());
    }

   @Test
    public void selectSortByHighestRatingFromDropdown() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String macItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P406");
        String sortRatingHighest = excelReader.getDataFromCell("SortBy Options", 5, 0);
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        homePage.searchElement(macItem);
        homePage.clickMagnifyingGlass();
        searchPage.selectOptionFromSortByDropdownWithSelectOptions(sortRatingHighest);
        String productsMatchingCriteriaMessage = excelReader.getValueForGivenHeaderAndKey("Headings","Page-ID", "Search-011");
        Assert.assertEquals(productsMatchingCriteriaMessage, searchPage.productsMatchingCriteriaHeading());
    }

  @Test
    public void selectSortByLowestRatingFromDropdown() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String macItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P406");
        String sortRatingLowest = excelReader.getDataFromCell("SortBy Options", 6, 0);
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        homePage.searchElement(macItem);
        homePage.clickMagnifyingGlass();
        searchPage.selectOptionFromSortByDropdownWithSelectOptions(sortRatingLowest);
        String productsMatchingCriteriaMessage = excelReader.getValueForGivenHeaderAndKey("Headings","Page-ID", "Search-011");
        Assert.assertEquals(productsMatchingCriteriaMessage,searchPage.productsMatchingCriteriaHeading());
    }

   @Test
    public void selectSortByModelAToZFromDropdown() {
       ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
       String macItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P406");
        String sortByModelAZ = excelReader.getDataFromCell("SortBy Options", 7, 0);
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        homePage.searchElement(macItem);
        homePage.clickMagnifyingGlass();
        searchPage.selectOptionFromSortByDropdownWithSelectOptions(sortByModelAZ);
        String productsMatchingCriteriaMessage = excelReader.getValueForGivenHeaderAndKey("Headings","Page-ID", "Search-011");
        Assert.assertEquals(productsMatchingCriteriaMessage, searchPage.productsMatchingCriteriaHeading());
    }

   @Test
    public void selectSortByModelZToAFromDropdown() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String macItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P406");
        String sortByModelZA = excelReader.getDataFromCell("SortBy Options", 8, 0);
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        homePage.searchElement(macItem);
        homePage.clickMagnifyingGlass();
        searchPage.selectOptionFromSortByDropdownWithSelectOptions(sortByModelZA);
        String productsMatchingCriteriaMessage = excelReader.getValueForGivenHeaderAndKey("Headings","Page-ID", "Search-011");
        Assert.assertEquals(productsMatchingCriteriaMessage, searchPage.productsMatchingCriteriaHeading());
    }


    @Test
    public void clickGridViewMode() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String macItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P406");
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        homePage.searchElement(macItem);
        homePage.clickMagnifyingGlass();
        searchPage.clickGridViewMode();
        Assert.assertTrue(searchPage.isGridButtonShown());
    }

    @Test
    public void clickListViewMode() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String macItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P406");
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        homePage.searchElement(macItem);
        homePage.clickMagnifyingGlass();
        searchPage.clickListViewMode();
        Assert.assertTrue(searchPage.isListButtonShown());
    }

    public List<String> items() {
        List<String> items = new ArrayList<>();
        items.add("iphone");
        items.add("macbook");
        return items;
    }

    @Test
    public void searchMultipleItems() {
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage((getDriver()));
        for(String item: items()) {
            homePage.searchElementAndEnter(item);
            homePage.clearSearchBar();
        }
        Assert.assertTrue(searchPage.searchResultTab());
    }

    @Test
    public void viewProductDescription(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String appleCinemaItem= excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P304");
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        ProductsPage productsPage = new ProductsPage(getDriver());
        homePage.searchElementAndEnter(appleCinemaItem);
        searchPage.clickAppleCinemaResult();
        productsPage.viewProductDescription();
        String productDescriptionText= productsPage.productDescriptionInformation();
        String productDescriptionInfoText= excelReader.getValueForGivenHeaderAndKey("Headings", "Page-ID","PDesc- 201");
        Assert.assertEquals(productDescriptionInfoText, productDescriptionText);
    }
    @Test
    public void viewProductSpecifications(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String appleCinemaItem= excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P304");
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        ProductsPage productsPage = new ProductsPage(getDriver());
        homePage.searchElementAndEnter(appleCinemaItem);
        searchPage.clickAppleCinemaResult();
        productsPage.viewProductSpecifications();
        String productPageTitle= productsPage.productPageResultHeading();
        String appleCinemaSearchResultName = excelReader.getDataFromCell("ProductList", 4, 2);
        Assert.assertEquals(appleCinemaSearchResultName, productPageTitle);
    }


  @Test
    public void writeProductReview(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String appleCinemaItem= excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P304");
        String writeReviewMessage = excelReader.getValueForGivenHeaderAndKey("Headings", "Page-ID", "Rev-300");
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        ProductsPage productsPage = new ProductsPage(getDriver());
        homePage.searchElementAndEnter(appleCinemaItem);
        searchPage.clickAppleCinemaResult();
        productsPage.writeAReviewButton();
        String writeAReviewHeadingMessage = productsPage.writeAReviewHeading();
        Assert.assertEquals(writeReviewMessage, writeAReviewHeadingMessage);
    }

    @Test
    public void showAllDesktopProducts(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String showDesktopItems= excelReader.getDataFromCell("Types of Products", 1, 0);
        HomePage homePage = new HomePage(getDriver());
        homePage.clickDesktopsTab();
        homePage.clickShowAllDesktopOption();
        String desktopProductsDisplayHeading = homePage.desktopItemsDisplayMessage();
        Assert.assertEquals(showDesktopItems, desktopProductsDisplayHeading);
    }

    @Test
    public void showAllLaptopAndNotebooksProducts(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String showLaptopNotebookItems= excelReader.getDataFromCell("Types of Products", 2, 0);
        HomePage homePage = new HomePage(getDriver());
        homePage.clickLaptopsAndNotebooksTab();
        homePage.clickShowAllLaptopsAndNotebookOption();
        String laptopAndNotebooksDisplayHeading = homePage.laptopAndNotebookDisplayMessage();
        Assert.assertEquals(showLaptopNotebookItems, laptopAndNotebooksDisplayHeading);
    }

   @Test
    public void showAllComponentsProducts(){
       ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
       String showComponentsItems= excelReader.getDataFromCell("Types of Products", 3, 0);
        HomePage homePage = new HomePage(getDriver());
        homePage.clickComponentsTab();
        homePage.clickShowAllComponentsOption();
        String componentsDisplayHeading = homePage.componentsDisplayMessage();
        Assert.assertEquals(showComponentsItems, componentsDisplayHeading);
    }

    @Test
    public void showAllTabletProducts(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String showTabletItems= excelReader.getDataFromCell("Types of Products", 4, 0);
        HomePage homePage = new HomePage(getDriver());
        homePage.clickTabletsTab();
        String tabletsDisplayHeading = homePage.tabletsDisplayMessage();
        Assert.assertEquals(showTabletItems, tabletsDisplayHeading);
    }

    @Test
    public void showAllSoftwareProducts(){
        ExcelReader excelReader = new ExcelReader("/Users/simaakhter/IdeaProjects/SeleniumLavender/data/TutorialsNinja.xlsx" );
        String softwareItems= excelReader.getDataFromCell("Types of Products", 5, 0);
        HomePage homePage = new HomePage(getDriver());
        homePage.clickSoftwareTab();
        String softwareDisplayHeading = homePage.softwareDisplayMessage();
        Assert.assertEquals(softwareItems, softwareDisplayHeading);
    }
//
    @Test
    public void showAllPhoneAndPDAProducts(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String showPhonePDAItems= excelReader.getDataFromCell("Types of Products", 6, 0);
        HomePage homePage = new HomePage(getDriver());
        homePage.clickPhonesAndPDAsTab();
        String phoneAndPDADisplayHeading = homePage.phoneAndPDADisplayMessage();
        Assert.assertEquals(showPhonePDAItems, phoneAndPDADisplayHeading);
    }


    @Test
    public void showAllCameraProducts() {
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String showCameraItems= excelReader.getDataFromCell("Types of Products", 7, 0);
        HomePage homePage = new HomePage(getDriver());
        homePage.clickCamerasTab();
        String cameraDisplayHeading = homePage.cameraDisplayMessage();
        Assert.assertEquals(showCameraItems, cameraDisplayHeading);
    }

    @Test
    public void showAllMP3PlayerProducts(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String showMP3PlayerItems= excelReader.getDataFromCell("Types of Products", 8, 0);
        HomePage homePage = new HomePage(getDriver());
        homePage.clickMP3PlayersTab();
        homePage.clickShowAllMP3PlayersOption();
        String mp3PlayersDisplayHeading = homePage.mp3PlayersDisplayMessage();
        Assert.assertEquals(showMP3PlayerItems, mp3PlayersDisplayHeading);
    }

    @Test
    public void selectEuroCurrency(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String showCurrency= excelReader.getValueForGivenHeaderAndKey("Headings", "Page-ID", "Crt-401");
        HomePage homePage = new HomePage(getDriver());
        homePage.clickCurrencyButton();
        homePage.selectEuroCurrency();
        String euroCurrencySymbolDisplay = homePage.euroCurrencySymbol();
        Assert.assertEquals(showCurrency, euroCurrencySymbolDisplay);
    }

    @Test
    public void addToWishList(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String iphoneItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P101");
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        homePage.searchElement(iphoneItem);
        homePage.clickMagnifyingGlass();
        searchPage.addToWishListFromSearchResult();
        Assert.assertTrue(searchPage.wishListAlertDisplay());
    }

    @Test
    public void show100Items(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String macItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P406");
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        homePage.searchElement(macItem);
        homePage.clickMagnifyingGlass();
        searchPage.clickShowDropdown();
        searchPage.select100FromShowByDropdown();
        String productMatchingSearchHeading = searchPage.productsMatchingCriteriaHeading();
        String resultPageHeading = excelReader.getValueForGivenHeaderAndKey("Headings","Page-ID", "Result-111");
        Assert.assertEquals(resultPageHeading,productMatchingSearchHeading);

    }

    @Test
    public void compareProducts(){
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TutorialsNinja.xlsx");
        String macItem = excelReader.getValueForGivenHeaderAndKey("ProductList", "Product ID", "P406");
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        homePage.searchElement(macItem);
        homePage.clickMagnifyingGlass();
        searchPage.clickCompareProductButton();
        Assert.assertTrue(searchPage.productCompareLink());
    }


}

