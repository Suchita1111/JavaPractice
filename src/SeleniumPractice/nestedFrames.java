package SeleniumPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrames {
    public static void main(String[] args)
    {
        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame("frame-bottom");
        String bottom = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
        System.out.println(bottom);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-right");
        String right = driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();
        System.out.println(right);

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        String middle = driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]")).getText();
        System.out.println(middle);

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-left");
        String left = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
        System.out.println(left);

        driver.close();
    }
}
