import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NewWindowOpening {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); //Limiting the scope of the driver to Footer
		System.out.println(footerdriver.findElements(By.tagName("a")).size()); //This is used to find the Links only in the Footer
		
		WebElement column1driver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]//ul")); //Limiting the scope of the driver to Footer column 1 (Discount coupon)
		System.out.println(column1driver.findElements(By.tagName("a")).size()); // This is used to find the Links only in the Footer column 1 (Discount coupon)
		
		
		//The below will be used to open the each links in new Tabs
		for(int i=1;i<column1driver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			column1driver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
		}
			Set<String> windowHandles = driver.getWindowHandles();
			Iterator<String> it = windowHandles.iterator();
			
			while(it.hasNext()) //hasNext() tells wheather next index is there are not
			{
				driver.switchTo().window(it.next()); //next() will automatically move us to the next Tab
				System.out.println(driver.getTitle());
			}
		}



	}


