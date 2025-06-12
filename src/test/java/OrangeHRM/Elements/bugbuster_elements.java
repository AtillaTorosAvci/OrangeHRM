package OrangeHRM.Elements;

import OrangeHRM.Utility.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class bugbuster_elements {

    public bugbuster_elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }



}
