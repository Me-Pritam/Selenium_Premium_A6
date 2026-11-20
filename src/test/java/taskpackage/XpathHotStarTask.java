package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathHotStarTask
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.hotstar.com/in/home");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//a[@href='/in/explore']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@id='searchBar']"))
                    .sendKeys("Legends of Hanuman", Keys.ENTER);

            Thread.sleep(4000);

            driver.findElement(By.xpath("(//a[starts-with(@href,'/in/shows/the-legend-of-hanuman')])[2]"))
                    .click();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
