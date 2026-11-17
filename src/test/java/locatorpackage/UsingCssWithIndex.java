package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UsingCssWithIndex
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://assertqa.com/practice/webtables");

            Thread.sleep(2000);

//            String data = driver.findElement(By.cssSelector("table#employees-table>tbody>tr:nth-child(3)>td:nth-child(3)"))
//                    .getText();
//
//            System.out.println(data);

            List<WebElement> allOptions = driver.findElements(By.cssSelector("table#employees-table>tbody>tr>td:nth-child(3)"));


            for(WebElement option : allOptions)
            {
                System.out.println(option.getText());
            }
        }
        catch (Exception e)
        {

            e.printStackTrace();
        }
    }
}
