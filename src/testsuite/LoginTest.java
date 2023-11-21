package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter username 'Admin'
        driver.findElement(By.name("username")).sendKeys("Admin");
        //Enter password 'admin123'
        driver.findElement(By.name("password")).sendKeys("admin123");
        //click on login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //verify the dashboard text is display
        String expectedText = "Dashboard";
        WebElement actualTextElement = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void tearDown() {
        closeBrowser();
    }
}
