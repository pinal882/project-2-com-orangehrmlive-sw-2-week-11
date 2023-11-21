package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    static String baseUrl="https://opensource-demo.orangehrmlive.com/";
   @ Before
   public void setup(){
       openBrowser(baseUrl);
   }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        //click on the forgot your password link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        //verify the text reset password
        String expectedText = "Reset Password";
        WebElement actualTextElement = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));
        String Text = actualTextElement.getText();
        Assert.assertEquals(expectedText,Text);
   }
   public void tearDown(){
       closeBrowser();
   }
}
