package tests;

import PageObjects.RandomDataGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class ContactTest extends RandomDataGenerator {

    @Test
    public void contactTest(){

        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Contact']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='recipient-email']")));
        driver.findElement(By.xpath("//input[@id='recipient-email']")).sendKeys(generateRandomEmail());
        driver.findElement(By.xpath("//input[@id='recipient-name']")).sendKeys(generateRandomName());
        driver.findElement(By.xpath("//textarea[@id='message-text']")).sendKeys(generateRandomMessage());
        driver.findElement(By.xpath("//button[text()='Send message']")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.quit();
    }
}
