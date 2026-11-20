package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByMultiAttributeWithSVG
{
    public static void main(String[] args)
    {
     try
     {
         WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();

         driver.get("https://testautomationpractice.blogspot.com/");

         Thread.sleep(2000);

         driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"))
                 .sendKeys("Selenium");

         driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"))
                 .click();
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
    }
}
