import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountButtons {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://scriptinglogic.org");

        List<WebElement> buttonList = driver.findElements(By.className("elementor-button-text"));

        System.out.println(buttonList.size());

        for(int i=0;i<buttonList.size();i++)
        {
            System.out.println(buttonList.get(i).getText());
        }


    }
}
