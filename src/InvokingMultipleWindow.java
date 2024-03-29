import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokingMultipleWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64_V123.0.2420.53\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB); // If need to open new window instead of Tab just mention as WINDOW instead of TAB
		Set<String> window = driver.getWindowHandles();//[parentID, childID, subChildID]
		Iterator<String> It = window.iterator();
		String parentID = It.next();
		String childID = It.next();
		driver.switchTo().window(childID);
		driver.get("https://courses.rahulshettyacademy.com/courses/");
		String course = driver.findElements(By.cssSelector("div[class='course-listing-title']")).get(0).getText();
		System.out.println(course);
		driver.switchTo().window(parentID);
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(course);
		
	}
	
}
	



