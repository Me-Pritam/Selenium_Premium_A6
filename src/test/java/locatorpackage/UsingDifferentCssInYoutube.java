package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingDifferentCssInYoutube
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.youtube.com/");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("input[class^='ytSearchboxComponentInput']"))
                    .sendKeys("qspiders dilsukhnagar");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("button[class$='SearchButton']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("yt-formatted-string[aria-label*='| 3 LPA | Software Engineer | ']"))
                    .click();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
