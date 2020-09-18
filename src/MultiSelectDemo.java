import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("file:///C:/Users/PC/Desktop/Mywebsite/amol.html");

         WebElement multiSelecct = driver.findElement(By.id("multiSel"));

        Select  selMultiSelect = new Select(multiSelecct) ;

        selMultiSelect.selectByIndex(0);
        selMultiSelect.selectByIndex(1);
        selMultiSelect.selectByIndex(2);
        selMultiSelect.selectByVisibleText("text 4");

        Thread.sleep(3000);

        selMultiSelect.deselectByIndex(1);

        Thread.sleep(3000);

        selMultiSelect.deselectAll();

    }
}
