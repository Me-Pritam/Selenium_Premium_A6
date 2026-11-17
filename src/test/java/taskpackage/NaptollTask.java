package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NaptollTask
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.naaptol.com/");

          Thread.sleep(2000);

          driver.findElement(By.cssSelector("div[class='cate_head']"))
                  .click();

          Thread.sleep(4000);

          List<WebElement> allOptions = driver.findElements(By.cssSelector("ul#mainMenu_UL>li>a"));

          for(WebElement option : allOptions)
          {
              System.out.println(option.getText().strip());
          }
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
