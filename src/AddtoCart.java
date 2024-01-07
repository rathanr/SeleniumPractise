import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		String[] vegetables = {"Cucumber", "Beetroot", "Carrot", "Tomato"}; //Declaring Array of vegetable to be added in cart
		addItems(driver,vegetables );
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	}
	
	public static void addItems(WebDriver driver,String[] vegetables )
	{
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		//Only single item is added to cart
		/*for(int i=0;i<products.size();i++)
		{
			String name = products.get(i).getText();
			if(name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}*/
		
		//Number of Items is added to cart using Array
		for(int i=0;i<products.size();i++) 
		{
			//Split the Name from - 1 kg
			//Tomato - 1 Kg (Tomato)( - 1 Kg)
			String[] name = products.get(i).getText().split("-");
			String Formattedname = name[0].trim();
			
			//Converting of Array to Array list
			List VegetableArray = Arrays.asList(vegetables);
			
			//Clicking on 1 product
			if(VegetableArray.contains(Formattedname))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='products']//button")).get(i).click();
				
				
				if(j==vegetables.length)
				{
					break;
				}
			}
			
		
		}		

}

}
