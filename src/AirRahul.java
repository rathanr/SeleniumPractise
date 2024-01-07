
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class AirRahul {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver dry = new EdgeDriver();
		dry.manage().window().maximize();
		dry.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		dry.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		dry.findElement(By.cssSelector("a[value='MAA']")).click();
		Thread.sleep(2000);
		dry.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='GOI']")).click();
		dry.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		System.out.println(dry.findElement(By.id("Div1")).getAttribute("style"));
		System.out.println(dry.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		dry.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(dry.findElement(By.id("Div1")).getAttribute("style"));
		System.out.println(dry.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		if(dry.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("It's Enabled");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("It's Disabled");
			Assert.assertFalse(false);
		}

	}

}
