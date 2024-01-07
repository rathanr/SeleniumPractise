package e2eTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Test03 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver dry = new EdgeDriver();
		dry.manage().window().maximize();
		dry.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		dry.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		dry.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		dry.findElement(By.xpath("//a[@value=\"MAA\"]")).click();
		Thread.sleep(2000);
		dry.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[@value=\"PNQ\"]")).click();
		dry.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		dry.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		WebElement element = dry.findElement(By.id("Div1"));
		boolean elementText = element.getAttribute("style").contains("0.5");
		if(elementText) 
		{
			
			System.out.println("It's Disabled");
		}
		else
		{
			throw new AssertionError("Assertion failed: Return Date is Enabled");
			//System.out.println("It's Enabled");
		}
		dry.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=1;i<9;i++) {
			dry.findElement(By.id("hrefIncAdt")).click();
		}
		dry.findElement(By.id("btnclosepaxoption")).click();
		WebElement staticdropdown = dry.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select drop = new Select(staticdropdown);
		drop.selectByVisibleText("AED");
		dry.findElement(By.cssSelector("input[value='Search']")).click();

	}

}
