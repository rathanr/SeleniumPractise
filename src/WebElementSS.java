import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementSS {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\rathanr\\\\Documents\\\\Drivers\\\\edgedriver_win64_V123.0.2420.53\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		String username = driver.findElement(By.xpath("//i[text()='rahulshettyacademy']")).getText();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		String password = driver.findElement(By.xpath("//i[text()='learning']")).getText();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		// Taking SS only the particular WeElement
		WebElement form = driver.findElement(By.xpath("//form[@id='login-form']"));
		File file = form.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("Entercredentials.png"));
		
		// Getting Height & Width of the WebElement
		System.out.println(form.getRect().getDimension().getHeight());
		System.out.println(form.getRect().getDimension().getWidth());

	}

}
