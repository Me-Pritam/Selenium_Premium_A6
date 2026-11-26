package windowswitchingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class SwitchingToOneChildFromMultiChild
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
                  .sendKeys("Dark Chocolate", Keys.ENTER);

          Thread.sleep(2000);

          List<WebElement> allChocolates = driver.findElements(By.xpath("(//div[@class='QSCKDh dLgFEE']/descendant::div[@class='lvJbLV col-12-12'])[2]/descendant::a[@class='pIpigb']"));

          for(WebElement element :allChocolates)
          {
              element.click();
          }

          Thread.sleep(2000);

          Set<String> allPageIds= driver.getWindowHandles();

          for(String pageId : allPageIds)
          {
              if (!pageId.equals(parentId))
              {
                  driver.switchTo().window(pageId);

                  if (driver.getTitle().contains("Myfa Chocolates"))
                  {
                      break;
                  }
                  else {
                      driver.close();
                  }
              }
          }

          Thread.sleep(2000);

          driver.findElement(By.xpath("//div[text()='Add to cart']"))
                  .click();

      }
      catch (Exception e)
      {
          e.printStackTrace();

      }
    }
}
