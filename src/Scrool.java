import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Scrool {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500)"); // Window scroll
		js.executeScript("document.querySelector('.tableFixHead').scroll(0, 500)"); // Particular Element Scroll
		
		List<WebElement> Amounts = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int Sum = 0;
		
		for(int i=0; i<Amounts.size(); i++)
		{
			Sum = Sum + Integer.parseInt(Amounts.get(i).getText());
			
		}
		
		System.out.println(Sum);
		
		String TotalAmount = driver.findElement(By.cssSelector(".totalAmount")).getText();
		
		String[] Splitted = TotalAmount.split(":");
		
		String Final = Splitted[1].trim();
		
		//Converting the String 296 to Integer value
		int total = Integer.parseInt(Final);
		
		Assert.assertEquals(Sum, total);
		


	}

}
