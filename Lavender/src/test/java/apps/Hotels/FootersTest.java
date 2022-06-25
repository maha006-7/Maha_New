package apps.Hotels;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HotelsPages.Footers;

import java.util.Set;

public class FootersTest extends CommonAPI {
    @Test
    public void checkFAQs() {
        Footers footers = new Footers(getDriver());
        footers.clickFAQs();
        Set<String> child = getDriver().getWindowHandles();
        for (String window : child) {
            getDriver().switchTo().window(window);
        }
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"search-banner\"]/div/div/a")));
    }


    @Test
    public void contactUs() {
        Footers footers = new Footers(getDriver());
        footers.clickContactUs();

        Set<String> child = getDriver().getWindowHandles();
        for (String window : child) {
            getDriver().switchTo().window(window);
        }

        WebElement frame = getDriver().findElement(By.cssSelector("iframe[title=\"Chat Window\"]"));
        getDriver().switchTo().frame(frame);
        getDriver().findElement(By.xpath("//*[@id=\"cpce-vac-launch\"]/div/button")).click();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"cpce-vac-container\"]/div[4]/div/footer/div[1]/div/div[1]/button")));
    }

    @Test
    public void affiliateWithUs() {
        Footers footers = new Footers(getDriver());
        footers.clickAffiliateWithUs();
        footers.clickSignUp();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"whole-page\"]/div/div/div/div[2]/div[1]/div[3]")));
    }

    @Test
    public void checkExpediaPartners() {
        Footers footers = new Footers(getDriver());
        footers.clickExpedia();
        footers.clickAbout();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"page-title\"]")));
    }

    @Test
    public void promoteWithUs() {
        Footers footers = new Footers(getDriver());
        footers.clickPromoteWithUs();
        footers.clickGettingStarted();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"main-content\"]/div/main/article/div/div[1]/div/div/div[1]/h1")));
    }

    @Test
    public void checkTravelAgents() {
        Footers footers = new Footers(getDriver());
        footers.clickTravelAgents();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"homecover\"]/div/div/div[1]/div/h2")));
    }

    @Test
    public void checkTermsAndConditions() {
        Footers footers = new Footers(getDriver());
        footers.clickTerms();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"termsandconditions\"]/div/p[1]/span")));
    }

    @Test
    public void checkPrivacy() {
        Footers footers = new Footers(getDriver());
        footers.clickPrivacy();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"61060956\"]/div/div/p[2]")));
    }

    @Test
    public void doNotSellPersonalInformation() {
        Footers footers = new Footers(getDriver());
        footers.clickDoNotSell();
        footers.checkMark();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"do-not-sell-no-share\"]")));
    }

    @Test
    public void checkCookies() {
        Footers footers = new Footers(getDriver());
        footers.clickCookies();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"61061024\"]/div/div/p[1]")));
    }

    @Test
    public void clickAboutUs() {
        Footers footers = new Footers(getDriver());
        footers.clickAboutUs();
        Set<String> child = getDriver().getWindowHandles();
        for (String window : child) {
            getDriver().switchTo().window(window);
        }
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"60994091\"]/div/h1")));
    }

    @Test
    public void browseCareers() {
        Footers footers = new Footers(getDriver());
        footers.clickCareers();
        Set<String> child = getDriver().getWindowHandles();
        for (String window : child) {
            getDriver().switchTo().window(window);
        }
        footers.clickSearchJobs();
        for (String window : child) {
            getDriver().switchTo().window(window);
        }
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"top\"]/header/div[1]/div/div/div/a/span")));
    }

    @Test
    public void clickHotelsNearMe() {
        Footers footers = new Footers(getDriver());
        footers.clickHotelsNearMe();
        Set<String> child = getDriver().getWindowHandles();
        for (String window : child) {
            getDriver().switchTo().window(window);
        }
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-1\"]/div/h1")));
    }

    @Test
    public void clickTravelGuides() {
        Footers footers = new Footers(getDriver());
        footers.clickTravelGuides();
        Set<String> child = getDriver().getWindowHandles();
        for (String window : child) {
            getDriver().switchTo().window(window);
        }
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[2]/div/div/h1")));
    }

    @Test
    public void clickVacationRentals() {
        Footers footers = new Footers(getDriver());
        footers.clickVacationRentals();
        Set<String> child = getDriver().getWindowHandles();
        for (String window : child) {
            getDriver().switchTo().window(window);
        }
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div/div/div/div/div/form/div[4]/button")));
    }

    @Test
    public void clickSiteIndex() {
        Footers footers = new Footers(getDriver());
        footers.clickSiteIndex();
        Set<String> child = getDriver().getWindowHandles();
        for (String window : child) {
            getDriver().switchTo().window(window);
        }
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"siteindex\"]/div[1]/div/div/div/h1/span")));
    }

    @Test
    public void clickHotelsInNewYork() {
        Footers footers = new Footers(getDriver());
        footers.clickHotelsInNewYork();
        Set<String> child = getDriver().getWindowHandles();
        for (String window : child) {
            getDriver().switchTo().window(window);
        }
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-1\"]/div/h1")));
    }


}

