import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class SpicejetPractise {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver dry = new EdgeDriver();
		dry.manage().window().maximize();
		dry.get("https://www.spicejet.com/");
		//div[text()='Family & Friends']
		Assert.assertFalse(dry.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		System.out.println(dry.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		dry.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
		Thread.sleep(3000);
		Assert.assertTrue(dry.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		System.out.println(dry.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		//System.out.println(dry.findElements(By.cssSelector("circle[stroke-width=\"2\"]")).size());
		

	}

}
