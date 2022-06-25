package pages.HotelsPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Footers extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(Footers.class);

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[4]/ul/li[2]/div/a")
    private WebElement FAQs;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[4]/ul/li[3]/div/a")
    private WebElement contactUs;

    @FindBy(xpath = "//button[contains(text(),\"Chat Now\")]")
    private WebElement chatNow;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[5]/ul/li[1]/div/a")
    private WebElement affiliateWithUs;

    @FindBy(xpath = "//*[@id=\"main-content\"]/main/div/div/div/div[3]/div/div[2]/div/div/div/div[2]/a")
    private WebElement signUp;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[5]/ul/li[2]/div/a")
    private WebElement expedia;

    @FindBy(css = "a[href=\"/about\"]")
    private WebElement about;

    @FindBy(xpath = "//*[@id=\"menu-item-970\"]/a")
    private WebElement gettingStarted;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[5]/ul/li[3]/div")
    private WebElement promoteWithUs;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[5]/ul/li[4]/div/a")
    private WebElement travelAgents;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[6]/ul/li[1]/div")
    private WebElement terms;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[6]/ul/li[2]/div")
    private WebElement privacy;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[6]/ul/li[3]/div")
    private WebElement doNotSell;

    @FindBy(xpath = "//label[@for=\"do-not-sell-checkbox\"]")
    private WebElement checkMark;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[6]/ul/li[4]/div")
    private WebElement cookies;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[7]/ul/li[2]/div")
    private WebElement aboutUs;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[7]/ul/li[3]/div")
    private WebElement careers;

    @FindBy(xpath = "//*[@id=\"listings-carousel\"]/div/div/div[2]/div[2]/div/a")
    private WebElement searchJobs;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[7]/ul/li[4]/div")
    private WebElement hotelsNearMe;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[7]/ul/li[5]/div")
    private WebElement travelGuides;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[7]/ul/li[6]/div")
    private WebElement vacationRentals;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[7]/ul/li[7]/div")
    private WebElement siteIndex;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[2]/ul/li[2]/div")
    private WebElement hotelsInNewYork;


    public Footers(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickFAQs() {
        click(FAQs);
        LOG.info("clicked");
    }

    public void clickContactUs() {
        click(contactUs);
        LOG.info("clicked");
    }

    public void clickChatNow() {
        click(chatNow);
        LOG.info("clicked");
    }

    public void clickAffiliateWithUs() {
        click(affiliateWithUs);
        LOG.info("clicked");
    }

    public void clickSignUp() {
        click(signUp);
        LOG.info("clicked");
    }

    public void clickExpedia() {
        click(expedia);
        LOG.info("clicked");
    }

    public void clickAbout() {
        click(about);
        LOG.info("clicked");
    }

    public void clickPromoteWithUs() {
        click(promoteWithUs);
        LOG.info("clicked");
    }

    public void clickGettingStarted() {
        click(gettingStarted);
        LOG.info("clicked");
    }

    public void clickTravelAgents() {
        click(travelAgents);
        LOG.info("clicked");
    }

    public void clickTerms() {
        click(terms);
        LOG.info("clicked");
    }

    public void clickPrivacy() {
        click(privacy);
        LOG.info("clicked");
    }

    public void clickDoNotSell() {
        click(doNotSell);
        LOG.info("clicked");
    }

    public void checkMark() {
        click(checkMark);
        LOG.info("checked mark");
    }

    public void clickCookies() {
        click(cookies);
        LOG.info("clicked");
    }

    public void clickAboutUs() {
        click(aboutUs);
        LOG.info("clicked");
    }

    public void clickCareers() {
        click(careers);
        LOG.info("clicked");
    }

    public void clickSearchJobs() {
        click(searchJobs);
        LOG.info("clicked");
    }

    public void clickHotelsNearMe() {
        click(hotelsNearMe);
        LOG.info("clicked");
    }

    public void clickTravelGuides() {
        click(travelGuides);
        LOG.info("clicked");
    }

    public void clickVacationRentals() {
        click(vacationRentals);
        LOG.info("clicked");
    }

    public void clickSiteIndex() {
        click(siteIndex);
        LOG.info("clicked");
    }

    public void clickHotelsInNewYork() {
        click(hotelsInNewYork);
        LOG.info("clicked");
    }


}
