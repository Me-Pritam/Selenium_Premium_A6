package webdriverpackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingManageWindowMethods
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          Thread.sleep(2000);

          driver.get("https://www.flipkart.com/");

          Thread.sleep(2000);

//          driver.manage().window().maximize();
//
//          Thread.sleep(2000);
//
//          driver.manage().window().fullscreen();
//
//          Thread.sleep(2000);
//
//          driver.manage().window().minimize();

          System.out.println("Older Size ~~~~ "+driver.manage().window().getSize());

          driver.manage().window().setSize(new Dimension(500,500));

          System.out.println("New Size ~~~~ "+driver.manage().window().getSize());

          System.out.println("Old Position ~~~ "+driver.manage().window().getPosition());

          Thread.sleep(2000);

          driver.manage().window().setPosition(new Point(400,500));

          Thread.sleep(1000);

          System.out.println("New Position ~~~ "+driver.manage().window().getPosition());


      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
