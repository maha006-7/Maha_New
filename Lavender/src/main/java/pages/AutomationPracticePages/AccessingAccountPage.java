package pages.AutomationPracticePages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccessingAccountPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(AccessingAccountPage.class);
    @FindBy(xpath = "//*[@id='center_column']/div/div[1]/ul/li[1]/a/span")
    private WebElement orderHistoryAndDetails;
    @FindBy(xpath = "//*[@id='center_column']/h1")
    private WebElement headingName;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/h1")
    private WebElement messageName;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span")
    private WebElement myAddress;
    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    private WebElement accessingAddressMessage;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[1]/span")
    private WebElement updatingAddress;
    @FindBy(xpath = "//*[@id=\"address2\"]")
    private WebElement myAddressline2Field;
    @FindBy(xpath = "//*[@id=\"submitAddress\"]/span")
    private WebElement saveAddressBtn;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[1]/h3")
    private WebElement updatingAddressLine2Fieldheading;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div[2]/a/span")
    private WebElement addNewAddressbtn;
    @FindBy(xpath = "//*[@id=\"address1\"]")
    private WebElement address1Field;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement cityField;
    @FindBy(xpath = "//*[@id=\"id_state\"]")
    private WebElement state;
    @FindBy(xpath = "//*[@id=\"id_state\"]")
    private WebElement newYork;
    @FindBy(xpath = "//*[@id=\"postcode\"]")
    private WebElement zipCodeField;
    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement homePhoneField;
    @FindBy(xpath = "//*[@id=\"phone_mobile\"]")
    private WebElement mobilePhoneField;
    @FindBy(xpath = "//*[@id=\"alias\"]")
    private WebElement reference;
    @FindBy(xpath = "//*[@id=\"submitAddress\"]/span")
    private WebElement saveNewAddressBtn;
    @FindBy(xpath = "//*[@id='center_column']/div[1]/div/div[2]/ul/li[9]/a[2]/span")
    private WebElement deleteAddress;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span")
    private WebElement personalInfoBtn;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div/h1")
    private WebElement personalInfoHeading;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span")
    private WebElement wishlistBtn;
    @FindBy(xpath = "//*[@id=\"mywishlist\"]/h1")
    private WebElement accessingWishlistHeading;
    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement addNewWishlist;
    @FindBy(xpath = "//*[@id=\"submitWishlist\"]/span")
    private WebElement saveNewWishlistBtn;
    @FindBy(xpath = "//*[@id=\"wishlist_48511\"]/td[1]/a")
    private WebElement addNewWishlistHeading;
    @FindBy(xpath = "//*[@id='wishlist_48511']/td[5]/a")
    private WebElement m1ViewBtn;
    @FindBy(xpath = "//*[@id=\"address1\"]")
    private WebElement addressLine1;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement city;
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
    private WebElement printedSummerDress;
    @FindBy(xpath = "//*[@id=\"wishlist_button\"]")
    private WebElement addToWishlist;
    @FindBy(xpath = "//*[@id='product']/div[2]/div/div/div/div/p")
    private WebElement addedToWishlist;
    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
    private WebElement addToCart;
    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
    private WebElement addedToCart;
    @FindBy(xpath = "//*[@id=\"send_friend_button\"]")
    private WebElement sendToAFriendBtn;
    @FindBy(xpath = "//*[@id=\"friend_name\"]")
    private WebElement nameOfFriendField;
    @FindBy(xpath = "//*[@id=\"friend_email\"]")
    private WebElement emailOfFriend;
    @FindBy(xpath = "//*[@id=\"sendEmail\"]/span")
    private WebElement finalSendToFriendBtn;
    @FindBy(xpath = "//*[@id=\"product\"]/div[2]/div/div/div/h2")
    private WebElement sendToFriendHeading;
    @FindBy(xpath = "//*[@id=\"product_comments_block_extra\"]/ul/li/a")
    private WebElement writeAReviewBtn;
    @FindBy(xpath = "//*[@id=\"comment_title\"]")
    private WebElement titleOfReview;
    @FindBy (xpath = "//*[@id=\"content\"]")
    private WebElement commentOfReview;
    @FindBy (xpath = "/html/body/div[2]/div/div/div/div/div/form/div/div[2]/div[2]/p[2]/button/span")
    private WebElement reviewSendBtn;
    @FindBy ( xpath = "/html/body/div[2]/div/div/div/h2")
    private WebElement newCommentHeading;
    @FindBy (xpath = "//*[@id=\"informations_block_left_1\"]/p/a")
    private WebElement informationBtn;
    @FindBy ( xpath = "//*[@id=\"center_column\"]/div/ul/li[1]/a")
    private WebElement deliveryBtn;
    @FindBy ( xpath = "//*[@id=\"columns\"]/div[1]/span[2]")
    private WebElement deliveryHeading;
    @FindBy (xpath = "//*[@id=\"center_column\"]/div/ul/li[2]/a")
    private WebElement legalNotice;
    @FindBy (xpath = "/html/body/div/div[2]/div/div[1]/span[2]")
    private WebElement legalNoticeHeading;
    @FindBy (xpath = "//*[@id=\"center_column\"]/div/ul/li[3]/a")
    private WebElement terms;
    @FindBy (xpath = "/html/body/div/div[2]/div/div[1]/span[2]")
    private WebElement termsHeading;
    @FindBy (xpath = "//*[@id=\"center_column\"]/div/ul/li[4]/a")
    private WebElement aboutUs;
    @FindBy (xpath = "/html/body/div/div[2]/div/div[1]/span[2]")
    private WebElement aboutUsHeading;
    @FindBy (xpath = "//*[@id=\"center_column\"]/div/ul/li[5]/a")
    private WebElement securePayment;
    @FindBy (xpath = "/html/body/div/div[2]/div/div[1]/span[2]")
    private WebElement securePaymentHeading;

    public AccessingAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getMessageName() {

        return getElementText(messageName);
    }

    public void clickOrderHistoryAndDetails() {
        click(orderHistoryAndDetails);
        LOG.info("Click on Order history and details successful");
    }

    public String getHeadingName() {
        return getElementText(headingName);
    }

    public void clickMyAddress() {
        click(myAddress);
        LOG.info("Click on My Address successful");
    }

    public String getAccessingAddressMessage() {
        return getElementText(accessingAddressMessage);
    }

    public void clickUpdatingAddress() {
        click(updatingAddress);
        LOG.info("Click on updating address successful");
    }

    public void typeMyAddressLine2Field(String item) {

        type(myAddressline2Field, item);
        LOG.info("Type my address line 2 field successful");
    }

    public void clickSaveAddressbtn() {
        click(saveAddressBtn);
        LOG.info("Click on Save Address btn successful");
    }

    public String getUpdatingAddressLine2Fieldheading() {
        return getElementText(updatingAddressLine2Fieldheading);
    }

    public void clickAddNewAddressbtn() {
        click(addNewAddressbtn);
        LOG.info("Click on Add new Address button successful");
    }

    public void typeAddress1field(String item) {
        type(address1Field, item);
        LOG.info("Type on Address 1 field successful");
    }

    public void typeCityField(String item) {
        type(cityField, item);
        LOG.info("type on city field successful");
    }

    public void clickState() {
        click(state);
        LOG.info("Click on state successful");
    }

    public void clickNewYork() {
        click(newYork);
        LOG.info("click on New York successful");
    }

    public void typeZipCodeField(String item) {
        type(zipCodeField, item);
        LOG.info("Type on zipcode field successful");
    }

    public void typeHomePhoneField(String item) {
        type(homePhoneField, item);
        LOG.info("Type on home phone field Successful");
    }

    public void typeMobilePhoneField(String item) {
        type(mobilePhoneField, item);
        LOG.info("Type on mobile phone field successful");
    }

    public void typeReference(String item) {
        type(reference, item);
        LOG.info("Type on reference successful");
    }

    public void clickSaveNewAddressBtn() {
        click(saveNewAddressBtn);
        LOG.info("Click on new address btn successful");
    }

    public void clickDeleteAddress() {
        click(deleteAddress);
        LOG.info("click on delete address successful");
    }

    public void clickPersonalInfo() {
        click(personalInfoBtn);
        LOG.info("click on personal info btn successful");
    }

    public String getPersonalInfoHeading() {
        return getElementText(personalInfoHeading);
    }

    public void clickWishlistBtn() {
        click(wishlistBtn);
        LOG.info("click on wishlist btn successful");
    }

    public String getAccessingWishlistHeading() {
        return getElementText(accessingWishlistHeading);
    }

    public void typeAddNewWishlist(String item) {
        type(addNewWishlist, item);
        LOG.info("Type on new wishlist btn successful");
    }

    public void clickSaveNewWishlistBtn() {
        click(saveNewWishlistBtn);
        LOG.info(" Click on save new wishlist btn successful");
    }

    public String getAddNewWishlistHeading() {
        return getElementText(addNewWishlistHeading);
    }

    public void clickm1ViewBtn() {
        click(m1ViewBtn);
        LOG.info("Click on m1View btn successful");
    }

    public void clearAddressLine1() {
        clear(addressLine1);
        LOG.info("Clear Address line 1 successful");
    }

    public void typeAddressLine1(String item) {
        type(addressLine1, item);
        LOG.info("Type on Adress line 1 successful");
    }

    public void clearCity() {
        clear(city);
        LOG.info("clear city successful");
    }

    public void typeCity(String item) {
        type(city, item);
        LOG.info("Type on city successful");
    }

    public void clearZipCode() {
        clear(zipCodeField);
        LOG.info("clear Zipcode Field Successful");
    }

    public void clearHomePhone() {
        clear(homePhoneField);
        LOG.info("Clear Homephone field successful");
    }

    public void clearMobilePhone() {
        clear(mobilePhoneField);
        LOG.info("clear mobile phone field successful");
    }

    public void clickPrintedSummerDress() {
        click(printedSummerDress);
        LOG.info("click on printed summer dress successful");
    }

    public void clickAddToWishlist() {
        click(addToWishlist);
        LOG.info("Click add to wishlist successful");
    }

    public String getAddedToWishlist() {
        return getElementText(addedToWishlist);
    }

    public void clickAddToCart() {
        click(addToCart);
        LOG.info("Click add to cart successful");
    }

    public String getAddedToCart() {
        return getElementText(addedToCart);
    }

    public void clickSendToAFriendBtn() {
        click(sendToAFriendBtn);
        LOG.info("Click send to a friend btn successful");
    }

    public void typeNameOfFriend(String item) {
        type(nameOfFriendField, item);
        LOG.info("Type name of friend suceessful");
    }

    public void typeEmailOfFriend(String item) {
        type(emailOfFriend, item);
        LOG.info("Type email of friend successful");
    }

    public void clickFinalSendToFriendBtn() {
        click(finalSendToFriendBtn);
        LOG.info("Click on final send to friend btn successful");
    }

    public String getSendToAFriendHeading() {

     return    getElementText(sendToFriendHeading);

    }
    public void clickWriteAReviewBtn(){
        click(writeAReviewBtn);
        LOG.info("Click on write a review button successful");
    }
    public void typeTitleOfReview(String item){
        type(titleOfReview, item);
        LOG.info("Type Title of Review Successful");
    }
    public void typeCommentOfReview(String item){
        type(commentOfReview,item);
        LOG.info("Type Comment of Review Successful");
    }
    public void clickReviewSendBtn(){
        click(reviewSendBtn);
        LOG.info("Click on review send btn successful");
    }
    public String getNewCommentHeading(){
        return getElementText(newCommentHeading);
    }
    public void clickInformationBtn(){
        click(informationBtn);
        LOG.info("Click on information btn successful");
    }
    public void clickDeliveryBtn(){
        click(deliveryBtn);
        LOG.info("click on delivery btn successful");
    }
    public String getDeliveryHeading(){
        return getElementText(deliveryHeading);
    }
    public void clickLegalNotice(){
        click(legalNotice);
        LOG.info("Click on legal notice successful");
    }
    public String getLegalNoticeHeading(){
        return getElementText(legalNoticeHeading);
    }
    public void clickTerms(){
        click(terms);
        LOG.info("Click on terms Successful");
    }
    public String getTermsHeading(){
        return getElementText(termsHeading);
    }
    public void clickAboutUs(){
        click(aboutUs);
        LOG.info("Click on about us successful");
    }
    public String getAboutUsHeading(){
        return getElementText(aboutUsHeading);
    }
    public void clickSecurePayment(){
        click(securePayment);
        LOG.info("Click on Secure Payment successful");
    }
    public String getSecurePaymentHeading(){
        return getElementText(securePaymentHeading);
    }
}



