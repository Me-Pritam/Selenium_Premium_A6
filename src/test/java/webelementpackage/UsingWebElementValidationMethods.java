package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebElementValidationMethods
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.instagram.com/");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@name='email']"))
                  .sendKeys("john@gmail.com");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@name='pass']"))
                  .sendKeys("Password@123456");

          Thread.sleep(4000);

          WebElement showPasswordButton= driver.findElement(By.xpath("//div[@aria-label='Show password']"));

          if (showPasswordButton.isDisplayed())
          {
              System.out.println("The show password button is displayed");
          }else
          {
              System.out.println("The show password is not displayed");
          }

          WebElement logInButton= driver.findElement(By.xpath("//div[@aria-label='Log In']"));

          if (logInButton.isEnabled())
          {
              System.out.println("The LogIn button is enabled");
          }
          else {
              System.out.println("The LogIn button is not enabled");
          }


          Thread.sleep(2000);

          driver.navigate().to("https://demoapps.qspiders.com/ui/checkbox?sublist=0");

          Thread.sleep(2000);

          WebElement emailCheckBox = driver.findElement(By.xpath("//input[@id='domain_a']"));

          emailCheckBox.click();

          if (emailCheckBox.isSelected())
          {
              System.out.println("The Email check box is selected");
          }
          else {
              System.out.println("Teh Email check box is not selected");
          }

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
