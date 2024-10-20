package drivers;


//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;
    //Driver controller
    private static WebDriver driverController;
    protected WebDriverWait wait;
    // Get the current date and time
    protected LocalDateTime currentTime = LocalDateTime.now();
    // Define a custom date-time format
    protected DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
    //Use this for test data generation

    public BaseTest() {
        //The controller makes sure we using the same driver window through out the tests
        if (driverController == null){
            // Set the path to the ChromeDriver executable
            WebDriverManager.chromedriver().setup();

            // Initialize ChromeDriver
            driver = new ChromeDriver();
            driverController = driver;

            //Driver properties
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }else{
            driver= driverController;
        }
    }

    @AfterTest
    public void tearDown() {
        //Kill driver window
        driver.quit();
        driverController = null;
    }
    public void waitUntilElementIsVisible(WebElement element) {
        // Explicitly wait for an element to be visible
        wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(element));
        WebElement test2 = wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void switchFrame() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
    public int generateRandomNumber(){
        Random random = new Random();
        // Generate a random number
        int min = 10000000;
        int max = 99999999;
        return random.nextInt(max - min + 1) + min;
    }
}