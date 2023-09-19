package SeleniumPractice;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class PracticeTakescreenShot {
    public static void main(String[] args) throws InterruptedException, IOException
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://web.telegram.org/");
        TakeScreenShot screenShot = (TakeScreenShot) driver;




    }
}
