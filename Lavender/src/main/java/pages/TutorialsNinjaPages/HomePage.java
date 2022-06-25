package pages.TutorialsNinjaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HomePage extends CommonAPI {

    private final Logger LOG= LoggerFactory.getLogger(HomePage.class);


    @FindBy(css = "input[name='search']")
    private WebElement searchBar;

    @FindBy (css="button[class='btn btn-default btn-lg']")
    private WebElement magnifyingGlass;

    @FindBy (xpath = "//*[@id='top-links']/ul/li[2]/a/span[1]")
    private WebElement myAccountButton;

    @FindBy (xpath="//*[@id='top-links']/ul/li[2]/ul/li[2]/a")
    private WebElement LoginSelectionFromMyAccountButton;

    @FindBy (css="button[class='btn btn-link dropdown-toggle']")
    private WebElement currencyButton;

    @FindBy(xpath="//*[@id='form-currency']/div/ul/li[1]/button")
    private WebElement euroCurrencyButton;


    @FindBy (xpath = "//*[@id='menu']/div[2]/ul/li[1]/a")
    private WebElement desktopTab;

    @FindBy (xpath="//*[@id='menu']/div[2]/ul/li[1]/div/a")
    private WebElement showAllDesktopOption;

    @FindBy (xpath="//*[@id='menu']/div[2]/ul/li[2]/a")
    private WebElement laptopAndNotebooksTab;

    @FindBy (xpath="//*[@id='menu']/div[2]/ul/li[2]/div/a")
    private WebElement showAllLaptopAndNotebooksOption;

    @FindBy (xpath="//*[@id='menu']/div[2]/ul/li[3]/a")
    private WebElement componentsTab;

    @FindBy (xpath="//*[@id='menu']/div[2]/ul/li[3]/div/a")
    private WebElement showAllComponentsOption;

    @FindBy (xpath="//*[@id='menu']/div[2]/ul/li[4]/a")
    private WebElement tabletsTab;

    @FindBy (xpath="//*[@id='menu']/div[2]/ul/li[5]/a")
    private WebElement softwareTab;

    @FindBy (xpath="//*[@id='menu']/div[2]/ul/li[6]/a")
    private WebElement phoneAndPDATab;

    @FindBy (xpath="//*[@id='menu']/div[2]/ul/li[7]/a")
    private WebElement camerasTab;

    @FindBy (xpath="//*[@id='menu']/div[2]/ul/li[8]/a")
    private WebElement mp3PlayersTab;

    @FindBy (xpath="//*[@id='menu']/div[2]/ul/li[8]/div/a")
    private WebElement showAllMP3PlayerOption;

    @FindBy(xpath="//*[@id='top-links']/ul/li[4]/a/span")
    private WebElement viewCartButton;

    @FindBy (xpath="//*[@id='top-links']/ul/li[5]/a/span")
    private WebElement checkoutButton;

    @FindBy (xpath="//*[@id='top-links']/ul/li[2]/a/span[1]")
    private WebElement myAccountDropdown;

    @FindBy (xpath = "//*[@id='content']/h2")
    private WebElement desktopItemDisplayHeading;

    @FindBy (xpath = "//*[@id='content']/h2")
    private WebElement laptopAndNotebooksDisplayHeading;

    @FindBy (xpath = "//*[@id='content']/h2")
    private WebElement componentsDisplayHeading;

    @FindBy (xpath = "//*[@id='content']/h2")
    private WebElement tabletsDisplayHeading;

    @FindBy (xpath = "//*[@id='content']/h2")
    private WebElement softwareDisplayHeading;

    @FindBy (xpath ="//*[@id='content']/h2")
    private WebElement phonesAndPDADisplayHeading;

    @FindBy (xpath = "//*[@id='content']/h2")
    private WebElement cameraDisplayHeading;

    @FindBy (xpath = "//*[@id='content']/h2")
    private WebElement mp3PlayersDisplayHeading;

    @FindBy (xpath = "//*[@id='cart-total']")
    private WebElement euroCurrencyDisplay;

    @FindBy(xpath="//*[@id='wishlist-total']/span")
    private WebElement homepageWishListButton;

    @FindBy(css="#logo")
    private WebElement homepageLogo;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchElement(String item) {
        type(searchBar, item);
        LOG.info("successfully typed item to search bar");
    }

    public void clickMagnifyingGlass() {
        click(magnifyingGlass);
        LOG.info("clicked magnifying glass success");
    }

    public void clearSearchBar() {
        clear(searchBar);
        LOG.info("success clearing search bar");
    }

    public void searchElementAndEnter(String item) {
        typeAndEnter(searchBar, item);
        LOG.info("typing item and entering success");
    }

    public void viewCartButton() {
        click(viewCartButton);
        LOG.info("success clicking view cart button");
    }

    public void viewCheckoutButton() {
        click(checkoutButton);
        LOG.info("success clicking view checkout button");
    }

    public void clickMyAccountDropdownButton(){
        click(myAccountButton);
        LOG.info("success clicking my account button");
    }

    public void selectLoginOptionFromMyAccountDropdown(){
        click(LoginSelectionFromMyAccountButton);
        LOG.info("success selecting login from my account dropdown");
    }

    public void clickDesktopsTab(){
        click(desktopTab);
        LOG.info("success clicking desktop tab");
    }

    public void clickShowAllDesktopOption(){
        click(showAllDesktopOption);
        LOG.info("success clicking show all desktop options");
    }

    public void clickLaptopsAndNotebooksTab(){
        click(laptopAndNotebooksTab);
        LOG.info("success clicking laptop and notebooks tab");
    }

    public void clickShowAllLaptopsAndNotebookOption(){
        click(showAllLaptopAndNotebooksOption);
        LOG.info("success clicking show all laptop and notebook options");
    }

    public void clickComponentsTab(){
        click(componentsTab);
        LOG.info("success clicking components tab");
    }

    public void clickShowAllComponentsOption(){
        click(showAllComponentsOption);
        LOG.info("success clicking show all components options");
    }

    public void clickTabletsTab(){
        click(tabletsTab);
        LOG.info("success clicking tablets tab");
    }

    public void clickSoftwareTab(){
        click(softwareTab);
        LOG.info("success clicking software tab");
    }

    public void clickPhonesAndPDAsTab(){
        click(phoneAndPDATab);
        LOG.info("success clicking phone and pda tab");
    }

    public void clickCamerasTab(){
        click(camerasTab);
        LOG.info("success clicking camera tab");
    }

    public void clickMP3PlayersTab(){
        click(mp3PlayersTab);
        LOG.info("success clicking mp3 players tab");
    }

    public void clickShowAllMP3PlayersOption(){
        click(showAllMP3PlayerOption);
        LOG.info("success clicking show all mp3 players options");
    }

    public void clickCurrencyButton(){
        click(currencyButton);
        LOG.info("success clicking currency button");
    }

    public void selectEuroCurrency(){
        click(euroCurrencyButton);
        LOG.info("success clicking euro currency button");
    }

    public String desktopItemsDisplayMessage(){
        return getElementText(desktopItemDisplayHeading);
    }

    public String laptopAndNotebookDisplayMessage(){
        return getElementText(laptopAndNotebooksDisplayHeading);
    }

    public String componentsDisplayMessage(){
        return getElementText(componentsDisplayHeading);
    }

    public String tabletsDisplayMessage(){
        return getElementText(tabletsDisplayHeading);
    }

    public String softwareDisplayMessage(){
        return getElementText(softwareDisplayHeading);
    }

    public String phoneAndPDADisplayMessage(){
        return getElementText(phonesAndPDADisplayHeading);
    }

    public String cameraDisplayMessage(){
        return getElementText(cameraDisplayHeading);
    }

    public String mp3PlayersDisplayMessage(){
        return getElementText(mp3PlayersDisplayHeading);
    }

    public String euroCurrencySymbol(){
        return getElementText(euroCurrencyDisplay);
    }

    public void clickHomepageWishListButton(){
        click(homepageWishListButton);
        LOG.info("homepage wish list button click success");
    }

    public boolean isLogoPresent(){
        return homepageLogo.isDisplayed();
    }


}
