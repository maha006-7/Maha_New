package pages.HotelsPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(HomePage.class);

    @FindBy(xpath="//*[@id=\"editorial-5\"]/div/div/a")
    private WebElement payLessOnSelectedProperties;

    @FindBy(xpath="//*[@id=\"links-1\"]/div/div[2]/div/a")
    private WebElement motels;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickPayLessOnSelectedProperties(){
        click(payLessOnSelectedProperties);
        LOG.info("clicked");}

    public void clickMotels(){
        click(motels);
        LOG.info("clicked");}

}
