package reports.Util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenhot {

    public static  String takescreenShot(WebDriver driver) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;

        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp =new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());

        String img = "image"+timeStamp+".png";

        FileUtils.copyFile(scrFile,new File("Reports\\screenshots\\"+img));

        return img;
    }
}
