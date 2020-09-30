package JunitDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrls2 {

    static WebDriver driver;

    @BeforeClass // the method written below this annotation will run before first test method of this class
    public static void mymethod1()
    {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass// the method written below this annotation will run after last method of this class
    public static void mymethod2() throws InterruptedException {
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
