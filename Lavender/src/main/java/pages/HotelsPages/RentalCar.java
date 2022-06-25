package pages.HotelsPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RentalCar extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(RentalCar.class);

    @FindBy(css = "button[class=\"uitk-button uitk-button-medium uitk-button-has-text uitk-button-tertiary uitk-menu-trigger global-navigation-nav-button\"]")
    private WebElement moreTravel;

    @FindBy(xpath = "//div[contains(text(),'Car Rental')]")
    private WebElement carRental;

    @FindBy(css = "input[name=\"pickupLocation\"]")
    private WebElement pickupLocation;

    @FindBy(css = "li[id=\"item-0-1\"]")
    private WebElement location;

    @FindBy(css = "input[id=\"pickupDate\"")
    private WebElement pickupDate;

    @FindBy(css = "td[data-date=\"2022,7,15\"]")
    private WebElement date1;

    @FindBy(css = "input[id=\"returnDate\"]")
    private WebElement returnDate;

    @FindBy(css = "td[data-date=\"2022,7,20\"]")
    private WebElement date2;

    @FindBy(xpath = "/html/body/div[3]/div/div/button")
    private WebElement cookies;

    @FindBy(css = "button[name=\"searchCarsFormBtn\"]")
    private WebElement searchBtn;

    @FindBy(css = "label[for=\"transmission-auto\"]")
    private WebElement transmissionAuto;

    @FindBy(xpath = "//*[@id=\"ct-search-results\"]/div[2]/ct-availability-list-header/div/div/ct-availability-list-sorting/div/div/div[2]/button[2]/span")
    private WebElement priceLowToHigh;

    @FindBy(xpath = "//*[@id=\"ct-container\"]/div/div[2]/div[2]/ct-availability-list-carousel/ct-horizontal-scroll/div/div[1]/div/div/div/div/div[4]/ct-availability-list-carousel-item/div/div/div[1]/span")
    private WebElement SUV;

    @FindBy(xpath = "//div[@class=\"hide-child-dn aq_font_family fr\"]")
    private WebElement region;

    @FindBy(xpath = "//div[@class=\"relative hide-child-dn sans-serif aq_bg_container\"]/div[2]/a[1]")
    private WebElement currency;

    @FindBy(css = "label[for=\"mileage-limited\"]")
    private WebElement limitedMileage;

    @FindBy(css = "button[data-auto-id=\"btnEdit\"]")
    private WebElement edit;

    @FindBy(css = "label[aria-label=\"dropoffCheckbox\"]")
    private WebElement dropOffLocation;

    @FindBy(css = "input[name=\"dropdown-returnLocation\"]")
    private WebElement dropOff;

    @FindBy(xpath = "//li[@id=\"item-1-0\"]")
    private WebElement newLocation;

    @FindBy(css = "button[name=\"searchCarsFormBtn\"]")
    private WebElement search;

    @FindBy(css = "label[for=\"supplier-sixt\"]")
    private WebElement sixt;

    @FindBy(xpath = "//*[@id=\"ct-search-results\"]/div[2]/ct-availability-list-header/div/div/ct-availability-list-sorting/div/div/div[2]/button[3]")
    private WebElement rating;

    @FindBy(xpath = "//div[@for=\"passengers-5\"]")
    private WebElement fivePassengers;

    @FindBy(xpath = "//label[@for=\"fuelPolicy-electricvehicle\"]")
    private WebElement fullyCharged;
    @FindBy(xpath = "//*[@id=\"ct-filter\"]/div/div[5]/div/ct-availability-list-filter-group/div/div[2]/div[2]/ul/li[2]/div/label")
    private WebElement fullToFull;

    public RentalCar(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickMoreTravel() {
        click(moreTravel);
        LOG.info("clicked");
    }

    public void clickCarRental() {
        click(carRental);
        LOG.info("clicked");
    }

    public void typePickupLocation(String location) {
        type(pickupLocation, location);
        LOG.info("pickup location entered");
    }

    public void clickLocation() {
        click(location);
        LOG.info("clicked");
    }

    public void clickPickupDate() {
        click(pickupDate);
        LOG.info("clicked");
    }

    public void clickDate1() {
        click(date1);
        LOG.info("clicked");
    }

    public void clickReturnDate() {
        click(returnDate);
        LOG.info("clicked");
    }

    public void clickDate2() {
        click(date2);
        LOG.info("clicked");
    }

    public void clickCookies() {
        click(cookies);
        LOG.info("clicked");
    }

    public void clickSearchBtn() {
        click(searchBtn);
        LOG.info("clicked");
    }

    public void clickTransmissionAuto() {
        click(transmissionAuto);
        LOG.info("clicked");
    }

    public void clickLimitedMileage() {
        click(limitedMileage);
        LOG.info("clicked");
    }

    public void clickPriceLowToHigh() {
        click(priceLowToHigh);
        LOG.info("clicked");
    }

    public void clickFullToFull() {
        click(fullToFull);
        LOG.info("clicked");
    }

    public void clickSUV() {
        click(SUV);
        LOG.info("clicked");
    }

    public void clickDropOffLocation() {
        click(dropOffLocation);
        LOG.info("clicked");
    }

    public WebElement getRegion() {
        return region;
    }

    public void clickCurrency() {
        click(currency);
        LOG.info("clicked");
    }

    public void clickEdit() {
        click(edit);
        LOG.info("clicked");
    }

    public void typeAndEnterDropOffLocation(String dropOffLocation) {
        typeAndEnter(dropOff, dropOffLocation);
        LOG.info("drop off location entered");
    }

    public void clickNewLocation() {
        click(newLocation);
        LOG.info("clicked");
    }

    public void clickSearch() {
        click(search);
        LOG.info("clicked");
    }

    public void clickSixt() {
        click(sixt);
        LOG.info("clicked");
    }

    public void clickRating() {
        click(rating);
        LOG.info("clicked");
    }

    public void clickFivePassengers() {
        click(fivePassengers);
        LOG.info("clicked");
    }

    public void clickFullyCharged() {
        click(fullyCharged);
        LOG.info("clicked");
    }

}