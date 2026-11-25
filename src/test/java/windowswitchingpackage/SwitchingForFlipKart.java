package windowswitchingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchingForFlipKart
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.flipkart.com/");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//span[text()='✕']"))
                  .click();

          String parentId = driver.getWindowHandle();

          System.out.println(parentId);

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@name='q']"))
                  .sendKeys("PS5", Keys.ENTER);

          Thread.sleep(2000);

          driver.findElement(By.xpath("//a[@title='SONY PS5 Console (CFI-2116A01Y) 1 TB with ASTRO’s PLAYROOM']"))
                  .click();

          Thread.sleep(2000);

          Set<String> allPageIds = driver.getWindowHandles();

          for(String pageId : allPageIds)
          {
              if (!pageId.equals(parentId))
              {
                  driver.switchTo().window(pageId);
                  break;
              }
          }
          Thread.sleep(2000);

          driver.findElement(By.xpath("//div[text()='Notify Me']"))
                  .click();

          Thread.sleep(2000);

//          driver.close();

          driver.quit();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
