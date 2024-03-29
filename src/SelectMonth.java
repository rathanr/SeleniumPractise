import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectMonth {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.path2usa.com/travel-companion/");
		WebElement element = driver.findElement(By.id("form-field-travel_comp_date"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		while(!driver.findElement(By.xpath("//div[@class='flatpickr-current-month']")).getText().contains("August")) 
		{
			driver.findElement(By.className("flatpickr-next-month")).click();
		}
		
		// Clicking on specific Date on the Month selected above "August"
		
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		
		int count = driver.findElements(By.className("flatpickr-day")).size();
		
		for(int i=0;i<count;i++)
		{
			String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if(text.equalsIgnoreCase("20"))
			{
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
		}


	}

}
