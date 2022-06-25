package apps.Hotels;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelsPages.SignUp;
import utility.ExcelReader;

public class SignUpTest extends CommonAPI {


    @Test
    public void signUp(){
        ExcelReader reader = new ExcelReader("/Users/mahaakhazzan/Desktop/Lavender/data/SampleSheet.xlsx");
        String newEmail = reader.getDataFromCell("Maha2", 0, 0);
        String firstName = reader.getDataFromCell("Maha2", 0, 1);
        String lastName = reader.getDataFromCell("Maha2", 0, 2);
        String password = reader.getDataFromCell("Maha2", 0, 3);
        SignUp signUp = new SignUp(getDriver());
        signUp.clickSignIn();
        signUp.clickSignUp();
        signUp.typeEmail(newEmail);
        signUp.typeName(firstName);
        signUp.typeLastName(lastName);
        signUp.typePassword(password);
        isInteractable(getDriver().findElement(By.cssSelector("button[id=\"signupFormSubmitButton\"]")));

    }
}
