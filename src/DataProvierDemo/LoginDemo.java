package DataProvierDemo;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDemo {

    @Test(dataProvider = "getData")
    public void logintest(String username, String password) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://stock.scriptinglogic.net");

        WebElement txtUser = driver.findElement(By.id("login-username"));

        txtUser.sendKeys(username);

        WebElement txtpassword = driver.findElement(By.id("login-password"));
        txtpassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.name("submit"));

        Thread.sleep(3000);

        btnLogin.click();
        driver.close();

    }

    @DataProvider
    public Object[][] getData()
    {

        Object[][] data = new Object[4][2];

        data[0][0] = "admin";
        data[0][1] = "admin";

        data[1][0] = "sdsdsd";
        data[1][1] = "dsddsd";

        data[2][0] = "admin";
        data[2][1] = "rwerer";

        data[3][0] = "";
        data[3][1] = "admin";

        return data;

    }
}
