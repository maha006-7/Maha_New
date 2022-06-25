package pages.HotelsPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerService extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CustomerService.class);

    @FindBy(css ="a[id=\"support-cs\"]")
    private WebElement support;

    @FindBy(xpath ="//body/div[5]/div[2]/aside[1]/ul[1]/li[4]/article[1]/div[1]")
    private WebElement packages;

    @FindBy(xpath ="//*[@id=\"result-toggle-406\"]/ul/li[1]")
    private WebElement manageAPackage;

    @FindBy(xpath ="//*[@id=\"article-title-19981\"]")
    private WebElement flightInsurance;

    @FindBy(xpath="//*[@id=\"result-toggle-406\"]/ul/li[2]/a")
    private WebElement changeAndCancel;

    @FindBy(xpath="//a[contains(text(),'Flight Check-in')]")
    private WebElement flightCheckIn;

    @FindBy(css="a[href=\"#/articles/406/53\"]")
    private WebElement paymentAndReceipts;

    @FindBy(xpath="//h3[contains(text(),\"Refunds on flight bookings\")]")
    private WebElement refunds;

    @FindBy(xpath="//*[@id=\"result-408\"]/article/div[1]")
    private WebElement chat;

    public CustomerService(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickSupport(){

        click(support);
        LOG.info("clicked");
    }

    public void clickPackages(){

        click(packages);
        LOG.info("clicked");
    }

    public void clickManageAPackage(){

        click(manageAPackage);
        LOG.info("clicked");
    }

    public void clickFlightInsurance(){

        click(flightInsurance);
        LOG.info("clicked");
    }

    public void clickChangeAndCancel(){
        click(changeAndCancel);
        LOG.info("clicked");}

    public void clickFlightCheckIn(){
        click(flightCheckIn);
        LOG.info("clicked");}

    public void clickPaymentAndReceipts(){
        click(paymentAndReceipts);
        LOG.info("clicked");}

    public void clickRefunds(){
        click(refunds);
        LOG.info("clicked");}

    public void clickYourSettings(){
        click(chat);
        LOG.info("clicked");}




}