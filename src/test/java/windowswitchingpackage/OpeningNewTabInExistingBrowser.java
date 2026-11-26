package windowswitchingpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningNewTabInExistingBrowser
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.lavamobiles.com/");

          Thread.sleep(2000);

//          driver.switchTo().newWindow(WindowType.TAB);

          driver.switchTo().newWindow(WindowType.WINDOW);

          driver.get("https://www.mivi.in/");
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
