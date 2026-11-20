package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathBySurroundingEaseMyTrip
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.easemytrip.com/");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[@id='eva_closeBtn']"))
                    .click();

            driver.findElement(By.xpath("//div[@id='Oneway']"))
                    .click();

            Thread.sleep(2000);

            while(true)
            {
                String monthName = driver.findElement(By.xpath("//div[@class='month-labels']/span[1]")).getText();

                System.out.println(monthName);

                if (monthName.equalsIgnoreCase("January 2027"))
                {
                    driver.findElement(By.xpath("//div[@class='month-title']/..//span[text()='31']"))
                            .click();
                    break;
                }
                else{

                    Thread.sleep(2000);

                    driver.findElement(By.xpath("//button[@id='Nxtbtn']"))
                            .click();
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
