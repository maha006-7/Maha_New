package pages.TutorialsNinjaPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductsPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ProductsPage.class);

    @FindBy (xpath="//*[@id='content']/div/div/ul[2]/li[1]/a")
    private WebElement descriptonTab;

    @FindBy (xpath="//*[@id='content']/div[1]/div[1]/ul[2]/li[2]/a")
    private WebElement specificationTab;

    @FindBy (xpath="//*[@id='content']/div[1]/div[2]/div[3]/p/a[2]")
    private WebElement writeAReviewButton;

    @FindBy(xpath="//*[@id='tab-description']/h3[1]")
    private WebElement productDescriptionText;

    @FindBy(xpath="//*[@id='content']/div[1]/div[2]/h1")
    private WebElement productPageResultHeading;

    @FindBy(xpath="//*[@id='form-review']/h2")
    private WebElement writeAReviewHeading;


    public ProductsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void viewProductDescription() {
        click(descriptonTab);
        LOG.info("success clicking description tab");
    }

    public void viewProductSpecifications() {
        click(specificationTab);
        LOG.info("success clicking specification tab");
    }

    public void writeAReviewButton() {
        click(writeAReviewButton);
        LOG.info("success clicking write a review button");
    }

    public String productDescriptionInformation(){
        return getElementText(productDescriptionText);
    }

    public String productPageResultHeading(){
        return getElementText(productPageResultHeading);
    }

    public String writeAReviewHeading(){
        return getElementText(writeAReviewHeading);
    }


}

