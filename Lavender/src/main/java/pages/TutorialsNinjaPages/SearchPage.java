package pages.TutorialsNinjaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class SearchPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SearchPage.class);

    @FindBy(css="#input-sort")
    private List<WebElement> sortByDropdownOptions;

    @FindBy (css="#input-limit")
    private List<String> showByDropdownOptions;

    @FindBy (css="#list-view")
    private WebElement listViewButton;

    @FindBy (css="#grid-view")
    private WebElement gridViewButton;

    @FindBy (xpath ="//*[@id='content']/h1")
    private WebElement searchResultHeading;

    @FindBy (xpath="//*[@id='content']/p[2]")
    private WebElement searchResultsMessage;

    @FindBy (css="#input-sort")
    private WebElement sortByDropDownOptions;

    @FindBy (xpath="//*[@id='content']/div[3]/div/div/div[2]/div[1]/h4/a")
    private WebElement searchResultAppleCinema;

    @FindBy(xpath="//*[@class='button-group']/button[1]")
    private WebElement addToCartButton;

    @FindBy(css="div[class='alert alert-success alert-dismissible']")
    private WebElement addToCartAlert;

    @FindBy (xpath="//*[@id=\"checkout-cart\"]/ul/li[2]/a")
    private WebElement shoppingCartTabName;

    @FindBy (css="div[class='alert alert-danger alert-dismissible']")
    private WebElement couponCodeAlert;

    @FindBy (xpath="//*[@id='content']/h2")
    private WebElement matchedProductsDisplayed;

    @FindBy (xpath ="//*[@id='product-search']/ul/li[2]/a")
    private WebElement searchResultTab;

    @FindBy(xpath="//*[@id='content']/div[3]/div/div/div[2]/div[2]/button[2]")
    private WebElement heartIconToAddToWishList;

    @FindBy(css= "div[class='alert alert-success alert-dismissible']" )
    private WebElement wishListAlertText;

    @FindBy(css="#input-limit")
    private WebElement showByDropdown;

    @FindBy (xpath = "//*[@id='input-limit']/option[5]")
    private WebElement select100FromShowByDropdown;

    @FindBy (xpath = "//*[@id='content']/div[3]/div[1]/div/div[2]/div[2]/button[3]")
    private WebElement compareProductButton;

    @FindBy (css="#compare-total")
    private WebElement productCompareHeading;



    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getHeadingName() {
          return getElementText(searchResultHeading);
    }

    public String getSearchResultMessage() {
        return getElementText(searchResultsMessage);
    }

    public void selectOptionFromSortByDropdownWithSelectOptions(String option) {
        List<WebElement> elements = getDropDownOptions(sortByDropDownOptions);
        for(WebElement element : elements) {
            if(element.getText().equalsIgnoreCase(option)) {
                element.click();
                break;
            }
        }
        LOG.info("success selecting option from sort by dropdown options");
    }

    public void clickGridViewMode() {
        click(gridViewButton);
        LOG.info("success clicking grid view button");
    }


    public void clickListViewMode() {
        click(listViewButton);
        LOG.info("success clicking list view button");
    }

    public void clickAppleCinemaResult() {
        click(searchResultAppleCinema);
        LOG.info("success clicking apple cinema result option");
    }

    public void addToCartButton() {
        click(addToCartButton);
        LOG.info("clicked add to cart button success");
    }


    public boolean addedToCartAlert(){
        return addToCartAlert.isDisplayed();
    }

    public String shoppingCartTabTitle(){
       return getElementText(shoppingCartTabName);
    }

    public boolean couponCodeAlertMessage(){
        return couponCodeAlert.isDisplayed();
    }

    public String productsMatchingCriteriaHeading(){
        return getElementText(matchedProductsDisplayed);
    }

    public boolean isGridButtonShown(){
        return isPresent(gridViewButton);
    }

    public boolean isListButtonShown(){
        return isPresent(listViewButton);
    }

    public boolean searchResultTab(){
        return isPresent(searchResultTab);
    }

    public void addToWishListFromSearchResult(){
        click(heartIconToAddToWishList);
        LOG.info("add to wish list click success");
    }

    public boolean wishListAlertDisplay(){
        return wishListAlertText.isDisplayed();
    }

    public void clickShowDropdown(){
        click(showByDropdown);
        LOG.info("click show by dropdown success");
    }

    public void select100FromShowByDropdown() {
        click(select100FromShowByDropdown);
        LOG.info("click 100 success");
    }

    public void clickCompareProductButton(){
        click(compareProductButton);
        LOG.info("click compare product button success");
    }

    public boolean productCompareLink(){
        return isPresent(productCompareHeading);
    }




}