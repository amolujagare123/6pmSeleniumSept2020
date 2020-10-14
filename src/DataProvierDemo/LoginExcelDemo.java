package DataProvierDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginExcelDemo {
    @Test(dataProvider = "getData")
    public void logintest(String username, String password) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://stock.scriptinglogic.net");

        WebElement txtUser = driver.findElement(By.id("login-username"));

        txtUser.sendKeys(username);

        WebElement txtpassword = driver.findElement(By.id("login-password"));
        txtpassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.name("submit"));

        Thread.sleep(3000);

        btnLogin.click();
        driver.close();

    }

    @DataProvider
    public Object[][] getData() throws IOException {

        // 1. read the file in object format

        FileInputStream fp = new FileInputStream("Data\\data.xls");

        // 2. convert the file object into work book
        // (download and add library files from apache poi)

        HSSFWorkbook workbook = new HSSFWorkbook(fp);

        // 3. identify the perticular sheet

        HSSFSheet sheet  =  workbook.getSheet("Sheet1");

        // 4. identify all active rows

        int rowCount = sheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[rowCount][2];

        for(int i=0;i<rowCount;i++)
        {
            HSSFRow row = sheet.getRow(i);

            HSSFCell username = row.getCell(0);
            data[i][0] = username.toString().trim();

            HSSFCell password = row.getCell(1);
            data[i][1] = password.toString().trim();

        }

        return data;

    }
}
