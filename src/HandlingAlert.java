import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingAlert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		d.findElement(By.id("name")).sendKeys("Rathan");
		d.findElement(By.id("alertbtn")).click();
		System.out.println(d.switchTo().alert().getText());
		d.switchTo().alert().accept();
		d.findElement(By.id("name")).sendKeys("Rathan");
		d.findElement(By.id("alertbtn")).click();
		System.out.println(d.switchTo().alert().getText());
		d.switchTo().alert().dismiss();


	}

}
