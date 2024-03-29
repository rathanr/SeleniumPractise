import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GrrekartAddMultipleProductstocart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		//List of product need to be added inside Cart
		String[] Vegetables = {"Brocolli", "Cauliflower", "Cucumber", "Beetroot", "Carrot", "Tomato", "Onion", "Banana"};
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size(); i++)
		{
			int j=0;
			//Getting the name Text of all the products
			String[] names = products.get(i).getText().split("-");
			String FormattedName = names[0].trim();
			System.out.println(names);
			//converting Array to ArrayList
			List VegetablesNeeded = Arrays.asList(Vegetables);
			if(VegetablesNeeded.contains(FormattedName))
			{
				j++;
				System.out.println(driver.findElements(By.xpath("//div[@class='products']//button")));
				driver.findElements(By.xpath("//div[@class='products']//button")).get(i).click();
				
				if(j==Vegetables.length)
				{
					break;
				}
				
				
			}
		}
		

	}

}
