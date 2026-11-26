package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebElementActions
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://demoqa.com/");

          Thread.sleep(6000);

          driver.findElement(By.xpath("//a[@href='/elements']")).click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("//a[@href='/text-box']")).click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@id='userName']"))
                  .sendKeys("John Wick");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@id='userEmail']"))
                  .sendKeys("wick@gmail.com", Keys.TAB,"Dilsukhnagar, Hyderabad");

          Thread.sleep(2000);

          WebElement currentAddressField = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));

          currentAddressField.clear();

          Thread.sleep(2000);

          currentAddressField.sendKeys("Hightech City , Hyderabad");

          Thread.sleep(2000);

          currentAddressField.sendKeys(Keys.TAB,"Kolkata");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//button[@id='submit']"))
                  .submit();


      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
