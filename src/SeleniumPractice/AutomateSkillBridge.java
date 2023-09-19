package SeleniumPractice;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class AutomateSkillBridge {

    static WebDriver driver;
   public static void getWindowAddresses(String expectedTitle)

    {
        //solution for -ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
        final Logger logger = LogManager.getLogger(AutomateSkillBridge.class);

        Set<String> allWindowAddress = driver.getWindowHandles();
        for(String address:allWindowAddress)
        {
            driver.switchTo().window(address);
            String currentTitle = driver.getTitle();
           // String pageTitle = "Assignments";
            if(expectedTitle.equals(currentTitle))
            {
                System.out.println(driver.getTitle());
                break;
            }
        }
    }
    public static void main(String[] args) throws IOException, InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://deepakrao64.github.io/SB/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//button[text()='Selenium Practice']")).click();
        driver.findElement(By.xpath("//button[text()='Assignments']")).click();

        AutomateSkillBridge.getWindowAddresses("Assignments");

        driver.findElement(By.xpath("//button[contains(text(),'Click Here')]")).click();

        AutomateSkillBridge.getWindowAddresses("Investor Onboarding");

        FileInputStream file = new FileInputStream("B:\\Data\\Investor_Onboarding.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        //Add Full name
        String addFullName = workbook.getSheet("Investor_Onboarding").getRow(1).getCell(0).getStringCellValue();
        driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys(addFullName);

        WebElement iFrame = driver.findElement(By.xpath("//iframe[contains(@src,'deepakrao64.github')]"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(1000);

        //Add Email
        String addEmail = workbook.getSheet("Investor_Onboarding").getRow(1).getCell(1).getStringCellValue();
        driver.findElement(By.xpath("//input[@id='iframeEmail']")).sendKeys(addEmail);

        driver.switchTo().defaultContent();

        Thread.sleep(1000);
        //Date of Birth
         String addDOB = workbook.getSheet("Investor_Onboarding").getRow(1).getCell(2).getStringCellValue();
        driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(addDOB);

        //RadioButton
        driver.findElement(By.xpath("//input[@value='male']")).click();

        Thread.sleep(2000);
        //Dropdown
        WebElement documentDropdown = driver.findElement(By.xpath("//select[@id='documentType']"));
        documentDropdown.click();
        Select selectDocumentDropdown = new Select(documentDropdown);
        selectDocumentDropdown.selectByVisibleText("Aadhar Card");

        Thread.sleep(1000);
       //Investment Amount
        String addInvestmentAmount = workbook.getSheet("Investor_Onboarding").getRow(1).getCell(3).getStringCellValue();
        driver.findElement(By.xpath("//input[@id='investmentAmount']")).sendKeys(addInvestmentAmount);

        Thread.sleep(1000);

        //Investment Type Dropdown
        WebElement investmentTypeDropdown = driver.findElement(By.xpath("//select[@id='investmentType']"));
        investmentTypeDropdown.click();
        Select selectInvestmentDropdown = new Select(investmentTypeDropdown);
        selectInvestmentDropdown.selectByVisibleText("Debt");

        Thread.sleep(1000);
        //Preferred Sectors Dropdown
        WebElement sectorDropdown = driver.findElement(By.xpath("//select[@id='preferredSectors']"));
        sectorDropdown.click();
        Select selectSectorDropdown = new Select(sectorDropdown);
        selectSectorDropdown.selectByIndex(2);
        selectSectorDropdown.selectByIndex(3);

        //Submit Button
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        Thread.sleep(1000);
        //Confirmation
        Thread.sleep(1000);
        WebElement proceedBtn = driver.findElement(By.xpath("//button[text()='Proceed']"));
        proceedBtn.click();

        //Switch to Alert
        Thread.sleep(1000);
        Alert confirmation= driver.switchTo().alert();
        confirmation.accept();

    }
}
