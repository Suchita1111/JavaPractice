package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class PracticeWindowSwitch {
        static WebDriver driver;
    public static void switchWindowMethod(String expectedTitle)
    {
        Set<String> allWindowAddress = driver.getWindowHandles();
        for(String eachWindowAdd : allWindowAddress)
        {
            driver.switchTo().window(eachWindowAdd);
            String title = driver.getTitle();
            if(title.equals(expectedTitle))
            {        break;         }
        }
    }
    public static void main(String[] args)
    {
        driver = new ChromeDriver();
        driver.get("https://deepakrao64.github.io/SB/");
        driver.findElement(By.xpath("//button[text()='Selenium Practice']")).click();
        String addressOfMainWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[text()='Announcements']")).click();
        driver.findElement(By.xpath("//h3/following-sibling::button[text()='Class Details']")).click();
        //driver.findElement(By.xpath("//button[text()='Placement Announcements']")).click();

        System.out.println(driver.getTitle());
        PracticeWindowSwitch.switchWindowMethod("Class Details");
        System.out.println(driver.getTitle());
        driver.switchTo().window(addressOfMainWindow);
        System.out.println(driver.getTitle());
        PracticeWindowSwitch.switchWindowMethod("Announcements");
        System.out.println(driver.getTitle());
    }

}
