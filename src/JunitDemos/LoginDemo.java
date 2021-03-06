package JunitDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    @Test
    public void logintest1()
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

        driver.close();
    }

    @Test
    public void logintest2()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://stock.scriptinglogic.net");

        WebElement txtUser = driver.findElement(By.id("login-username"));

        txtUser.sendKeys("fdfdf");

        WebElement txtpassword = driver.findElement(By.id("login-password"));
        txtpassword.sendKeys("dfdf");

        WebElement btnLogin = driver.findElement(By.name("submit"));

        btnLogin.click();

        driver.close();
    }

    @Test
    public void logintest3()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://stock.scriptinglogic.net");

        WebElement txtUser = driver.findElement(By.id("login-username"));

        txtUser.sendKeys("");

        WebElement txtpassword = driver.findElement(By.id("login-password"));
        txtpassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));

        btnLogin.click();

        driver.close();
    }
}
