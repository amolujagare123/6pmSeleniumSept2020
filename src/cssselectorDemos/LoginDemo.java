package cssselectorDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://stock.scriptinglogic.net");

        WebElement txtUser = driver.findElement(By.cssSelector("input#login-username"));

        txtUser.sendKeys("admin");

        WebElement txtpassword = driver.findElement(By.cssSelector("input#login-password"));
        txtpassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.cssSelector("input.button"));

        btnLogin.click();
    }

}
