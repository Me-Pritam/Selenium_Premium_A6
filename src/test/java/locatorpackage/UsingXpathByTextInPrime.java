package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByTextInPrime
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.primevideo.com/");

          Thread.sleep(2000);

          driver.findElement(By.xpath("(//a[.='Free to me'])[2]"))
                  .click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("//button[@aria-label='Search Prime Video']"))
                  .click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@id='pv-search-nav']"))
                  .sendKeys("Made In India: A Titan Story", Keys.ENTER);

          Thread.sleep(2000);

          driver.findElement(By.xpath("//a[text()='Made In India: A Titan Story']"))
                  .click();

          Thread.sleep(4000);

          driver.findElement(By.xpath("//span[.='Play Episode 1']"))
                  .click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
