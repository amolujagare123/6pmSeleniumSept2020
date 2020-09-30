package cssselectorDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/s?k=amarendra+chitale&ref=nb_sb_noss_1");

        // click on the NLP book

        driver.findElement(By.cssSelector("img[alt='NLP: Life Transforming Neuro-Magical Stories']")).click();





    }
    }
