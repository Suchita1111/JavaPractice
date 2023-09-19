package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class windowHandle {
   static WebDriver driver;
    public static void switchToWindowUsingTitle(String expectedTitle){

        Set<String> addressesOfAllWindows = driver.getWindowHandles();
         for (String windowAddress : addressesOfAllWindows) {
            driver.switchTo().window(windowAddress);
            String title = driver.getTitle();
           // String expectedTitle = "Announcements";
            if (title.equals(expectedTitle)) {
                System.out.println(driver.getTitle());
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://deepakrao64.github.io/SB/");

        driver.findElement(By.xpath("//button[contains(text(),'Selenium Practice')]")).click();

        String addressOfMainWindow =driver.getWindowHandle();

        driver.findElement(By.xpath("//h3/following-sibling::button[text()='Class Details']")).click();
        driver.findElement(By.xpath("//button[text()='Announcements']")).click();
        driver.findElement(By.xpath("//button[text()='Placement Announcements']")).click();


       windowHandle.switchToWindowUsingTitle("Announcements");
       System.out.println(driver.getTitle());
       driver.switchTo().window(addressOfMainWindow);
       System.out.println(driver.getTitle());

    }
}
