package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDropdown {
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

        Thread.sleep(2000);
        WebElement product = driver.findElement(By.xpath("//a[text()='Products']"));
        product.click();

        Thread.sleep(2000);
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='input-status']"));
        dropdown.click();

        Select selectDropdown = new Select(dropdown);


        List<WebElement> dropdownOptions = selectDropdown.getOptions();
        for(WebElement options:dropdownOptions )
        {
            System.out.println(options.getText());

        }
        driver.close();
    }
}

