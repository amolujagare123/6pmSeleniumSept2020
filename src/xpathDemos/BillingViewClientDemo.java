package xpathDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BillingViewClientDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://billing.scriptinglogic.net");

        WebElement txtUser = driver.findElement(By.id("email"));

        txtUser.sendKeys("amolujagare@gmail.com");

        WebElement txtpassword = driver.findElement(By.id("password"));
        txtpassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.name("btn_login"));

        btnLogin.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//span[text()='Clients']")).click();
        driver.findElement(By.linkText("View Clients")).click();

        String clientName="Alex";

        driver.findElement(By.xpath("//tr[td/a[text()='"+clientName+"']]//div[contains(@class,'btn-group')]")).click();
        driver.findElement(By.xpath("//tr[td/a[text()='"+clientName+"']]//i[contains(@class,'edit')]")).click();

    }
}
