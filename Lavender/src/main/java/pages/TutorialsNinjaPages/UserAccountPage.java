package pages.TutorialsNinjaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserAccountPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(UserAccountPage.class);

    @FindBy(xpath="//*[@id='content']/ul[1]/li[1]/a")
    private WebElement editAccountInformation;

    @FindBy(xpath="//*[@id='content']/ul[1]/li[2]/a")
    private WebElement changeYourPasswordOption;

    @FindBy(xpath="//*[@id='content']/h2[1]")
    private WebElement myAccountHeading;

    @FindBy(xpath="//*[@id='content']/ul[1]/li[4]/a")
    private WebElement modifyYOurWishList;

    @FindBy(xpath="//*[@id='content']/h2")
    private WebElement myWishListHeading;

    @FindBy (css="input[name='search']")
    private WebElement searchBarInEditInformationPage;

    @FindBy (xpath = "//*[@id='content']/ul[2]/li[1]/a")
    private WebElement viewYourOrderHistory;

    @FindBy(xpath="//*[@id='content']/ul[2]/li[2]/a")
    private WebElement downloads;

    @FindBy(xpath="//*[@id='content']/ul[2]/li[3]/a")
    private WebElement yourRewardPoints;

    @FindBy(xpath="//*[@id='content']/ul[2]/li[4]/a")
    private WebElement viewYOurReturnRequests;

    @FindBy(xpath="//*[@id='content']/ul[2]/li[5]/a")
    private WebElement yourTransactions;

    @FindBy(xpath="//*[@id='content']/ul[2]/li[6]/a")
    private WebElement recurringPayments;

    @FindBy(xpath="//*[@id='column-right']/div/a[13]")
    private WebElement logoutButton;

    @FindBy(xpath="//*[@id='content']/h1")
    private WebElement orderHistoryHeading;

    @FindBy (xpath="//*[@id='content']/h2")
    private WebElement accountDownloadsText;

    @FindBy(xpath="//*[@id='content']/h1")
    private WebElement yourRewardsPointsHeading;

    @FindBy(xpath="//*[@id='content']/h1")
    private WebElement productReturnsHeading;

    @FindBy(xpath="//*[@id='content']/h1")
    private WebElement yourTransactionsHeading;

    @FindBy(xpath="//*[@id='content']/h1")
    private WebElement recurringPaymentsHeading;

    @FindBy(xpath="//*[@id='content']/h1")
    private WebElement accountLogoutHeading;





    public UserAccountPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickEditAccountInformation(){
        click(editAccountInformation);
        LOG.info("click edit account information success");
    }

    public void clickChangeYourPasswordOption(){
        click(changeYourPasswordOption);
        LOG.info("success clicking change your password option");
    }

    public String myAccountHeadingText(){
        return getElementText(myAccountHeading);
    }

    public void clickModifyYourWishList(){
        click(modifyYOurWishList);
        LOG.info("modify your wish list click success");
    }

    public String myWishListHeadingText(){
        return getElementText(myWishListHeading);
    }

    public void clickSearchBarInUserAccountPage(){
        click(searchBarInEditInformationPage);
        LOG.info("click search bar in user account page success");
    }

    public void typeAndEnterIntoSearBarFromUserAccountPage(String item){
        typeAndEnter(searchBarInEditInformationPage, item);
        LOG.info("typed item and hit enter success");
    }

    public void clickViewYourOrderHistory(){
        click(viewYourOrderHistory);
        LOG.info("clicked view your order history success");
    }

    public void clickDownloads(){
        click(downloads);
        LOG.info("clicked downloads success");
    }

    public void clickYourRewardsPoints(){
        click(yourRewardPoints);
        LOG.info("clicked your rewards points success");
    }

    public void clickViewYourReturnRequests(){
        click(viewYOurReturnRequests);
        LOG.info("clicked view your return requests success");
    }

    public void clickYourTransactions(){
        click(yourTransactions);
        LOG.info("clicked your transactions success");
    }

    public void clickRecurringPayments(){
        click(recurringPayments);
        LOG.info("clicked recurring payments success");
    }

    public void clickLogoutButton(){
        click(logoutButton);
        LOG.info("click logout button success");
    }

    public String orderHistoryHeading(){
        return getElementText(orderHistoryHeading);
    }

    public String accountDownloadsHeading(){
        return getElementText(accountDownloadsText);
    }

    public String yourRewardsPointsHeading(){
        return getElementText(yourRewardsPointsHeading);
    }

    public String productReturnsHeading(){
        return getElementText(productReturnsHeading);
    }

    public String yourTransactionsHeading(){
        return getElementText(yourTransactionsHeading);
    }

    public String recurringPayment(){
        return getElementText(recurringPaymentsHeading);
    }

    public String accountLogoutHeading(){
        return getElementText(accountLogoutHeading);
    }





}
