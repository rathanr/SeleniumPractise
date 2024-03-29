import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Linkcount {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("راثان راجيف سينغ");
		System.out.println(driver.findElements(By.tagName("a")).size()); //This is used to find the Links in the whole webpage
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); //Limiting the scope of the driver to Footer
		System.out.println(footerdriver.findElements(By.tagName("a")).size()); //This is used to find the Links only in the Footer
		
		WebElement column1driver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]//ul")); //Limiting the scope of the driver to Footer column 1 (Discount coupon)
		System.out.println(column1driver.findElements(By.tagName("a")).size()); // This is used to find the Links only in the Footer column 1 (Discount coupon)

   }
	

	
}
