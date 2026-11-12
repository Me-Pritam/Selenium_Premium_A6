package webdriverpackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript
{
    public static void main(String[] args)
    {
         try
        {
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.amazon.in/");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
