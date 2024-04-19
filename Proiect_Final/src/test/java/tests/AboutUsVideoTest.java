package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class AboutUsVideoTest extends BaseTest{

    @Test
    public void aboutUsVideoTest() {
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@data-target='#videoModal']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='example-video']")));
        WebElement element = driver.findElement(By.xpath("//div[@id='example-video']"));
        Assert.assertTrue("Video is not present in the page", element!=null);
        driver.findElement(By.xpath("//div[@id='example-video']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-valuetext='00:06 of 18:40']")));
        WebElement videoElement = driver.findElement(By.xpath("//div[@id='example-video']"));
        if (videoElement != null) {
            // Check if the video is playing
            boolean isPlaying = isVideoPlaying(videoElement);
            if (isPlaying) {
                System.out.println("Video is playing.");
            } else {
                System.out.println("Video is not playing.");
            }
        } else {
            System.out.println("Video element not found.");
        }
        driver.quit();
    }
    public static boolean isVideoPlaying(WebElement videoElement) {
        return !Boolean.parseBoolean(videoElement.getAttribute("paused"));
    }
}