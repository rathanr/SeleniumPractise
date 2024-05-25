import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokingWindow {

	public static void main(String[] args) {
		
		//Here we're forcefully opening a new Tab while clicking on a Element we're opening that element in a new Tab
				System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64_V123.0.2420.53\\msedgedriver.exe");
				WebDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://www.rahulshettyacademy.com/angularpractice/");
				driver.switchTo().newWindow(WindowType.WINDOW); // Opening new window
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
