package pages.HotelsPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ListYourProperty extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ListYourProperty.class);

    public ListYourProperty(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//*[@id=\"listYourProperty\"]/div")
    private WebElement listYourProperty;

    @FindBy (xpath="//*[@id=\"classification_privateResidence\"]")
    private WebElement privateResidence;

    @FindBy (xpath="//*[@id=\"classification_lodging\"]")
    private WebElement lodging;

    public void clickListYourProperty(){
        click(listYourProperty);
        LOG.info("clicked");}

    public void clickPrivateResidence(){
        click(privateResidence);
        LOG.info("clicked");}

    public void clickLodging(){
        click(lodging);
        LOG.info("clicked");}




}
