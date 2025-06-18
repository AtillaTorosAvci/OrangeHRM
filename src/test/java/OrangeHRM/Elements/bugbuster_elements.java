package OrangeHRM.Elements;

import OrangeHRM.Utility.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

public class bugbuster_elements {

    public bugbuster_elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "ul[class='oxd-main-menu']>:nth-child(2)")
    public WebElement PIM;

    @FindBy(xpath = "//div[@class='oxd-table-body']/div")
    public List<WebElement> employeelist;

    @FindBy(xpath = "//div[@class='orangehrm-tabs']//div[2]/a")
    public WebElement ContactDetails;

    @FindBy(xpath = "//form[@class='oxd-form']/div[1]/div/div[1]/div/div[2]/input")
    public WebElement Street1;

    @FindBy(xpath = "//form[@class='oxd-form']/div[1]/div/div[2]/div/div[2]/input")
    public WebElement Street2;

    @FindBy(xpath = "//form[@class='oxd-form']/div[1]/div/div[3]/div/div[2]/input")
    public WebElement City;

    @FindBy(xpath = "//form[@class='oxd-form']/div[1]/div/div[4]/div/div[2]/input")
    public WebElement State;

    @FindBy(xpath = "//form[@class='oxd-form']/div[1]/div/div[5]/div/div[2]/input")
    public WebElement ZipCode;

    @FindBy (xpath = "//form[@class='oxd-form']/div[1]/div/div[6]/div/div[2]/div/div//i")
    public WebElement CountryButton;

    @FindBy (xpath = "//form[@class='oxd-form']/div[1]/div/div[6]/div/div[2]/div/div/div")
    public WebElement USA;

    @FindBy (xpath = "//form[@class='oxd-form']/div[2]/div/div[1]/div/div[2]/input")
    public WebElement Telephone;

    @FindBy (xpath = "//form[@class='oxd-form']/div[3]/div/div[1]/div/div[2]/input")
    public WebElement Email;

    @FindBy (xpath = "//form[@class='oxd-form']/div[4]/button")
    public WebElement SaveButton;

}
