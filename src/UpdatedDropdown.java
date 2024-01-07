import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		//d.findElement(By.id("hrefIncAdt")).click();
		for(int i=1;i<9;i++) {
			d.findElement(By.id("hrefIncAdt")).click();
		}
		d.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(d.findElement(By.id("divpaxinfo")).getText());

	}

}
