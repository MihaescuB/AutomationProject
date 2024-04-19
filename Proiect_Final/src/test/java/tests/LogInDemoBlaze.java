package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class LogInDemoBlaze extends BaseTest{

    //sign in
    @Test
    public void logInDemoBlaze(){
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='login2']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='loginusername']")));
        driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("Legion");
        driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("Password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Welcome Legion']")));
        String text = driver.findElement(By.xpath("//a[text()='Welcome Legion']")).getText();
        Assert.assertTrue("Log in failed", text.contains("Welcome Legion"));
    }
}
