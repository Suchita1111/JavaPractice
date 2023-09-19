package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AutomaticMFPTestCase {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://deepakrao64.github.io/SB/MutualFundClient/LoginPage.html");

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[@class='login-button']")).click();

        driver.findElement(By.xpath("//a[text()='Mutual Fund Portfolio']")).click();

        WebElement axisBlueChip = driver.findElement(By.xpath("//div[contains(@class,'portfolio')]/table//td[text()='Axis Bluechip Fund']"));

        Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(axisBlueChip));

        Actions actions = new Actions(driver);
        actions.contextClick(axisBlueChip).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[text()='Redeem Funds']")).click();

        driver.findElement(By.xpath("//div[@id='redeemModal']/button[text()='Confirm']")).click();

        driver.findElement(By.xpath("//div[@id='payoutModal']//button[text()='Credit to Bank']")).click();

        Thread.sleep(2000);

        Alert redimAlert = driver.switchTo().alert();

        String actualAlertMsg = redimAlert.getText();
        System.out.println(actualAlertMsg);

        String expectedMsg = "Redemption successfully requested via Credit To Bank.";

        if(expectedMsg.equals(actualAlertMsg))
        {
            System.out.println("Successful");
        }
        else {
            System.out.println("Fail");
        }
        redimAlert.accept();







    }

    }
