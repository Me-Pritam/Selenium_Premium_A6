package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathContainsInYoutube
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.youtube.com/");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[contains(@class,'yt-searchbox-input title')]"))
                  .sendKeys("Hanle Night Sky Gazing");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//button[@title='Search']"))
                  .click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("//a[contains(@aria-label,'Mysterious Dark Sky Paradise')]"))
                  .click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
