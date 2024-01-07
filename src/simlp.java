import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class simlp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.simplilearn.com/");
		// Maximize the browser window
        driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".login")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("rathanrajivs@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Rathan@208");
		driver.findElement(By.cssSelector(".btn.btn-default.btn-signup")).click();
		//driver.findElements(By.xpath("//div[@title='ATE Phase - 2: Functional Testing']")).click();

	}

}
