package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ValidateCategories extends LogInDemoBlaze{

    //Validarea Categoriilor din Pagina principala Home

    @Test
    public void validateCategories(){

        logInDemoBlaze();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Samsung galaxy s6']")));
        String text = driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).getText();
        Assert.assertTrue("Samsung galaxy s6 phone not visible", text.contains("Samsung galaxy s6"));
        String text1 = driver.findElement(By.xpath("//a[text()='Nexus 6']")).getText();
        Assert.assertTrue("Nokia lumia 1520 phone not visible", text1.contains("Nexus 6"));
        String text2 = driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).getText();
        Assert.assertTrue("Nokia lumia 1520 phone not visible", text2.contains("Nokia lumia 1520"));
        driver.findElement(By.xpath("//a[text()='Laptops']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='MacBook air']")));
        String text3 = driver.findElement(By.xpath("//a[text()='Sony vaio i5']")).getText();
        Assert.assertTrue("Sony vaio i5 laptop not visible", text3.contains("Sony vaio i5"));
        String text4 = driver.findElement(By.xpath("//a[text()='MacBook air']")).getText();
        Assert.assertTrue("MacBook air laptop not visible", text4.contains("MacBook air"));
        driver.findElement(By.xpath("//a[text()='Monitors']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Apple monitor 24']")));
        String text5 = driver.findElement(By.xpath("//a[text()='Apple monitor 24']")).getText();
        Assert.assertTrue("Apple monitor 24 monitor not visible", text5.contains("Apple monitor 24"));
        String text6 = driver.findElement(By.xpath("//a[text()='ASUS Full HD']")).getText();
        Assert.assertTrue("ASUS Full HD monitor not visible", text6.contains("ASUS Full HD"));
        driver.findElement(By.xpath("//a[text()='Monitors']")).click();
    }
}
