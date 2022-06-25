package pages.HotelsPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChangeRegion extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ChangeRegion.class);
    @FindBy(xpath ="//*[@id=\"secondaryNav\"]/button/div")
    private WebElement regionIcon;
    @FindBy(xpath = "//*[@id=\"site-selector\"]")
    private WebElement regionDropdown;

    @FindBy(xpath = "//button[contains(text(),\"Save\")]")
    private WebElement saveBtn;

    public ChangeRegion(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickRegion(){

        click(regionIcon);
        LOG.info("clicked");
    }

    public void selectRegion(String region){
        selectFromDropdown(regionDropdown,region);
        LOG.info("region selected");
    }

    public void clickSaveBtn(){

        click(saveBtn);
        LOG.info("clicked");

    }

}
