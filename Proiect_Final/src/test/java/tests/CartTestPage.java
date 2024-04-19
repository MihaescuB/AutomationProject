package tests;

import PageObjects.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class CartTestPage extends CartPage {

    @Test
    public void deleteFromCart(){
        driver.get(url);
        driver.manage().window().maximize();
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
        driver.findElement(By.xpath("//a[text()='Cart']")).click();
        deleteItems();
    }
}
