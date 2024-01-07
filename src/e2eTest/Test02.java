package e2eTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test02 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver dry = new EdgeDriver();
		dry.manage().window().maximize();
		dry.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		dry.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); //This Element is Round Trip check box
		dry.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		dry.findElement(By.xpath("//a[@value=\"MAA\"]")).click();
		Thread.sleep(2000);
		dry.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[@value=\"PNQ\"]")).click();
		dry.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		dry.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		WebElement element = dry.findElement(By.id("Div1"));
		boolean elementText = element.getAttribute("style").contains("1");
		if(elementText) 
		{
			
			System.out.println("It's Enabled");
		}
		else
		{
			throw new AssertionError("Assertion failed: Return Date is Disabled");
			//System.out.println("It's Disabled");
		}


	}

}
