import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;


public class CorrectPassword {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://rahulshettyacademy.com/locatorspractice/");
		d.findElement(By.id("inputUsername")).sendKeys("Rathan");
		d.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		d.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(d.findElement(By.tagName("p")).getText());
		Assert.assertEquals(d.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		System.out.println(d.findElement(By.cssSelector("h2")).getText());
		Assert.assertEquals(d.findElement(By.cssSelector("h2")).getText(), "Hello Rathan,");

	}

}
