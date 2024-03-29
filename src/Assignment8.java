import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver dry = new EdgeDriver();
		dry.manage().window().maximize();
		dry.get("https://rahulshettyacademy.com/AutomationPractice/");
		dry.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("IND");
		Thread.sleep(1000);
		List<WebElement> values = dry.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
		for(WebElement value: values)
		{
			if(value.getText().equalsIgnoreCase("India"))
			{
				value.click();
				break;
			}
		}


	}

}
