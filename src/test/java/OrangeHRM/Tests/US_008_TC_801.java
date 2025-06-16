package OrangeHRM.Tests;

import OrangeHRM.Elements.bugbuster_elements;
import OrangeHRM.Utility.BaseDriver;
import OrangeHRM.Utility.MyFunc;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class US_008_TC_801 extends BaseDriver {


    @Test
    public void Test1() {
        bugbuster_elements el = new bugbuster_elements(driver);

        el.recruitmentLefNav.click();
        wait.until(ExpectedConditions.elementToBeClickable(el.addButton));
        el.addButton.click();

        Assert.assertTrue(el.AddCandidateForm.getText().contains("Full Name"));
        Assert.assertTrue(el.AddCandidateForm.getText().contains("Email"));
        Assert.assertTrue(el.AddCandidateForm.getText().contains("Contact Number"));

    }


    @Test(dependsOnMethods = "Test1")
    public void Test2() throws AWTException {
        bugbuster_elements el = new bugbuster_elements(driver);
        el.password.sendKeys("Mahmut" + Keys.TAB + Keys.TAB + "Tuncer");
        el.vacancySelect.click();
        el.vacancyQA.click();
        el.emailBox.sendKeys("mahmut@gmail.com" + Keys.TAB + "589873354");
        el.uploadCV.click();
        MyFunc.Bekle(2);

        StringSelection filePath = new StringSelection("C:\\Users\\boncu\\Downloads\\Adsız doküman (6).pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
        Robot robot = new Robot();

        robot.delay(1000); // hedef alanın hazır olduğundan emin olmak için
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        el.saveButton.click();

    }


    @Test(dependsOnMethods = "Test2")
    public void Test3 () {
        bugbuster_elements el = new bugbuster_elements(driver);
        wait.until(ExpectedConditions.textToBePresentInElement(el.appStageText,"Application Stage"));
        Assert.assertTrue(el.appStageText.getText().contains("Application Stage"));
    }
}
