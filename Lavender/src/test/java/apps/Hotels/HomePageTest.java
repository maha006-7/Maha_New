package apps.Hotels;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HotelsPages.HomePage;

public class HomePageTest extends CommonAPI {

    @Test
    public void clickPayLessOnSelectedProperties(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickPayLessOnSelectedProperties();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"campaign-header-1\"]")));
    }

    @Test
    public void checkMotels(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickMotels();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-1\"]/div/h1")));
    }
}
