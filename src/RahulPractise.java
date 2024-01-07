import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RahulPractise {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver dry = new EdgeDriver();
		dry.manage().window().maximize();
		dry.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		//div[text()='Family & Friends']
		System.out.println(dry.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		dry.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Thread.sleep(3000);
		System.out.println(dry.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	    System.out.println(dry.findElements(By.cssSelector("circle[stroke-width=\"2\"]")).size());

	}

}
