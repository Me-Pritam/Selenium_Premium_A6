package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClassNameInYoutube
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.youtube.com/");

            Thread.sleep(4000);

            driver.findElement(By.name("search_query"))
                    .sendKeys("Vanvas Theme");

            Thread.sleep(2000);

            driver.findElement(By.className("ytSearchboxComponentSearchButton"))
                    .click();

            Thread.sleep(3000);

            driver.findElement(By.partialLinkText("Ramayana: Vanvaas Theme (Audio) | Hans Zimmer | A.R. Rahman"))
                    .click();

            Thread.sleep(2000);

            driver.manage().window().fullscreen();
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
