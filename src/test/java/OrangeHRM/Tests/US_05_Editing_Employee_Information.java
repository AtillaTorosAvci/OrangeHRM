package OrangeHRM.Tests;

import OrangeHRM.Elements.bugbuster_elements;
import OrangeHRM.Utility.BaseDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US_05_Editing_Employee_Information extends BaseDriver {

    @Test
    public void Editing_Employee_Inf() throws InterruptedException {

        bugbuster_elements element = new bugbuster_elements();

        element.PIM.click();

        List<WebElement> emp = element.employeelist;

        int rnd = (int) (Math.random() * emp.size());

        element.employeelist.get(rnd).click();

        element.ContactDetails.click();

        element.Street1.sendKeys("Paulo Chamber Dr.");

        element.Street2.sendKeys("Somewhere St.");

        element.City.sendKeys("Tampa");

        element.State.sendKeys("Florida");

        element.ZipCode.sendKeys("09442");

        new Actions(driver)
        .moveToElement(element.CountryButton)
                .click()
                .build()
                .perform();

        for (int i = 0; i < 226; i++) {
            new Actions(driver)
                    .sendKeys(Keys.DOWN)
                    .build()
                    .perform();
        }

        new Actions(driver)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        int rnd2 = (int) (Math.random() * 1000);

        element.Telephone.sendKeys("9119119"+rnd2);

        element.Email.sendKeys("abc"+rnd2+"@gmail.com");

        Thread.sleep(3000);

        element.SaveButton.click();

        Thread.sleep(5000);

        element.ContactDetails.click();

        Assert.assertTrue(element.USA.getText().contains("United States"),"Guncelleme dogrulanamadi.");

    }
}
