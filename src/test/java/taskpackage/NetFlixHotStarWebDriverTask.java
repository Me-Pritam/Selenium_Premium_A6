package taskpackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetFlixHotStarWebDriverTask
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.netflix.com/in/");

            Thread.sleep(2000);

            if(driver.getCurrentUrl().contains("in"))
            {
                System.out.println("The netflix is opened in Indian path");

                driver.navigate().to("https://www.hotstar.com/in/home");

                Thread.sleep(2000);

                if (driver.getTitle().contains("JioHotstar"))
                {
                    System.out.println("The Hotstar is opened");

                    driver.manage().window().setSize(new Dimension(500,500));

                    Thread.sleep(2000);

                    driver.manage().window().setPosition(new Point(800,0));


                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
