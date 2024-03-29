import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RLocator {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        
        // Initialize the WebDriver instance
        WebDriver driver = new EdgeDriver();
        
        // Set implicit wait time to handle dynamic page elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Navigate to the webpage
        driver.get("https://www.rahulshettyacademy.com/angularpractice/");
        
        // Find the base element (e.g., below this element we want to locate another element)
        WebElement baseElement = driver.findElement(By.cssSelector("input[name='name']"));
        
        // Use RelativeLocator to find an element above the base element
        WebElement elementAbove = driver.findElement(RelativeLocator.with(By.tagName("label")).above(baseElement));
        
        // Now you can interact with the found element
        System.out.println("Text of element above base element: " + elementAbove.getText());
        
        WebElement baseElement1 = driver.findElement(By.xpath("//label[text()='Email']"));
        
        WebElement elementAbove1 = driver.findElement(RelativeLocator.with(By.cssSelector("input[name='email']")).below(baseElement1));
        
        elementAbove1.sendKeys("rathanrajivs@gmail.com");
       
        WebElement pass = driver.findElement(By.xpath("//input[@id='exampleInputPassword1']"));
        
        WebElement checkbox = driver.findElement(RelativeLocator.with(By.xpath("//label[text()='Check me out if you Love IceCreams!']")).below(pass));
        
        checkbox.click();
        
        WebElement Employedcheck = driver.findElement(By.cssSelector("[id='inlineRadio2']"));
        
        WebElement Studentcheck = driver.findElement(RelativeLocator.with(By.tagName("label")).toLeftOf(Employedcheck));
        
        Studentcheck.click();
        
        
    }
}
