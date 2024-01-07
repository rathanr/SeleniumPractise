import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonAddToCart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//List of Mobile need to be added inside Cart
		//String[] Mobiles = {"Redmi 13C 5G", "Nokia C32", "realme narzo 50i", "realme narzo N53"};
		//Thread.sleep(10000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		System.out.println("Mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> products = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		//Clicking on only 1 product
		
		/*for(int i=0;i<products.size();i++)
		{
			String name = products.get(i).getText();
			if(name.contains("narzo 50i Prime (Mint Green 4GB RAM+64GB Storage) Octa-core Processor |5000 mAh Battery"))
			{
				driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
				break;
			}
		}*/
		
		//Clicking on Multiple product
		
		for(int i=0;i<products.size();i++)
		{
			String names = products.get(i).getText();
			//List of Mobile need to be added inside Cart
			String[] Mobiles = {"iPhone 15 (128 GB) - Black", "narzo 50i Prime (Mint Green 4GB RAM+64GB Storage) Octa-core Processor |5000 mAh Battery", "A2 (Sea Green, 2GB RAM, 64GB Storage)", "13C 5G (Startrail Green,6GB RAM, 128GB Storage) | MediaTek Dimensity 6100+ 5G | 90Hz Display"};
			//converting Array to ArrayList
			List MobileNeeded = Arrays.asList(Mobiles);
			if(MobileNeeded.contains(names))
			{
				driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
			}
		}
		

	}

}
