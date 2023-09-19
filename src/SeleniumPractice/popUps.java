package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class popUps {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Alert Confirm = driver.switchTo().alert();
        String ConfirmText = Confirm.getText();
        System.out.println("Text in the alert is :- " + ConfirmText);
        Thread.sleep(2000);
        Confirm.accept();

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        /*driver.switchTo().alert();
        Thread.sleep(5000);
        driver.switchTo().alert().sendKeys("text");
      */
        Alert obj = driver.switchTo().alert();
        Thread.sleep(5000);
        driver.switchTo().alert().sendKeys("handling Prompt");
        Thread.sleep(5000);
        driver.switchTo().alert().accept();


    }
}
