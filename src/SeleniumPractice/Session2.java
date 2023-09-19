package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Session2 {
    public static void main(String[] args) throws InterruptedException {
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

        Thread.sleep(1000);
        WebElement categories = driver.findElement(By.xpath("//ul[@id='collapse-1']//a[contains(@href,'route=catalog/category&user')]"));
        categories.click();

        Thread.sleep(1000);
        WebElement addNew = driver.findElement(By.xpath("//a[contains(@aria-label,'Add New')]"));
        addNew.click();

        Thread.sleep(1000);
        WebElement categoryName = driver.findElement(By.xpath("//input[@placeholder='Category Name']"));
        categoryName.sendKeys("Kitchen");

        WebElement metaTagTitle = driver.findElement(By.xpath("//input[@placeholder='Meta Tag Title']"));
        metaTagTitle.sendKeys("XYZ");

        WebElement saveEntry = driver.findElement(By.xpath("//button[@aria-label='Save']"));
        saveEntry.click();

        Thread.sleep(3000);
        String actualErrorMsg = driver.findElement(By.xpath("//div[@id='alert']")).getText();
        System.out.println("Actual Error Msg is "+ actualErrorMsg);
        String expectedErrorMsg = "Warning: You do not have permission to modify categories!";

        if(actualErrorMsg.equals(expectedErrorMsg))
        {
            System.out.println("Test is passed");
        }
        else
        {
            System.out.println("Test is failed");
        }

        driver.close();
    }



}
