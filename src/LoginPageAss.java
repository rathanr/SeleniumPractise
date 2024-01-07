import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPageAss {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://rahulshettyacademy.com/loginpagePractise/");
		//String[] Mobile = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};
		d.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		d.findElement(By.id("password")).sendKeys("learning");
		d.findElement(By.xpath("//input[@value='user']")).click();
		Thread.sleep(2000);
		d.findElement(By.id("okayBtn")).click();
		//static dropdown
		WebElement staticdropdown = d.findElement(By.xpath("//select[@class='form-control']"));
		Select drop = new Select(staticdropdown);
		drop.selectByVisibleText("Teacher");
		d.findElement(By.id("signInBtn")).click();
		Thread.sleep(4000);
		//Converting the products to Array
		List<WebElement> products = d.findElements(By.xpath("h4.card-title"));
		//Adding the product to cart
		for(int i=0;i<products.size();i++)
		{
			//products.get(i).click();
			String name = products.get(i).getText();
			if(name.contains("iphone X"))
			{
				//click on Add to cart
				d.findElements(By.xpath("//app-card-list[@class='row']//button[@class='btn btn-info']")).get(i).click();
				break;
			}
		}
		


	}
	
}
