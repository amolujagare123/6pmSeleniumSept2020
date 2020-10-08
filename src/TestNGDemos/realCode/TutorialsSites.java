package TestNGDemos.realCode;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialsSites {
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

    @Test //(priority = 1)
    public void opentutorialspoints()  {


        System.out.println("tutorialspoints (priority = 1)");
        driver.get("https://tutorialspoints.com");
    }

    @Test //(priority = 2)
    public void openScriptingLogic()  {

        System.out.println("ScriptingLogic (priority = 2)");
        driver.get("https://scriptinglogic.com");
    }

    @Test //(priority = 3)
    public void openjavatpointc()  {

        System.out.println("javatpoint (priority = 3)");
        driver.get("https://javatpoint.com");
    }
    @Test //(priority = 4)
    public void openfacebook()  {

        System.out.println("facebook (priority = 4)");
        driver.get("https://facebook.com");
    }

    @Test //(priority = 5)
    public void opentwitter()  {

        System.out.println("twitter (priority = 5)");
        driver.get("https://twitter.com");
    }

    @Test //(priority = 6)
    public void openinstagram()  {

        System.out.println("instagram (priority = 6)");
        driver.get("https://instagram.com");
    }
}
