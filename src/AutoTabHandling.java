import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoTabHandling {

	public static void main(String[] args) {
		
		//Here while clicking on  WebElement as per the design of the element it is automatically opening that element into a new Tab
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\rathanr\\\\Documents\\\\Drivers\\\\edgedriver_win64_V123.0.2420.53\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window = driver.getWindowHandles();//[parentID, childID, subChildID]
		Iterator<String> It = window.iterator();
		String parentID = It.next();
		String childID = It.next();
		//Switching to the newly opened Tab to get the UserName
		driver.switchTo().window(childID);
		//This is directly taking the highlighted UserName in the whole sentence
		String getUserName = driver.findElement(By.xpath("//a[text()='mentor@rahulshettyacademy.com']")).getText();
		//This will close the newly opened Tab
		driver.close();
		System.out.println(getUserName);
		//Switched to Original Tab & pasting the username got from the newly opened Tab
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(getUserName);
		

	}

}
