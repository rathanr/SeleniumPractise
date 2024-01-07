import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		d.findElement(By.id("APjFqb")).sendKeys("INDIA");
		Thread.sleep(3000);
		//    //div[@role='presentation']//span[text()='India']
		List<WebElement> options = d.findElements(By.xpath("//div[@role='presentation']//span"));
		
		for(WebElement option : options) 
		{
			if(option.getText().equalsIgnoreCase("INDIA"))
			{
				option.click();
				break;
			}
		}

	}

}
