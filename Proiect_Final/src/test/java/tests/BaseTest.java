package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import utils.BrowserUtils;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    ChromeOptions chromeOptions = new ChromeOptions();

    protected String url = "https://www.demoblaze.com/";

    public void getBrowser(String browserName){
        driver = BrowserUtils.setUpBrowser(browserName);
    }

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\SCOALAIT\\AutomationProject\\Proiect_Final\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofMillis(15000)); // Initialize WebDriverWait
    }
    public  void  closeBrowserAtEnd(){
            if (driver!= null) {
        System.out.println(" Browser was closed");
        driver.quit();
    }
}
    public void tearDown() {
        driver.quit();
    }
    @AfterTest
    public void cleanUpAfterTest(){
        closeBrowserAtEnd();
    }

    public static void escWindow() throws InterruptedException {
        Robot robot = null;
        try {
            robot = new Robot();
        }catch (AWTException e){
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(5000);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }
}
