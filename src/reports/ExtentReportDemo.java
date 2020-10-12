package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static reports.Util.Screenhot.takescreenShot;

public class ExtentReportDemo {

    ExtentReports extent;

    @BeforeClass
    public void init()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports\\report.html");

        reporter.config().setDocumentTitle("My Project name");
        reporter.config().setReportName("All regression tests");


        extent = new ExtentReports();
        extent.attachReporter(reporter);

        extent.setSystemInfo("Company Name","Scripting Logic");
        extent.setSystemInfo("Project Name","HRM");
        extent.setSystemInfo("Testers Name","Amol ujagare");
        extent.setSystemInfo("Test Lead","xyz");

    }



    @Test
    public void mytets1() throws IOException {

        ExtentTest test = extent.createTest("scriptingOpen");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("browser is opened");

        driver.manage().window().maximize();

        test.info("browser is maximized");

        driver.get("http://scriptinglogic.com");

        test.info("scripting logic  is opened");



        try {

            Assert.assertEquals(driver.getTitle(),
                    "Tutorials website",
                    "This is not a tutorials website");
            test.pass("We are on Scripting logic");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
        }

        extent.flush();

    }

    @Test
    public void mytets2() throws IOException {

        ExtentTest test = extent.createTest("facebookOpen");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        test.info("browser is opened");

        driver.manage().window().maximize();

        test.info("browser is maximized");

        driver.get("http://facebook.com");

        test.info("facebook  is opened");


        try {

            Assert.assertEquals(driver.getTitle(),
                    "Facebook – log in or sign up 1",
                    "This is not a facebook website");
            test.pass("We are on Facebook");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+takescreenShot(driver));
        }

        extent.flush();

    }

    @Test
    public void mytets3() throws IOException {

        ExtentTest test = extent.createTest("gmailOpen");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        test.info("browser is opened");

        driver.manage().window().maximize();

        test.info("browser is maximized");

        driver.get("http://gmail.com");

        test.info("gmail  is opened");
        try {

            Assert.assertEquals(driver.getTitle(),
                    "Gmail",
                    "This is not a Gmail website");
            test.pass("We are on gmail");
        }
        catch (AssertionError e)
        {
          test.fail(e.getMessage());
        }

        extent.flush();

    }

}
