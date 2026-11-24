package windowswitchingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchingActionInAmazon
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.amazon.in/");

          Thread.sleep(2000);

          String parentId = driver.getWindowHandle();

          driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                  .sendKeys("hotwheels bmw");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"))
                  .click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("//a[starts-with(.,'BMW M4 GT3 HW Starting Grid Ages')]"))
                  .click();

          Thread.sleep(2000);

          Set<String> allPageIds = driver.getWindowHandles();

          for(String pageId : allPageIds)
          {
              if (pageId.equals(parentId))
              {
                  continue;
              }
              else
              {
                  driver.switchTo().window(pageId);

                  break;
              }
          }

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@id='add-to-cart-button']"))
                  .click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
