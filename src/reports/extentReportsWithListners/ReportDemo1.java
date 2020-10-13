package reports.extentReportsWithListners;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reports.Util.BrowserOperation;

public class ReportDemo1  extends BrowserOperation {



    @Test
    public void amazonSite()
    {


        driver.get("https://www.amazon.in");



    }

    @Test
    public  void facebookSite()
    {



        driver.get("https://facebook.com");



    }

    @Test
    public  void gmailSite()
    {



        driver.get("https://gmail.com");

        Assert.assertEquals(true,false,"this is not gmail site");



    }

}
