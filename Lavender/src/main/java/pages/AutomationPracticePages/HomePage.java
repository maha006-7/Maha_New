package pages.AutomationPracticePages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends CommonAPI {



    public static String getSearchTshirtsHeading;
    //add
    private final Logger LOG = LoggerFactory.getLogger(HomePage.class);
    @FindBy ( xpath = "//*[@id=\"search_query_top\"]")
    private WebElement searchField;
    @FindBy ( xpath = "//*[@id=\"searchbox\"]/button")
    private WebElement searchBtn;
    @FindBy (xpath = "//*[@id=\"center_column\"]/h1/span[1]")
    private WebElement searchDressHeading;
    @FindBy ( xpath = "//*[@id=\"quantity_wanted_p\"]/label")
    private WebElement searchResult;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void typeSearchField(String item){

    type(searchField,item);
    LOG.info("Type search field successful");
    }



    public void clickSearchBtn(){
        click(searchBtn);
        LOG.info("Click on search btn successful");
    }
    public String getSearchDressHeading(){
        return getElementText(searchDressHeading);
    }
    public String getSearchResult (){
        return getElementText(searchResult);
    }
    }



