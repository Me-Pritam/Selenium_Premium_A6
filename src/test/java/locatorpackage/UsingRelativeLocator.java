package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingRelativeLocator
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.myntra.com/");

          Thread.sleep(6000);

          driver.findElement(RelativeLocator.with(By.xpath("//a[text()='Women' and @data-index='1']"))
                                            .near(By.xpath("//a[text()='Men' and @data-index='0']"))).
                  click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
