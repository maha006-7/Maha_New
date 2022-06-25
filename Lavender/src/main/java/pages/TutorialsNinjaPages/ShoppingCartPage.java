package pages.TutorialsNinjaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ShoppingCartPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ShoppingCartPage.class);


    @FindBy (xpath="//*[@id='content']/form/div/table/tbody/tr/td[4]/div/input")
    private WebElement quantityInputBar;

    @FindBy (xpath="//*[@id='content']/form/div/table/tbody/tr/td[4]/div/span/button[1]")
    private WebElement updateButton;

    @FindBy (xpath="//*[@id='content']/form/div/table/tbody/tr/td[4]/div/span/button[2]")
    private WebElement deleteFromCartButton;

    @FindBy (xpath="//*[@id='accordion']/div[1]/div[1]/h4/a")
    private WebElement useCouponCodeOption;

    @FindBy (css="input[id='input-coupon']")
    private WebElement enterCouponCodeBar;

    @FindBy (css="input[id='button-coupon']")
    private WebElement applyCouponButton;

    @FindBy (xpath="//*[@id='accordion']/div[2]/div[1]/h4/a")
    private WebElement estimateShippingAndTaxesOption;

    @FindBy (css="#input-country")
    private WebElement selectCountryOption;

    @FindBy (css="#input-zone")
    private WebElement selectRegionOption;

    @FindBy (css="#input-postcode")
    private WebElement zipCode;

    @FindBy (css="button[id='button-quote']")
    private WebElement getQuoteButton;

    @FindBy (xpath="//*[@id='accordion']/div[3]/div[1]/h4/a")
    private WebElement useGiftCertificateOption;

    @FindBy (css="input[id='button-voucher']")
    private WebElement applyGiftCertificateButton;

    @FindBy (css="input[id='input-voucher']")
    private WebElement giftCardInputBar;

    @FindBy (xpath="//*[@id='content']/h1")
    private WebElement checkoutHeading;

    @FindBy (xpath="//*[@id='collapse-shipping']/div/div/div[2]/div/div")
    private WebElement calculateShippingAndTaxesErrorMessage;

    @FindBy (css="a[class='btn btn-default']")
    private WebElement continueShoppingButton;

    @FindBy(css="i[class='fa fa-home']")
    private WebElement returnHomeButton;



    public ShoppingCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickQuantityBar(){
        click(quantityInputBar);
        LOG.info("success clicking quantity input bar");
    }

    public void clearQuantityBar() {
        clear(quantityInputBar);
        LOG.info("success clearing quantity input bar");
    }

    public void enterQuantityAmount(String amount){
        type(quantityInputBar, amount);
        LOG.info("quantity amount typed into input bar success");
    }

    public void updateCartButton() {
        click(updateButton);
        LOG.info("success clicking update cart button");
    }

    public void clickContinueShoppingButtonFromShoppingCart(){
        click(continueShoppingButton);
        LOG.info("success clicking continue shopping button");
    }

    public void clickReturnHomeButton(){
        click(returnHomeButton);
        LOG.info("success clicking return home button");
    }

    public void deleteFromCartButton(){
        click(deleteFromCartButton);
        LOG.info("success clicking delete from cart button");
    }

    public void useCouponCodeOption(){
        click(useCouponCodeOption);
        LOG.info("success clicking use coupon code");
    }

    public void typeCouponCode(String couponCode) {
        type(enterCouponCodeBar, couponCode);
        LOG.info("success typing coupon code into input bar");
    }

    public void clickApplyCouponButton() {
        click(applyCouponButton);
        LOG.info("success clicking apply coupon button");
    }

    public void estimateShippingAndTaxesOption(){
        click(estimateShippingAndTaxesOption);
        LOG.info("success clicking estimate shipping and taxes option");
    }


    public void useGiftCertificateOptionOption(){
        click(useGiftCertificateOption);
        LOG.info("use gift certificate dropdown clicked success");
    }

    public void typeGiftCertificateCode(String code) {
        type(giftCardInputBar, code);
        LOG.info("typed code into gift certificate input bar");
    }

    public void clickApplyGiftCertificateButton(){
        click(applyGiftCertificateButton);
        LOG.info("click apply gift certificate button success");
    }

    public void selectCountryOptionFromDropDown(String option) {
        List<WebElement> elements = getDropDownOptions(selectCountryOption);
        for(WebElement element: elements) {
            if(element.getText().equalsIgnoreCase(option)) {
                element.click();
            }
        }
        LOG.info("success selecting country option from the dropdown");
    }

    public void selectRegionOptionFromDropDown(String option) {
        List<WebElement> elements = getDropDownOptions(selectRegionOption);
        for(WebElement element: elements) {
            if(element.getText().equalsIgnoreCase(option)) {
                element.click();
            }
        }
        LOG.info("success selecting region option from the dropdown");
    }

    public void typeZipCode(String zipCodeNumber) {
        type(zipCode, zipCodeNumber);
        LOG.info("success typing zipcode into input bar");
    }


    public void clickGetQuoteButton() {
        click(getQuoteButton);
        LOG.info("success clicking get quote button");
    }

    public String checkoutHeadingText(){
        return getElementText(checkoutHeading);
    }

    public String estimateShippingAndTaxesErrorMessage(){
        return getElementText(calculateShippingAndTaxesErrorMessage);
    }

    public boolean updateCartButtonFunction(){
        return updateButton.isEnabled();
    }

    public boolean giftCertificateInteraction(){
        return giftCardInputBar.isEnabled();
    }

    public boolean continueShoppingButtonFunction(){
        return continueShoppingButton.isDisplayed();
    }

    public boolean returnHomeButtonFunction(){
        return returnHomeButton.isDisplayed();
    }





}
