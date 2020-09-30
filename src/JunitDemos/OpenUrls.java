package JunitDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrls {

    WebDriver driver;

    @Before // the method written below this annotation will run before every test method
    public void mymethod1()
    {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After// the method written below this annotation will run after every test method
    public void mymethod2() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void mytest1()
    {


        driver.get("https://www.amazon.in");



    }

    @Test
    public  void mytest2()
    {



        driver.get("https://facebook.com");



    }

    @Test
    public  void mytest3()
    {



        driver.get("https://gmail.com");



    }



}
