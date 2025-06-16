package OrangeHRM.Elements;

import OrangeHRM.Utility.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bugbuster_elements {

    public bugbuster_elements(WebDriver driver) {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    // Omer
    @FindBy(xpath = "(//div/input)[2]")
    public WebElement password;

    @FindBy(xpath = "(//ul/li/a/span)[5]")
    public WebElement recruitmentLefNav;

    @FindBy(xpath = "(//div/div/button)[3]")
    public WebElement addButton;

    @FindBy(xpath = "//div/form")
    public WebElement AddCandidateForm;

    @FindBy(xpath = "//div[@class='oxd-select-wrapper']")
    public WebElement vacancySelect;

    @FindBy(xpath = "//div[@role='listbox']//span[text()='Senior QA Lead']")
    public WebElement vacancyQA;

    @FindBy(xpath = "(//div/input)[5]")
    public WebElement emailBox;

    @FindBy(xpath = "//div[2]/div/i")
    public WebElement uploadCV;

    @FindBy(xpath = "//form/div/button[2]")
    public WebElement saveButton;

    @FindBy(xpath = "//form/h6")
    public WebElement appStageText;
    // Omer
}
