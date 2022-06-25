package apps.Hotels;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelsPages.CustomerService;

public class CustomerServiceTest extends CommonAPI {
    @Test
    public void checkFlightInsurance() {
        CustomerService customerService = new CustomerService(getDriver());
        customerService.clickSupport();
        customerService.clickPackages();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
        customerService.clickManageAPackage();
        customerService.clickFlightInsurance();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"article-title-19981\"]")));


    }

    @Test
    public void checkChangeAndCancelPolicy() {
        CustomerService customerService = new CustomerService(getDriver());
        customerService.clickSupport();
        customerService.clickPackages();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
        customerService.clickChangeAndCancel();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"article-title-21537\"]/h3")));

    }

    @Test
    public void checkFlightCheckIn() {
        CustomerService customerService = new CustomerService(getDriver());
        customerService.clickSupport();
        customerService.clickPackages();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
        customerService.clickFlightCheckIn();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"article-title-12054\"]/h3")));


    }

    @Test
    public void checkRefunds() {
        CustomerService customerService = new CustomerService(getDriver());
        customerService.clickSupport();
        customerService.clickPackages();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
        customerService.clickPaymentAndReceipts();
        customerService.clickRefunds();
        isPresent(getDriver().findElement(By.xpath("//h4[contains(text(),\"Refundable:\")]")));


    }

    @Test
    public void yourSettings() {
        CustomerService customerService = new CustomerService(getDriver());
        customerService.clickSupport();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
        customerService.clickYourSettings();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"result-toggle-408\"]/ul/li[1]/a")));


    }
}
