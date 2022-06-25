package pages.DemoBlazePages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ProductPage.class);

    @FindBy(xpath = "//*[@id='tbodyid']/div[1]/div/div/h4/a")
    private WebElement SamSungPhoneBtn;

    @FindBy(xpath = "//*[@id='tbodyid']/div[6]/div/div/h4/a")
    private WebElement SonyXperia;

    @FindBy(xpath = "//*[@id='tbodyid']/div[3]/div/div/h4/a")
    private WebElement NexusBtn;

    @FindBy(xpath = "//*[@id='tbodyid']/div[5]/div/div/h4/a")
    private WebElement IphoneSixBtn;

    @FindBy(xpath = "//*[@id='tbodyid']/div[7]/div/div/h4/a")
    private WebElement HTEPhone;

    @FindBy(xpath = "//*[@id='tbodyid']/div[1]/div/div/h4/a")
    private WebElement AppleMonitor;

    @FindBy (xpath = "//*[@id='tbodyid']/div[2]/div/div/h4/a")
    private WebElement AsusMonitorButton;

    @FindBy(xpath = "//*[@id='tbodyid']/div[2]/div/a")
    private WebElement AddProductToCart;

    @FindBy(xpath = "//*[@id='tbodyid']/tr/td[4]/a")
    private WebElement DeleteCart;

    @FindBy(xpath = "")
    private WebElement cartpopup;

    @FindBy(xpath = "//*[@id='tbodyid']/div[4]/div/div/h4/a")
    private WebElement Dell;

    @FindBy(xpath = "//*[@id='tbodyid']/div[1]/div/div/h4/a")
    private WebElement SonyLaptop1;

    @FindBy(xpath = "//*[@id='tbodyid']/div[2]/div/div/h4/a")
    private WebElement SonyLaptop2;

    @FindBy(xpath = "//*[@id='tbodyid']/div[5]/div/div/h4/a")
    private WebElement Laptop3;

    @FindBy(xpath = "//*[@id='tbodyid']/div[6]/div/div/h4/a")
    private WebElement Laptop4;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //reusable code
    public void AsusMonitorBtn() {
        click(AsusMonitorButton);
        LOG.info("click on Asus Monitor");
    }
    public void UseAppleMonitor() {
        click(AppleMonitor);
        LOG.info("click on Apple Monitor");
    }
    public void DeleteFromCart() {
        click(DeleteCart);
        LOG.info("click on delete button in cart");
    }
    public void SamSungPhone() {
        click(SamSungPhoneBtn);
        LOG.info("click on SamSung button");
    }
    public void NexusPhone() {
        click(NexusBtn);
        LOG.info("click on Nexus phone");
    }
    public void IphoneSix() {
        click(IphoneSixBtn);
        LOG.info("click on Iphone Six");
    }
     public void DellLaptop() {
        click(Dell);
        LOG.info("click on Dell Laptop");
     }
    public void AddProduct() {
        click(AddProductToCart);
        LOG.info("click on add product button");
    }
    public void SonyPhone() {
        click(SonyXperia);
        LOG.info("click on Sony phone");
    }
    public void SonyLaptopOne() {
        click(SonyLaptop1);
        LOG.info("click on Sony Laptop");
    }
    public void SonyLaptopTwo() {
        click(SonyLaptop2);
        LOG.info("click on second Sony laptop");
    }
    public void LaptopThree() {
        click(Laptop3);
        LOG.info("click on third laptop");
    }
    public void LaptopFour() {
        click(Laptop4);
        LOG.info("click on fourth laptop");
    }
    public void HTE() {
        click(HTEPhone);
        LOG.info("click on HTE phone");
    }
}


