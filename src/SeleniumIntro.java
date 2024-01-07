import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumIntro {

	public static void main(String[] args) throws InterruptedException {
      
		// Invoke the Browser - Chrome Browser (Chrome Driver)
		// C:\Users\rathanr\Documents\chromedriver_win32\\chromedriver.exe    ----- 
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://rahulshettyacademy.com/locatorspractice/");
		d.findElement(By.id("inputUsername")).sendKeys("Rathan");
		d.findElement(By.name("inputPassword")).sendKeys("231299");
		d.findElement(By.className("signInBtn")).click();
		System.out.println(d.findElement(By.cssSelector("p.error")).getText());
		d.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//form/input[1]")).sendKeys("RathanRajiv"); //Parent-Child Tag Xpath //form/input[1]
		d.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("abc1@gmail.com"); // Here using Index we have selected the xpath which has common values
		d.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("9541256320");
		d.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(d.findElement(By.xpath("//form/p")).getText()); // Parent-Child Tag Xpath //form/p
		//System.out.println(d.findElement(By.cssSelector("form p")).getText());  //Parent-Child Tag CSS Selector
		//d.findElement(By.cssSelector("input[type*='pass']")).click();
		d.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(2000);
		d.findElement(By.id("inputUsername")).sendKeys("Rathan");
		d.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		d.findElement(By.id("chkboxOne")).click();
		d.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
		
		
		
	}

}
