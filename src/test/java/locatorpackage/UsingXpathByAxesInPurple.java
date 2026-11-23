package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByAxesInPurple
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.sugarcosmetics.com/collections/");

          Thread.sleep(6000);

          driver.findElement(By.xpath("//li[@data-title='FACE']/preceding-sibling::li[@data-title='EYES']"))
                  .click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
