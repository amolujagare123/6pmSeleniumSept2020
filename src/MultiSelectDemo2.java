import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo2 {

    public static void main(String[] args) {

        //https://www.click.in/pune/classifieds/60/post.html

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        WebElement jobLocation = driver.findElement(By.id("source_118"));

        Select selJobLocation = new Select(jobLocation);

        selJobLocation.selectByVisibleText("Bangalore");
        selJobLocation.selectByVisibleText("Mumbai");
        selJobLocation.selectByVisibleText("Delhi");


    }
}
