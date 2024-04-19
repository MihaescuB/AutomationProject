package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import tests.BaseTest;

public class CartPage extends BaseTest {
    public void deleteItems(){
        while (true) {
            WebElement deleteButton = null;
            try {
                deleteButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Delete']")));
            } catch (Exception e) {
                break;
            }
            deleteButton.click();
            wait.until(ExpectedConditions.stalenessOf(deleteButton));
        }
    }
}
