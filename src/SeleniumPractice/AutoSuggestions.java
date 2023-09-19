package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung");
        Thread.sleep(2000);

        List<WebElement> listOFElements = driver.findElements(By.xpath("//div[contains(@class,'left-pane')]"));
                for(WebElement element:listOFElements)
                {
                    System.out.println(element.getText());
                }

    }
    //
}
