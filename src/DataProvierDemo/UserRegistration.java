package DataProvierDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserRegistration {


    @Test (dataProvider = "getData")
    public void logintest(String name,String email,String phone,String city) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://scriptinglogic.org/request-call-demo-class-online/");

        WebElement txtname = driver.findElement(By.xpath("//input[@placeholder='Name']"));
        txtname.sendKeys(name);

        WebElement txtEmail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        txtEmail.sendKeys(email);


        WebElement txtxContact = driver.findElement(By.xpath("//input[@placeholder='Contact no./ Whatsapp No.']"));
        txtxContact.sendKeys(phone);


        WebElement txtCity = driver.findElement(By.xpath("//input[@placeholder='City']"));
        txtCity.sendKeys(city);

        Thread.sleep(2000);

        driver.close();
    }


    @DataProvider
    public Object[][] getData()
    {
        Object[][] data = {

                {"name1","email1","phone1","city1"},
                {"name2","email2","phone2","city2"},
                {"name3","email3","phone3","city3"},
                {"name4","email4","phone4","city4"},

        };

        return data;
    }
}