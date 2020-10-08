package AssertsDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginOperation {


    @Test
    public void mylogintest()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://stock.scriptinglogic.net");

        WebElement txtUser = driver.findElement(By.id("login-username"));

        txtUser.sendKeys("admin");

        WebElement txtpassword = driver.findElement(By.id("login-password"));
        txtpassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));

        btnLogin.click();


        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        /*String expected = "POSNIC - Dashboard1";
        String actual = driver.getTitle();
        Assert.assertEquals("wrong page title",expected,actual);*/

       /* String expected = "https://stock.scriptinglogic.net/dashboard.php1";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals("wrong url",expected,actual);*/

       /* String expected = "Dashboard";

        String actual = "";
        try {

            actual =
                    driver.findElement(By.xpath("//a[contains(@class,'dashboard')]")).getText();
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals("wrong Text",expected,actual);*/

        boolean expected = true;

        boolean atual = false;
        try {
             atual = driver.findElement(By.xpath("//a[contains(@class,'logoff')]")).isDisplayed();
        }
        catch(Exception e)
        {

        }
        Assert.assertEquals("Logout button is not displayed",expected,atual);

    }

}
