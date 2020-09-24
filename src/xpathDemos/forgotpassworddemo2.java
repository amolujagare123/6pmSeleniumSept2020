package xpathDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forgotpassworddemo2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://billing.scriptinglogic.net");

      //  driver.findElement(By.xpath("//a[normalize-space()='I forgot my password']")).click();




        driver.findElement(By.xpath("//a[contains(text(),'forgot')]")).click();
    }
}
