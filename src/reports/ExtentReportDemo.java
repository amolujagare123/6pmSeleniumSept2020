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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        extent.setSystemInfo("Teast Lead","xyz");

    }



    @Test
    public void mytets() throws IOException {

        ExtentTest test = extent.createTest("Mytest1");


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("browser is opened");


        driver.manage().window().maximize();
        test.info("browser is maximized");

        driver.get("http://scriptinglogic.com");

        test.info("url is opened");


        extent.flush();

    }

}
