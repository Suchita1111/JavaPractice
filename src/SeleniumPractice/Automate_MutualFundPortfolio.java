package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Automate_MutualFundPortfolio {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://deepakrao64.github.io/SB/MutualFundClient/LoginPage.html");

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[@class='login-button']")).click();

        driver.findElement(By.xpath("//a[text()='Mutual Fund Portfolio']")).click();

        Boolean isMutualFundPortfolioDisplayed = driver.findElement(By.xpath("//h2[contains(text(),'Mutual Fund')]")).isDisplayed();
        Boolean isTableDetailsDisplayed = driver.findElement(By.xpath("//div[contains(@class,'portfolio')]/table")).isDisplayed();
        System.out.println(isMutualFundPortfolioDisplayed);
        System.out.println(isTableDetailsDisplayed);

        if(isMutualFundPortfolioDisplayed.equals(isTableDetailsDisplayed)) {

            System.out.println("Wel-Come to Mutual Fund Portfolio page");
        }
        else
        {
            System.out.println("You are on wrong Page");
        }



       //'equals' between objects of inconvertible types 'String' and 'WebElement

       /* if(currentPage.equals(actualPage))
        {
            System.out.println("Wel-Come to Mutual Fund Portfolio");
        }*/
    }
}
