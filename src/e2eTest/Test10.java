package e2eTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Test10 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver dry = new EdgeDriver();
		dry.manage().window().maximize();
		dry.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		dry.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		dry.findElement(By.xpath("//a[@value=\"MAA\"]")).click();
		Thread.sleep(2000);
		dry.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[@value=\"PNQ\"]")).click();
		dry.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		dry.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		dry.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i = 1;
		while(i<10) 
		{
			dry.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		/*for(int i=1;i<10;i++)
		{
			dry.findElement(By.id("hrefIncAdt")).click();
		}*/
		System.out.println(dry.switchTo().alert().getText());
		dry.switchTo().alert().accept();
		dry.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(dry.findElement(By.id("divpaxinfo")).getText(), "9 Adult");
		System.out.println(dry.findElement(By.id("divpaxinfo")).getText());
		


	}

}
