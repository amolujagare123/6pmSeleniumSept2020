package reports;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demoScreenshot {

    @Test
    public void mytets() throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://scriptinglogic.com");

        TakesScreenshot ts = (TakesScreenshot) driver;

        File scrFile = ts.getScreenshotAs(OutputType.FILE);


       /* Date date = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("_yyyyMMdd_hhmmss");
        String timeStamp = sd.format(date);*/

        String timeStamp =new  SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());

        String img = "image"+timeStamp+".png";

        FileUtils.copyFile(scrFile,new File("D:\\pallavi\\"+img));

    }

}
