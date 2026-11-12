package taskpackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class QtalkFacebookPageSourceTask
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().setSize(new Dimension(500,500));

            driver.get("https://chat.qspiders.com/");

            Thread.sleep(2000);

//            driver.navigate().back();

//            Thread.sleep(1000);

            driver.navigate().to(new URL("https://www.facebook.com/"));

            Thread.sleep(200);

            String fbSource =  driver.getPageSource();

            driver.navigate().back();

            Thread.sleep(2000);

            String qtalkSource = driver.getPageSource();

            if (!fbSource.equals(qtalkSource))
            {
                System.out.println("The sources are different");
            }
            else{
                System.out.println("The sources are same");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
