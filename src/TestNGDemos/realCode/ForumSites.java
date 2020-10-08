package TestNGDemos.realCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForumSites {

    WebDriver driver;

    @BeforeClass // the method written below this annotation will run before first test method of this class
    public  void mymethod1()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass// the method written below this annotation will run after last method of this class
    public  void mymethod2() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void openstackoverflow()  {
        driver.get("https://stackoverflow.com");

    }

    @Test
    public void opensqaforums()  {
        driver.get("https://sqaforums.com/");

    }

    @Test
    public void openquora()  {
        driver.get("https://quora.com");

    }
}
