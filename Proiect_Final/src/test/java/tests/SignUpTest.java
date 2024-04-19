package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.Random;

public class SignUpTest extends BaseTest{

    //metoda care genereaza random un username pentru ca nu putem sa folosim mereu acelasi user la sign up
    public static String generateRandomUsername(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
        StringBuilder username = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            username.append(characters.charAt(index));
        }
        return username.toString();
    }
    @Test
    public void signUpTest() {
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='signin2']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='sign-username']")));
        String username = generateRandomUsername(10);
        driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("Password");
        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
    }
    @AfterMethod
    public void cleanUp(){
        closeBrowserAtEnd();
    }
}
