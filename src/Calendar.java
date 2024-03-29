import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Calendar {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.path2usa.com/travel-companion/");
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0, 1000)"); // Window scroll
		d.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		
		// Clicking on specific Date on the current Month   10-Feb-2024
		
		List<WebElement> dates = d.findElements(By.className("flatpickr-day"));
		
		int count = d.findElements(By.className("flatpickr-day")).size();
		
		for(int i=0;i<count;i++)
		{
			String text = d.findElements(By.className("flatpickr-day")).get(i).getText();
			if(text.equalsIgnoreCase("10"))
			{
				d.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
		}


	}

}
