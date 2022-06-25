package pages.HotelsPages;

import base.CommonAPI;
import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchStays extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SearchStays.class);

    @FindBy(css = "button[aria-label=\"Going to\"]")
    private WebElement searchStays;

    @FindBy(css = "input[data-stid=\"destination_form_field-menu-input\"]")
    private WebElement location;

    @FindBy(id = "date_form_field-btn")
    private WebElement checkIn;

    @FindBy(css = "button[aria-label=\"Jul 13, 2022\"]")
    private WebElement date1;

    @FindBy(css = "button[aria-label=\"Jul 24, 2022\"]")
    private WebElement date2;

    @FindBy(css = "button[data-stid=\"apply-date-picker\"]")
    private WebElement done;

    @FindBy(xpath = "//*[@id=\"lodging_search_form\"]/div/div/div[3]/div/div[1]/button")
    private WebElement travellers;

    @FindBy(css = "button[id=\"traveler_selector_done_button\"]")
    private WebElement doneBtn;

    @FindBy(css = "button[id=\"submit_button\"]")
    private WebElement searchBtn;

    @FindBy(css = "select[id=\"sort\"]")
    private WebElement sortByPrice;

    @FindBy(xpath = "//*[@id=\"paymentType-0-FREE_CANCELLATION\"]")
    private WebElement paymentType;

    @FindBy(xpath = "//body/div[@id='app-shopping-pwa']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[2]/section[2]/ol[1]/li[3]/div[1]/div[1]/div[1]/figure[1]/span[1]/div[1]/div[1]/div[2]/figure[1]/button[1]")
        private WebElement hotel;

    @FindBy(xpath = "//body/div[@id='app-shopping-pwa']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/a[1]")
    private WebElement map;

    @FindBy(css = "input[placeholder=\"e.g. Best Western\"]")
    private WebElement propertyName;

    @FindBy(css = "button[aria-label=\"Search by property name\"]")
    private WebElement property;

    @FindBy(id = "popularFilter-0-FREE_AIRPORT_TRANSPORTATION")
    private WebElement freeAirportShuttle;

    @FindBy(css = "#amenities-7-ALL_INCLUSIVE")
    private WebElement allInclusive;

    @FindBy(xpath = "//*[@id=\"popularFilter-2-KITCHEN_KITCHENETTE\"]")
    private WebElement kitchen;

    @FindBy(xpath = "//*[@id=\"mealPlan-0-FREE_BREAKFAST\"]")
    private WebElement breakfastIncluded;

    @FindBy(xpath = "//*[@id=\"radio-guestRating-45\"]")
    private WebElement wonderful;

    @FindBy(css = "label[for=\"radio-guestRating-40\"]")
    private WebElement veryGood;

    @FindBy(xpath = "//*[@id=\"radio-guestRating-35\"]")
    private WebElement good;

    @FindBy(xpath = "//*[@id=\"paymentType-1-PAY_LATER\"]")
    private WebElement reserveNow;

    @FindBy(xpath = "//*[@id=\"playback-filter-pill-mealPlan-FULL_BOARD\"]/span")
    private WebElement assertDinnerIncluded;


    @FindBy(xpath = "//*[@id=\"accessibility-1-ELEVATOR\"]")
    private WebElement elevator;

    @FindBy(xpath = "//*[@id=\"amenities-4-AIR_CONDITIONING\"]")
    private WebElement airConditioned;

    @FindBy(css = "label[for=\"radio-neighborhood-179717\"]")
    private WebElement retiro;

    @FindBy(xpath = "//*[@id=\"mealPlan-1-HALF_BOARD\"]")
    private WebElement lunchIncluded;

    @FindBy(xpath = "//label[@for=\"travelerType-2-FAMILY\"]")
    private WebElement familyFriendly;

    @FindBy(xpath = "//label[@for=\"travelerType-1-BUSINESS\"]")
    private WebElement businessFriendly;

    @FindBy(xpath = "//*[@id=\"mealPlan-2-FULL_BOARD\"]")
    private WebElement dinnerIncluded;

    @FindBy(xpath = "//body/div[@id='app-shopping-pwa']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/section[1]/form[1]/div[5]/fieldset[1]/div[1]/div[2]/button[1]")
    private WebElement seeMore;

    public SearchStays(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickSearchStays() {

        click(searchStays);
        LOG.info("clicked");

    }

    public void typeAndEnterLocation(String city) {

        typeAndEnter(location, city);
        LOG.info("location entered");

    }

    public void clickCheckIn() {

        click(checkIn);
        LOG.info("clicked");

    }

    public void clickDate1() {

        click(date1);
        LOG.info("clicked");

    }

    public void clickDate2() {

        click(date2);
        LOG.info("clicked");

    }

    public void clickDone() {

        click(done);
        LOG.info("clicked");

    }

    public void clickTravellers() {

        click(travellers);
        LOG.info("clicked");

    }

    public void clickDoneBtn() {

        click(doneBtn);
        LOG.info("clicked");

    }

    public void clickSearchBtn() {

        click(searchBtn);
        LOG.info("clicked");

    }

    public void sortByPrice(String price) {

        selectFromDropdown(sortByPrice, price);
        LOG.info("price selected");

    }

    public void clickPaymentType() {

        click(paymentType);
        LOG.info("clicked");

    }

    public void clickHotel() {

        click(hotel);
        LOG.info("clicked");

    }

    public void clickMap() {

        click(map);
        LOG.info("clicked");

    }

    public void typeAndEnterPropertyName(String property) {

        typeAndEnter(propertyName, property);
        LOG.info("property entered");

    }

    public void clickProperty() {

        click(property);
        LOG.info("clicked");

    }

    public void clickFreeShuttleAirport() {

        click(freeAirportShuttle);
        LOG.info("clicked");

    }

    public void clickAllInclusive() {

        click(allInclusive);
        LOG.info("clicked");

    }

    public void clickKitchen() {

        click(kitchen);
        LOG.info("clicked");

    }

    public void clickBreakfastIncluded() {

        click(breakfastIncluded);
        LOG.info("clicked");

    }

    public void clickWonderful() {

        click(wonderful);
        LOG.info("clicked");

    }

    public void clickVeryGood() {

        click(veryGood);
        LOG.info("clicked");

    }

    public void clickGood() {

        click(good);
        LOG.info("clicked");

    }

    public void clickReserveNow() {

        click(reserveNow);
        LOG.info("clicked");

    }

    public void clickElevator() {

        click(elevator);
        LOG.info("clicked");

    }

    public void clickAirConditioned() {

        click(airConditioned);
        LOG.info("clicked");

    }

    public void clickRetiro() {

        click(retiro);
        LOG.info("clicked");

    }

    public void clickSeeMore() {

        click(seeMore);
        LOG.info("clicked");

    }

    public void clickLunchIncluded() {

        click(lunchIncluded);
        LOG.info("clicked");

    }

    public void clickFamilyFriendly() {

        click(familyFriendly);
        LOG.info("clicked");

    }

    public void clickBusinessFriendly() {
        click(businessFriendly);
        LOG.info("clicked");

    }

    public void clickDinnerIncluded() {
        click(dinnerIncluded);
        LOG.info("clicked");

    }

    public WebElement getFreeAirportShuttle() {
        return freeAirportShuttle;

    }

    public WebElement getLocation() {
        return location;
    }

    public WebElement getKitchen() {
        return kitchen;
    }

    public WebElement getDate1() {
        return date1;
    }

    public WebElement getBreakfastIncluded() {
        return breakfastIncluded;
    }

    public WebElement getVeryGood() {
        return veryGood;
    }

    public WebElement getWonderful() {
        return wonderful;
    }

    public WebElement getGood() {
        return good;
    }

    public WebElement getReserveNow() {
        return reserveNow;
    }

    public WebElement getElevator() {
        return elevator;
    }

    public WebElement getSeeMore() {
        return seeMore;
    }



    public void assertDinnerIncludedPresent() {
        isPresent(dinnerIncluded);
    }

    public void scrollToViewSeeMore(){scrollToView(seeMore);}
}