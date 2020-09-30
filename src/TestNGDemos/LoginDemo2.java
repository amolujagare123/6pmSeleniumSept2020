package TestNGDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginDemo2 {

    WebDriver driver;

    @BeforeClass
    public  void mymethod1()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public  void mymethod2() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }


    @Test
    public void logintest1()
    {

        driver.get("https://stock.scriptinglogic.net");

        WebElement txtUser = driver.findElement(By.id("login-username"));

        txtUser.sendKeys("admin");

        WebElement txtpassword = driver.findElement(By.id("login-password"));
        txtpassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));

       // btnLogin.click();


    }

    @Test
    public void logintest2()
    {


        driver.get("https://stock.scriptinglogic.net");

        WebElement txtUser = driver.findElement(By.id("login-username"));

        txtUser.sendKeys("fdfdf");

        WebElement txtpassword = driver.findElement(By.id("login-password"));
        txtpassword.sendKeys("dfdf");

        WebElement btnLogin = driver.findElement(By.name("submit"));

       // btnLogin.click();


    }
    @Test
    public void logintest3()
    {


        driver.get("https://stock.scriptinglogic.net");

        WebElement txtUser = driver.findElement(By.id("login-username"));

        txtUser.sendKeys("");

        WebElement txtpassword = driver.findElement(By.id("login-password"));
        txtpassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));

       // btnLogin.click();


    }

}
