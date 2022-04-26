package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {

    String BaseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp()
    {
        openBrowser(BaseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        clickOnElement(By.linkText("Log in"));
        //This is from requirement
        String expectMessage = "Welcome, Please Sign In!";

        //WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
         // verify actual and expected text using Assert
        Assert.assertEquals("login page not matching", actualMessage, expectMessage);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        String expectedMessage = "Log out";

        clickOnElement(By.linkText("Log in"));

        sendTextToElement(By.id("Email"),"xyz@gmail.com");
        sendTextToElement(By.id("Password"),"Temp123");
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        String actualMessage = getTextFromElement(By.xpath("//button[contains(text(),'Log in')]"));
        // verify the text error message
        Assert.assertEquals("Logout text is not matching", actualMessage, expectedMessage);
    }

    @Test
    public void verifyTheErrorMessage() {
        String expectedMessage = "Login was unsuccessful. please correct the error and try again.\n"
                + "No customer account found";
        clickOnElement(By.linkText("Log in"));

        sendTextToElement(By.id("Email"),"abc@yahoo.com");
        sendTextToElement(By.id("Password"),"abc123");

        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));


       String actualMessage = getTextFromElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));

        Assert.assertEquals("Error Message not displayed",actualMessage,expectedMessage);
    }
    @After
    public void tearDown()
    {
        closeBrowser();
    }
}