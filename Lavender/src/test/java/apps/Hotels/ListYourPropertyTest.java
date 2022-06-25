package apps.Hotels;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.HotelsPages.ListYourProperty;

import java.util.Set;

public class ListYourPropertyTest extends CommonAPI {

    @Test
    public void listAPrivateProperty() {
        ListYourProperty listYourProperty = new ListYourProperty(getDriver());
        listYourProperty.clickListYourProperty();
        Set<String> child = getDriver().getWindowHandles();
        for (String window : child) {
            getDriver().switchTo().window(window);
        }
        listYourProperty.clickPrivateResidence();
        isPresent(getDriver().findElement(By.xpath("//h1[contains(text(),\"See how much you could earn!\")]")));

    }


    @Test
    public void listALodgingProperty() {
        ListYourProperty listYourProperty = new ListYourProperty(getDriver());
        listYourProperty.clickListYourProperty();
        Set<String> child = getDriver().getWindowHandles();
        for (String window : child) {
            getDriver().switchTo().window(window);
        }
        listYourProperty.clickLodging();
        isPresent(getDriver().findElement(By.xpath("//h1[contains(text(),\"Where is your property located?\")]")));

    }
}

