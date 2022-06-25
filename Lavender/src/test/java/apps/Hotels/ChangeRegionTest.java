
package apps.Hotels;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelsPages.ChangeRegion;

public class ChangeRegionTest extends CommonAPI {

    //Handling dropdown
    @Test
    public void changeRegion(){
        ChangeRegion changeRegion = new ChangeRegion(getDriver());
        changeRegion.clickRegion();
        changeRegion.selectRegion("300000752");
        changeRegion.clickSaveBtn();
        isPresent(getDriver().findElement(By.xpath("//*[@id=\"secondaryNav\"]/button/div")));

    }
}

