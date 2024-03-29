import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		
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
		driver.switchTo().window(childID);
		
		//This is directly taking the highlighted UserName in the whole sentence
		String getpassword = driver.findElement(By.xpath("//a[text()='mentor@rahulshettyacademy.com']")).getText();
		System.out.println(getpassword);
		
		/*
		//Below code is using split on the whole sentence
		String RedHighlighted = driver.findElement(By.cssSelector(".im-para.red")).getText();
		String[] Username = RedHighlighted.split("at");
		//1st Index = Please email us at
		//2nd Index = mentor@rahulshettyacademy.com with below template to receive response
		String[] User = Username[1].split("with");
		//0th Index = mentor@rahulshettyacademy.com
		//1st Index = below template to receive response
		String FinalUsername = User[0].trim(); //Here trim will trim all the white spaces
		System.out.println(FinalUsername);
		*/
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(getpassword);
		

	}

}
