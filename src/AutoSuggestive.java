import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Documents\\Drivers\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.findElement(By.id("autosuggest")).sendKeys("IND");
		Thread.sleep(2000);
		List<WebElement>options = (List<WebElement>) d.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
		for(WebElement option :options) 
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		

	}

}
