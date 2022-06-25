
package apps.Hotels;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelsPages.RentalCar;

public class RentalCarTest extends CommonAPI {

    String pickupLocation = "Madrid";

    @Test
    public void browseRentalCar() {
        RentalCar rentalCar = new RentalCar(getDriver());
        rentalCar.clickMoreTravel();
        rentalCar.clickCarRental();
        rentalCar.typePickupLocation(pickupLocation);
        rentalCar.clickLocation();
        rentalCar.clickPickupDate();
        rentalCar.clickDate1();
        rentalCar.clickReturnDate();
        rentalCar.clickDate2();
        rentalCar.clickCookies();
        rentalCar.clickSearchBtn();
        isPresent(getDriver().findElement(By.xpath("//li[contains(text(),\" Search Results \")]")));

    }

    @Test
    public void browseAutomaticRentalCar() {
        RentalCar rentalCar = new RentalCar(getDriver());
        rentalCar.clickMoreTravel();
        rentalCar.clickCarRental();
        rentalCar.typePickupLocation(pickupLocation);
        rentalCar.clickLocation();
        rentalCar.clickPickupDate();
        rentalCar.clickDate1();
        rentalCar.clickReturnDate();
        rentalCar.clickDate2();
        rentalCar.clickCookies();
        rentalCar.clickSearchBtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
        rentalCar.clickTransmissionAuto();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"ct-search-results\"]/div[2]/ct-availability-list-header/div/ct-availability-filters-applied/div/div/div/div[2]/span")));

    }

    @Test
    public void sortByPriceRentalCar() {
        RentalCar rentalCar = new RentalCar(getDriver());
        rentalCar.clickMoreTravel();
        rentalCar.clickCarRental();
        rentalCar.typePickupLocation(pickupLocation);
        rentalCar.clickLocation();
        rentalCar.clickPickupDate();
        rentalCar.clickDate1();
        rentalCar.clickReturnDate();
        rentalCar.clickDate2();
        rentalCar.clickCookies();
        rentalCar.clickSearchBtn();
        rentalCar.clickPriceLowToHigh();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"ct-search-results\"]/div[2]/ct-availability-list-header/div/div/ct-availability-list-sorting/div/div/div[2]/button[2]/span")));

    }

    @Test
    public void browseSUVRentalCar() {
        RentalCar rentalCar = new RentalCar(getDriver());
        rentalCar.clickMoreTravel();
        rentalCar.clickCarRental();
        rentalCar.typePickupLocation(pickupLocation);
        rentalCar.clickLocation();
        rentalCar.clickPickupDate();
        rentalCar.clickDate1();
        rentalCar.clickReturnDate();
        rentalCar.clickDate2();
        rentalCar.clickCookies();
        rentalCar.clickSearchBtn();
        rentalCar.clickSUV();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"ct-search-results\"]/div[2]/ct-availability-list-header/div/ct-availability-filters-applied/div/div/div/div[2]/span")));

    }

    @Test
    public void changeCurrencyRentalCar() {
        RentalCar rentalCar = new RentalCar(getDriver());
        rentalCar.clickMoreTravel();
        rentalCar.clickCarRental();
        waitFor(2);
        hoverOver(getDriver(),rentalCar.getRegion());
        rentalCar.clickCurrency();
        isPresent(getDriver().findElement(By.xpath("//div[@class=\"aq-lang-main-name mh1 dib f5 v-mid ttu\"]")));

    }

    @Test
    public void limitedMileageRentalCar() {
        RentalCar rentalCar = new RentalCar(getDriver());
        rentalCar.clickMoreTravel();
        waitFor(2);
        rentalCar.clickCarRental();
        rentalCar.typePickupLocation(pickupLocation);
        rentalCar.clickLocation();
        rentalCar.clickPickupDate();
        rentalCar.clickDate1();
        rentalCar.clickReturnDate();
        rentalCar.clickDate2();
        rentalCar.clickCookies();
        rentalCar.clickSearchBtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
        rentalCar.clickLimitedMileage();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"ct-search-results\"]/div[2]/ct-availability-list-header/div/ct-availability-filters-applied/div/div/div/div[2]/span")));

    }

    String dropOffLocation="Barcelona";
    @Test
    public void editDropOffLocationRentalCar() {
        RentalCar rentalCar = new RentalCar(getDriver());
        rentalCar.clickMoreTravel();
        waitFor(2);
        rentalCar.clickCarRental();
        rentalCar.typePickupLocation(pickupLocation);
        rentalCar.clickLocation();
        rentalCar.clickPickupDate();
        rentalCar.clickDate1();
        rentalCar.clickReturnDate();
        rentalCar.clickDate2();
        rentalCar.clickCookies();
        rentalCar.clickSearchBtn();
        rentalCar.clickEdit();
        waitFor(2);
        rentalCar.clickDropOffLocation();
        rentalCar.typeAndEnterDropOffLocation(dropOffLocation);
        rentalCar.clickNewLocation();
        rentalCar.clickSearch();
        isPresent(getDriver().findElement(By.cssSelector("label[ng-bind=\"::i18n('Dropoff')\"]")));

    }

    @Test
    public void browseSixtRentalCar() {
        RentalCar rentalCar = new RentalCar(getDriver());
        rentalCar.clickMoreTravel();
        rentalCar.clickCarRental();
        waitFor(2);
        rentalCar.typePickupLocation(pickupLocation);
        rentalCar.clickLocation();
        rentalCar.clickPickupDate();
        rentalCar.clickDate1();
        rentalCar.clickReturnDate();
        rentalCar.clickDate2();
        rentalCar.clickCookies();
        rentalCar.clickSearchBtn();
        rentalCar.clickSixt();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"ct-search-results\"]/div[2]/ct-availability-list-header/div/ct-availability-filters-applied/div/div/div/div[2]/span")));

    }
    @Test
    public void sortByRatingRentalCar() {
        RentalCar rentalCar = new RentalCar(getDriver());
        rentalCar.clickMoreTravel();
        waitFor(2);
        rentalCar.clickCarRental();
        rentalCar.typePickupLocation(pickupLocation);
        rentalCar.clickLocation();
        rentalCar.clickPickupDate();
        rentalCar.clickDate1();
        rentalCar.clickReturnDate();
        rentalCar.clickDate2();
        rentalCar.clickCookies();
        rentalCar.clickSearchBtn();
        rentalCar.clickRating();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"ct-search-results\"]/div[2]/ct-availability-list-header/div/div/ct-availability-list-sorting/div/div/div[2]/button[3]/span")));

    }

    @Test
    public void browseFivePassengersRentalCar() {
        RentalCar rentalCar = new RentalCar(getDriver());
        rentalCar.clickMoreTravel();
        rentalCar.clickCarRental();
        rentalCar.typePickupLocation(pickupLocation);
        rentalCar.clickLocation();
        rentalCar.clickPickupDate();
        rentalCar.clickDate1();
        rentalCar.clickReturnDate();
        rentalCar.clickDate2();
        rentalCar.clickCookies();
        rentalCar.clickSearchBtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,2000);");
        rentalCar.clickFivePassengers();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"ct-search-results\"]/div[2]/ct-availability-list-header/div/ct-availability-filters-applied/div/div/div/div[2]/span")));

    }

    @Test
    public void browseFullyChargedRentalCar() {
        RentalCar rentalCar = new RentalCar(getDriver());
        rentalCar.clickMoreTravel();
        rentalCar.clickCarRental();
        rentalCar.typePickupLocation(pickupLocation);
        rentalCar.clickLocation();
        rentalCar.clickPickupDate();
        rentalCar.clickDate1();
        rentalCar.clickReturnDate();
        rentalCar.clickDate2();
        rentalCar.clickCookies();
        rentalCar.clickSearchBtn();
        rentalCar.clickFivePassengers();
        rentalCar.clickFullyCharged();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"ct-search-results\"]/div[2]/ct-availability-list-header/div/ct-availability-filters-applied/div/div/div/div[2]/span")));

    }

    @Test
    public void filterByFullToFullRentalCar() {
        RentalCar rentalCar = new RentalCar(getDriver());
        rentalCar.clickMoreTravel();
        rentalCar.clickCarRental();
        rentalCar.typePickupLocation(pickupLocation);
        rentalCar.clickLocation();
        rentalCar.clickPickupDate();
        rentalCar.clickDate1();
        rentalCar.clickReturnDate();
        rentalCar.clickDate2();
        rentalCar.clickCookies();
        rentalCar.clickSearchBtn();
        rentalCar.clickFullToFull();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"ct-search-results\"]/div[2]/ct-availability-list-header/div/ct-availability-filters-applied/div/div/div/div[2]/span")));

    }
}
