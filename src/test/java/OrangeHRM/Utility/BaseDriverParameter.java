package OrangeHRM.Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseDriverParameter {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass(groups = {"Smoke", "Regression"})
    @Parameters("BrowserTipi")
    public void Setup(String browserTipi) {
        // seleniumdaki static yani başlangıç kısımlar konacak
        switch (browserTipi.toLowerCase()) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @AfterClass(groups = {"Smoke", "Regression"})
    public void TearDown() {
        MyFunc.Bekle(3);
        driver.quit();
    }
}
