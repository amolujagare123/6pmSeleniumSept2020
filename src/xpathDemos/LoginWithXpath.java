package xpathDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginWithXpath {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net");

      /*  driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type='submit']")).click();*/

        driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();


    }
}
