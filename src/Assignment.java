import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		String chk = driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
		System.out.println(chk);
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select drop = new Select(dropdown);
		drop.selectByValue(chk);
		WebElement TextEntered = driver.findElement(By.cssSelector("[name='enter-name']"));
		TextEntered.sendKeys(chk);
		TextEntered.getAttribute("type");
		driver.findElement(By.id("alertbtn")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		String text = a.getText();
		
		if(text.contains(chk))
		{
			System.out.println("Alert Success");
		}
		
		else
		{
			System.out.println("Alert not Matched");
		}
		
		


	}

}
