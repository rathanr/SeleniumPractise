import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Documents\\Drivers\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		// MAA Chennai in From dropdown
		d.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='MAA']")).click();  // Parent-Child Relationship X-path
		Thread.sleep(2000);
		//d.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		// BLR Banglore in To dropdown
		d.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']")).click();  //Parent-Child Relationship X-path
		
	}

}
