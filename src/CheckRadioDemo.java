import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckRadioDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/PC/Desktop/Mywebsite/amol.html");

        WebElement checkJava = driver.findElement(By.id("check0"));
        WebElement checkSelenium = driver.findElement(By.id("check1"));
        WebElement checkCucumber = driver.findElement(By.id("check2"));


        WebElement radJava = driver.findElement(By.id("rad0"));
        WebElement radSelenium = driver.findElement(By.id("rad1"));
        WebElement radCucumber = driver.findElement(By.id("rad2"));

        checkJava.click();
        checkCucumber.click();
        radSelenium.click();

          // isSelected() - return true if the object is selected
          // it returns false if object is not selected

        System.out.println("CheckBox Java ="+checkJava.isSelected()); // true
        System.out.println("CheckBox Selenium ="+checkSelenium.isSelected());// false
        System.out.println("CheckBox Cucumber ="+checkCucumber.isSelected());//true

        System.out.println("Radio button Java ="+radJava.isSelected());// false
        System.out.println("Radio button Selecium ="+radSelenium.isSelected());//true
        System.out.println("Radio button Cucumber ="+radCucumber.isSelected());// false


        checkCucumber.isDisplayed();
        // it returns true if the web element is displayed on the page
        // if element is not on the page then it throws no such element exception

        checkCucumber.isEnabled();
        // it returns true if the web element is enabled (interactable)
        // it returns false if the web element is disabled (not interactable)

    }
}
