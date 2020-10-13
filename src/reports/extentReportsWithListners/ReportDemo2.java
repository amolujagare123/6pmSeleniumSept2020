package reports.extentReportsWithListners;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reports.Util.BrowserOperation;

public class ReportDemo2 extends BrowserOperation {



    @Test
    public void scriptingLogic()
    {

        driver.get("https://scriptinglogic.com");

    }

    @Test
    public  void stackOverflow()
    {


        driver.get("https://stackoverflow.com");



    }

    @Test
    public  void quora()
    {

        driver.get("https://quora.com");

    }

}
