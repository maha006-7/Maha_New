package pages.AutomationPracticePages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccessingWomenPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(AccessingWomenPage.class);
    @FindBy(xpath = "//a[@title='Women']")
    private WebElement womenbtn;
    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")
    private WebElement topsbtn;
    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")
    private WebElement tshirtsbtn;
    @FindBy(xpath = "//span[@class='cat-name']")
    private WebElement headerText;
    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[2]/a")
    private WebElement blousesbtn;
    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[2]/a")
    private WebElement dressesbtn;
    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")
    private WebElement casualdressesbtn;
    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[2]/a")
    private WebElement eveningdressesbtn;
    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[3]/a")
    private WebElement summerdressesbtn;
    @FindBy(xpath = "//*[@id='center_column']/div[1]/div/div/span")
    private WebElement blousesHeading;
    @FindBy(xpath = "//*[@id='center_column']/div[1]/div/div/span")
    private WebElement casualDressesHeading;
    @FindBy(xpath = "//*[@id='center_column']/div[1]/div/div/span")
    private WebElement eveningDressesHeading;
    @FindBy(xpath = "//*[@id='center_column']/div[1]/div/div/span")
    private WebElement summerDressesHeading;
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
    private WebElement fadedShortSleeveTshirt;
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
    private WebElement blouse;
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
    private WebElement printedDress;
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
    private WebElement eveningPrintedDress;
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/h5/a")
    private WebElement printedChiffonDress;
    @FindBy (xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")
    private WebElement tshirts;
    public AccessingWomenPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getHeaderText() {

        return getElementText(headerText);
    }

    public void clickWomenbtn() {
        click(womenbtn);
        LOG.info("Click on women btn successful");
    }

    public void clickTopsbtn() {
        click(topsbtn);
        LOG.info("Click on tops btn successful");
    }

    public void clickTshirtsbtn() {
        click(tshirtsbtn);
        LOG.info("Click on t-shirts btn successful");
    }

    public void clickBlousesbtn() {
        click(blousesbtn);
        LOG.info("Click on blouses btn successful");
    }

    public void clickdressesbtn() {
        click(dressesbtn);
        LOG.info("Click on dress btn successful");
    }

    public void clickcasualdressesbtn() {
        click(casualdressesbtn);
        LOG.info("Click on casual dresses btn successful");
    }

    public void clickEveningdressesbtn() {
        click(eveningdressesbtn);
        LOG.info("Click on evening dresses btn successful");
    }

    public void clickSummerdressesbtn() {
        click(summerdressesbtn);
        LOG.info("Click on summer dresses btn successful");
    }

    public String getBlouseHeading() {
        return getElementText(blousesHeading);
    }

    public String getCasualDressesHeading() {
        return getElementText(casualDressesHeading);
    }

    public String getEveningDressesHeading() {
        return getElementText(eveningDressesHeading);
    }

    public String getSummerDressesHeading() {
        return getElementText(summerDressesHeading);
    }

    public void clickFadedShortSleeveTshirt() {
        click(fadedShortSleeveTshirt);
        LOG.info("Click on faded short sleeve T-shirst successful");
    }

    public void clickblouse() {
        click(blouse);
        LOG.info("Click on blouses successful");
    }

    public void clickPrintedDress() {
        click(printedDress);
        LOG.info("Click on printed dress successful");
    }

    public void clickEveningPrintedDress() {
        click(eveningPrintedDress);
        LOG.info("Click on evening printed dress successful");
    }

    public void clickPrintedChiffonDress() {
        click(printedChiffonDress);
        LOG.info("Click on printed chiffon dress successful");
    }
    public void clickTshirts(){
        click(tshirts);
        LOG.info("Click on Tshirts successful");
    }
}