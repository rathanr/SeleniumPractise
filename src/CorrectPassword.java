import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;


public class CorrectPassword {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		CorrectPassword obj = new CorrectPassword();
		String password = obj.getPassword(d);
		d.get("https://rahulshettyacademy.com/locatorspractice/");
		obj.getPassword(d);
		d.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		d.findElement(By.id("inputUsername")).sendKeys("Rathan");
		d.findElement(By.name("inputPassword")).sendKeys(password); // Here instead of writing the password we're calling it by creating a method which copy paste the password here
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(2000);
		System.out.println(d.findElement(By.tagName("p")).getText());
		Assert.assertEquals(d.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		System.out.println(d.findElement(By.cssSelector("h2")).getText());
		Assert.assertEquals(d.findElement(By.cssSelector("h2")).getText(), "Hello Rathan,");
		d.findElement(By.xpath("//button[text()='Log Out']")).click();

	}
public String getPassword(WebDriver d) throws InterruptedException {
	
	d.get("https://rahulshettyacademy.com/locatorspractice/");
	d.findElement(By.xpath("//div[@class='forgot-pwd-container']")).click();
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
	//d.findElement(By.xpath("//p[@class='infoMsg']")).getText();
	String Infomsg = d.findElement(By.xpath("//p[@class='infoMsg']")).getText();
	//Please use temporary password 'rahulshettyacademy' to Login.
	String[] PassordArray = Infomsg.split("'");
	//0th Index - [Please use temporary password] which is before the ' will be stored
	//1st Index - [rahulshettyacademy' to Login.] which is after the ' will be stored
	String[] Password = PassordArray[1].split("'");
	//0th Index - [rahulshettyacademy] which is before the ' will be stored
	//1st Index - [ to Login.] which is after the ' will be stored
	String Final = Password[0];
	return Final;
	
}
}
