package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class PlaceOrderTest extends BaseTest{

    //test pentru adaugare in cos 4 produse diferite + purchase
    @Test
    public void placeOrder() {
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
        driver.findElement(By.xpath("//a[@class='nav-link'][1]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Samsung galaxy s6']")));
        driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Add to cart']")));
        driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
        ((JavascriptExecutor) driver).executeScript("window.close();");
        driver.findElement(By.xpath("//a[@class='nav-link'][1]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Nokia lumia 1520']")));
        driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Add to cart']")));
        driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
        ((JavascriptExecutor) driver).executeScript("window.close();");
        driver.findElement(By.xpath("//a[@class='nav-link'][1]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='list-group']/a[3]")));
        driver.findElement(By.xpath("//div[@class='list-group']/a[3]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sony vaio i5']")));
        driver.findElement(By.xpath("//a[text()='Sony vaio i5']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Add to cart']")));
        driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
        ((JavascriptExecutor) driver).executeScript("window.close();");
        driver.findElement(By.xpath("//a[@class='nav-link'][1]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='list-group']/a[4]")));
        driver.findElement(By.xpath("//div[@class='list-group']/a[4]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='ASUS Full HD']")));
        driver.findElement(By.xpath("//a[text()='ASUS Full HD']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Add to cart']")));
        driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
        ((JavascriptExecutor) driver).executeScript("window.close();");
        driver.findElement(By.xpath("//a[@class='nav-link'][1]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='cartur']")));
        driver.findElement(By.xpath("//a[@id='cartur']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-success']")));
        driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']")));
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Test name");
        driver.findElement(By.xpath("//input[@id='country']")).sendKeys("Test country");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Test city");
        driver.findElement(By.xpath("//input[@id='card']")).sendKeys("Test credit card");
        driver.findElement(By.xpath("//input[@id='month']")).sendKeys("May");
        driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2024");
        driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Thank you for your purchase!']")));
        String purchase = driver.findElement(By.xpath("//h2[text()='Thank you for your purchase!']")).getText();
        Assert.assertTrue("Purchase failed", purchase.contains("Thank you for your purchase!"));
        driver.findElement(By.xpath("//button[text()='OK']")).click();
    }
}
