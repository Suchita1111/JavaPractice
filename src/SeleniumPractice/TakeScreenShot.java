package SeleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/index.php?route=common/login");

        WebElement username = driver.findElement(By.id("input-username"));
        username.sendKeys("demo");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("demo");

        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        Thread.sleep(1000);
        WebElement crossBtn = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
        crossBtn.click();

        Thread.sleep(2000);
        WebElement catalog = driver.findElement(By.xpath("//a[@href='#collapse-1']"));
        catalog.click();

        Thread.sleep(2000);
        WebElement Categories =driver.findElement(By.xpath("//a[text()='Categories']"));
        Categories.click();

        Thread.sleep(2000);
        WebElement cameraEditBtn = driver.findElement(By.xpath("//td[text()='Cameras']/following-sibling::td[2]/a"));
        cameraEditBtn.click();

        TakesScreenshot screenshot = (TakesScreenshot) driver;

        File source = screenshot.getScreenshotAs(OutputType.FILE);

        File destination = new File("C:\\Users\\admin 4\\IdeaProjects\\Java\\ScreenShotImages\\cameraEdit.png");

        FileHandler.copy(source, destination );

        Thread.sleep(3000);

        driver.close();

    }
}
