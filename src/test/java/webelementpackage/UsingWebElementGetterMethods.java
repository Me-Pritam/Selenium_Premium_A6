package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebElementGetterMethods
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.facebook.com/");

          Thread.sleep(2000);

          WebElement logInButton =  driver.findElement(By.cssSelector("div[aria-label='Log in'] .xtvsq51[role='none']"));

          System.out.println(logInButton.getText());

          System.out.println(logInButton.getTagName());

          System.out.println(logInButton.getDomProperty("color"));

          System.out.println(logInButton.getDomAttribute("class"));

          System.out.println(logInButton.getSize());

          System.out.println(logInButton.getLocation());

          System.out.println(logInButton.getRect().getDimension());
          System.out.println(logInButton.getRect().getPoint());
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
