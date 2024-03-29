import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// //table[@name='courses']//tbody/tr
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Question 1 Finding the number of rows in the Table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']//tbody/tr"));
		System.out.println(rows.size());
		
		//Question 2 Finding the number of Rows in the Tables
		
		List<WebElement> column = driver.findElements(By.xpath("//table[@name='courses']//tbody/tr/th"));
		System.out.println(column.size());
		
		// Question 3 Printing on the 3rd row of the Table
		
		List<WebElement> print3rdrow = driver.findElements(By.xpath("//table[@name='courses']//tbody/tr[3]/td"));
		
		for(WebElement element: print3rdrow)
		{
			System.out.println(element.getText());
		}
		
		


	}

}
