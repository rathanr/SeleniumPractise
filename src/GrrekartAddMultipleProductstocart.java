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
		String[] Vegetables = {"Brocolli - 1 Kg", "Cauliflower - 1 Kg", "Cucumber - 1 Kg", "Beetroot - 1 Kg", "Carrot - 1 Kg", "Tomato - 1 Kg", "Onion - 1 Kg", "Banana - 1 Kg"};
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size(); i++)
		{
			int j=0;
			//Getting the name Text of all the products
			String names = products.get(i).getText();
			//converting Array to ArrayList
			List VegetablesNeeded = Arrays.asList(Vegetables);
			if(VegetablesNeeded.contains(names))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='products']//button")).get(i).click();
				
				if(j==Vegetables.length)
				{
					break;
				}
				
				
			}
		}
		

	}

}
