package synchronizationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingImplicitWaitOverThreadSleep
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.youtube.com/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@name='search_query']"))
                    .sendKeys("Ramayana Vanvas Theme");

//            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[@title='Search']")).click();

//            Thread.sleep(2000);

            driver.findElement(By.xpath("//a[starts-with(@aria-label,'Vanvaas Theme | Ramayana Part 1|')]"))
                    .click();

//            Thread.sleep(1000);

            driver.manage().window().fullscreen();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
