package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignInTests extends BaseTest{

    //logare doar in pagina cu firefox si chrome
    @DataProvider(name = "positiveLogin")
    public Object[][] dataProviderForPositiveLogin() {
        return new Object[][]{
    //  username | password | browserName
                {"chrome"},{"firefox"}
        };
    }
    @Test(dataProvider = "positiveLogin")
    public void loginPositiveTests(String browserName) {
        System.out.println("Set up next browser:"+browserName);
        getBrowser(browserName);
        driver.get(url);
    }
    @AfterMethod
    public void cleanUp(){
        closeBrowserAtEnd();
    }
}
