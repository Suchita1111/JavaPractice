package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Session1 {
    public static void main (String[]args) throws InterruptedException {
        WebDriver chromedriver = new ChromeDriver();
        chromedriver.get("https://demo.opencart.com/admin/index.php?route=common/login");

        WebElement username = chromedriver.findElement(By.id("input-username"));
        username.sendKeys("demo");

        WebElement password = chromedriver.findElement(By.id("input-password"));
        password.sendKeys("demo");

       // WebElement loginIcon =  chromedriver.findElement(By.xpath("//i[@class='fas fa-key']"));

        WebElement login =  chromedriver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        Thread.sleep(5000);

          WebElement crossBtn = chromedriver.findElement(By.xpath("(//button[@type='button'])[3]"));
        crossBtn.click();

        String actualHeader = chromedriver.findElement(By.tagName("h1")).getText();
        String expectedHeader = "Dashboard";
        if(actualHeader.equals(expectedHeader))
        {
            System.out.println("Test Passed");
        }
        else { System.out.println("Test Failed");
        }

    }
}
