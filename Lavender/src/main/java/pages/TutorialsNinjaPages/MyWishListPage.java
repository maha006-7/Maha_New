package pages.TutorialsNinjaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyWishListPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(MyWishListPage.class);

    @FindBy(xpath="//*[@id='content']/div[1]/table/tbody/tr/td[6]/a")
    private WebElement removeFromWishList;

    @FindBy(css="button[class='btn btn-primary']")
    private WebElement addToCartFromWishListButton;

    @FindBy(xpath="//*[@id='content']/div[2]/div/a")
    private WebElement continueButtonInMyWishListPage;

    @FindBy(xpath="//*[@id='content']/h2[1]")
    private WebElement myWishListHeading;

    @FindBy (css="div[class='alert alert-success alert-dismissible']")
    private WebElement addedToShoppingCartAlertMessage;

    @FindBy (css="div[class='alert alert-success alert-dismissible']")
    private WebElement successModifyingWishListMessage;


    public MyWishListPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickRemoveFromWishListButton(){
        click(removeFromWishList);
        LOG.info("clicked remove from wish list button success");
    }

    public void clickAddToCartFromWishListButton(){
        click(addToCartFromWishListButton);
        LOG.info("clicked add to cart button from wish list success");
    }

    public void clickContinueButtonFromMyWishListPage(){
        click(continueButtonInMyWishListPage);
        LOG.info("click continue button from wish list page success");
    }

    public String getMyWishListPageHeading(){
        return getElementText(myWishListHeading);
    }

    public boolean addedFromWishListToShoppingCartAlert(){
        return addedToShoppingCartAlertMessage.isDisplayed();
    }

    public boolean removedFromWishListAlert(){
        return successModifyingWishListMessage.isDisplayed();
    }


}
