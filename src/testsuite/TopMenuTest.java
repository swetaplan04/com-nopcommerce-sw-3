package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String BaseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp()
    {
          openBrowser(BaseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

//        WebElement computerTab = driver.findElement(By.linkText("Computers"));
        // computerTab.click();

    }
   @Test
    public void userShouldNavigateToElectronicsPageSuccessfully()
   {
       clickOnElement(By.linkText("Electronics"));
       verifyElements("Electronics tab not matching","Electronics",By.xpath("//h1[contains(text(),'Electronics')]"));

//       String expectedMessage = "Electronics";
//       WebElement electronicsTab = driver.findElement(By.linkText("Electronics"));
//       electronicsTab.click();
//       WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
//       String actualMessage = actualMessageElement.getText();
//       Assert.assertEquals("Electronics tab not matching",actualMessage,expectedMessage);

   }
   @Test
   public void userShouldNavigateToApparelPageSuccessfully()
   {
       clickOnElement(By.linkText("Apparel"));
       verifyElements("Apparel tab not matching","Apparel",By.xpath("//h1[contains(text(),'Apparel')]"));



//       String expectedMessage = "Apparel";
//       WebElement ApparelTab = driver.findElement(By.linkText("Apparel"));
//       ApparelTab.click();
//       WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
//       String actualMessage = actualMessageElement.getText();
//       Assert.assertEquals("Apparel tab not matching",actualMessage,expectedMessage);
   }
   @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully()
   {
       clickOnElement(By.linkText("Digital downloads"));
       verifyElements("Digital downloads tab not matching","Digital downloads",By.xpath("//h1[contains(text(),'Digital downloads')]"));



//       String expectedMessage = "Digital downloads";
//       WebElement DigitaldownloadsTab = driver.findElement(By.linkText("Digital downloads"));
//       DigitaldownloadsTab.click();
//       WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
//       String actualMessage = actualMessageElement.getText();
//       Assert.assertEquals("Digital downloads tab not matching",actualMessage,expectedMessage);
   }
   @Test
    public void userShouldNavigateToBooksPageSuccessfully()
   {
       String expectedMessage = "Books";
       WebElement BooksTab = driver.findElement(By.linkText("Books"));
       BooksTab.click();
       WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
       String actualMessage = actualMessageElement.getText();
       Assert.assertEquals("Books tab not matching",actualMessage,expectedMessage);

   }
   @Test
    public void userShouldNavigateToJewelryPageSuccessfully()
   {
       String expectedMessage = "Jewelry";
       WebElement jewelryTab = driver.findElement(By.linkText("Jewelry"));
       jewelryTab.click();
       WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
       String actualMessage = actualMessageElement.getText();
       Assert.assertEquals("Jewelry tab not matching",actualMessage,expectedMessage);
   }

   @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully()
   {
       String expectedMessage = "Gift Cards";
       WebElement giftCardsTab = driver.findElement(By.linkText("Gift Cards"));
       giftCardsTab.click();
       WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
       String actualMessage = actualMessageElement.getText();
       Assert.assertEquals("Gift Cards tab not matching",actualMessage,expectedMessage);
   }
   @After
    public void tearDown()
   {
       closeBrowser();
   }
}


