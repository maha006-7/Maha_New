package pages.DemoBlazePages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContactPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ContactPage.class);

    @FindBy(xpath = "//*[@id='recipient-email']")
    private WebElement ContactEmailBtn;

    @FindBy(xpath = "//*[@id='recipient-name']")
    private WebElement ContactNameBtn;

    @FindBy(xpath = "//*[@id='message-text']")
    private WebElement ContactMsgButton;

    @FindBy(xpath = "//*[@id='exampleModal']/div/div/div[3]/button[2]")
    private WebElement SendMessageButton;

    public ContactPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //reusable code
    public void ContactEmailTab() {
        type(ContactEmailBtn,"pntrandomperson@gmail.com");
        LOG.info("type contact email in tab");
    }
    public void ContactNameTab() {
        type(ContactNameBtn, "PNT Random");
        LOG.info("type contact name in tab");
    }
    public void ContactMessageTab() {
        type(ContactMsgButton, "Why is there no discount on my iphone?");
        LOG.info("type message in tab");
    }
    public void SendMessage() {
        click(SendMessageButton);
        LOG.info("click on send message button");
    }
    public void DiffContactEmail() {
        type(ContactEmailBtn, "random@gmail.com");
        LOG.info("type different email for specific test");
    }
    public void DiffContactName() {
        type(ContactNameBtn, "Random Doe");
        LOG.info("type different contact for specific test");
    }
    public void DiffContactMessage() {
        type(ContactMsgButton, "Hello There");
        LOG.info("type different contact message for specific test");
    }
    public void SonyEmail() {
        type(ContactEmailBtn, "sonylover@gmail.com");
        LOG.info("type email for sony case");
    }
    public void SonyName() {
        type(ContactNameBtn, "Sony Lover");
        LOG.info("type name for sony case");
    }
    public void SonyMessage() {
        type(ContactMsgButton, "Hello There I want to buy the Xperia");
        LOG.info("type message for sony case");
    }
    public void NewMessage() {
        type(ContactMsgButton, "Hello your slides are cool");
        LOG.info("type message for new test case");
    }
    public void AboutUsMessage() {
        type(ContactMsgButton, "Hello I would like to know more about this site");
        LOG.info("type message for about us test case");
    }
}
