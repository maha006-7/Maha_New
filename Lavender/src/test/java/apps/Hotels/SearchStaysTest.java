
package apps.Hotels;

import base.CommonAPI;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelsPages.SearchStays;

import java.time.Duration;
import java.util.Set;

public class SearchStaysTest extends CommonAPI {

    String location = "Madrid";


    @Test
    public void searchStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        Assert.assertEquals(getPageTitle(), "Madrid (and vicinity), Community of Madrid, Spain Hotel Search Results");
    }


    //Handling dropdown
    @Test
    public void sortByPriceStays() {

        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        searchStays.sortByPrice("Price");
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"playback-filter-pill-sort-PRICE_LOW_TO_HIGH\"]/span")));

    }


    @Test
    public void filterFullyRefundableStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
        searchStays.clickPaymentType();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"playback-filter-pill-paymentType-FREE_CANCELLATION\"]/span")));

    }


    @Test
    public void bookStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(searchStays.getDate1()));
        waitFor(9);
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        searchStays.clickHotel();
        Set<String> child = getDriver().getWindowHandles();
        for (String window : child) {
            getDriver().switchTo().window(window);
        }
        isInteractable(getDriver().findElement(By.cssSelector("button[data-stid=\"sticky-button\"]")));


    }


    @Test
    public void seeInTheMapStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        searchStays.clickMap();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"app-layer-tools-map\"]/div[2]/div/div[1]/section/h2")));
    }


    String propertyName = "Iberostar";

    @Test
    public void searchByPropertyStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        waitFor(2);
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        searchStays.clickProperty();
        searchStays.typeAndEnterPropertyName(propertyName);
        boolean isDisplayed = getDriver().findElement(By.xpath("//button[@id=\"playback-filter-pill-hotelName-Iberostar\"]")).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }


    @Test
    public void filterByFreeAirportShuttleStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(searchStays.getLocation()));
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", searchStays.getFreeAirportShuttle());
        searchStays.clickFreeShuttleAirport();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"playback-filter-pill-amenities-FREE_AIRPORT_TRANSPORTATION\"]/span")));

    }

    @Test
    public void filterByAllInclusive() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,3000)", "");
        searchStays.clickSeeMore();
        searchStays.clickAllInclusive();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"app-layer-base\"]/div[1]/main/div/div/div/div[1]/section/div/div[2]/div/div[2]/section[1]/header/div/div[1]/div/div")));


    }

    @Test
    public void filterByKitchenStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(searchStays.getDate1()));
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,3000)", "");
        searchStays.clickSeeMore();
        searchStays.clickKitchen();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"playback-filter-pill-amenities-KITCHEN_KITCHENETTE\"]")));


    }

    @Test
    public void filterByBreakfastIncludedStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,3000)", "");
        searchStays.clickSeeMore();
        searchStays.clickBreakfastIncluded();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"playback-filter-pill-mealPlan-FREE_BREAKFAST\"]/span")));


    }

    @Test
    public void filterByVeryGoodStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", searchStays.getVeryGood());
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(searchStays.getVeryGood()));
        searchStays.clickVeryGood();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"playback-filter-pill-guestRating-40\"]/span")));


    }

    @Test
    public void filterByWonderfulStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", searchStays.getWonderful());
        searchStays.clickWonderful();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"playback-filter-pill-guestRating-45\"]/span")));

    }

    @Test
    public void filterByGoodStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", searchStays.getGood());
        searchStays.clickGood();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"playback-filter-pill-guestRating-35\"]/span")));


    }

    @Test
    public void filterByReserveNowPayLaterStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,1000)", "");
        searchStays.clickReserveNow();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"playback-filter-pill-paymentType-PAY_LATER\"]/span")));


    }

    @Test
    public void filterByElevatorStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,3000)", "");
        searchStays.clickSeeMore();
        searchStays.clickElevator();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"playback-filter-pill-accessibility-ELEVATOR\"]/span")));


    }

    @Test
    public void filterByRetiroStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,2000)", "");
        searchStays.clickRetiro();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"playback-filter-pill-neighborhood-179717\"]/span")));

    }

    @Test
    public void filterByAirConditionedStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,3000)", "");
        searchStays.clickSeeMore();
        searchStays.clickAirConditioned();
        isPresent(getDriver().findElement(By.xpath("//button[@id='playback-filter-pill-amenities-AIR_CONDITIONING']")));

    }

    @Test
    public void filterByLunchIncludedStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,3000)", "");
        searchStays.clickLunchIncluded();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"playback-filter-pill-mealPlan-HALF_BOARD\"]/span")));

    }

    @Test
    public void filterByFamilyFriendlyStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,3000)", "");
        searchStays.clickSeeMore();
        searchStays.clickFamilyFriendly();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"playback-filter-pill-travelerType-FAMILY\"]/span")));

    }

    @Test
    public void filterByBusinessFriendlyStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,3000)", "");
        searchStays.clickBusinessFriendly();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"playback-filter-pill-travelerType-BUSINESS\"]/span")));

    }

    @Test
    public void filterByDinnerIncludedStays() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,3000)", "");
        searchStays.clickSeeMore();
        searchStays.clickDinnerIncluded();
        searchStays.assertDinnerIncludedPresent();

    }


    //Handling drag drop price
    @Test
    public void filterByBudget() {
        SearchStays searchStays = new SearchStays(getDriver());
        searchStays.clickSearchStays();
        searchStays.typeAndEnterLocation(location);
        searchStays.clickCheckIn();
        searchStays.clickDate1();
        searchStays.clickDate2();
        searchStays.clickDone();
        searchStays.clickTravellers();
        searchStays.clickDoneBtn();
        searchStays.clickSearchBtn();
        dragAndDrop(getDriver(), getDriver().findElement(By.xpath("//*[@id=\"price-slider-primary\"]")), getDriver().findElement(By.xpath("//*[@id=\"price-slider-secondary\"]")));
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"playback-filter-pill-price-0.0-150.0\"]/span")));
    }


}
