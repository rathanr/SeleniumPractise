import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertEquals(d.findElement(By.id("divpaxinfo")).getText(), "1 Adult");
		System.out.println(d.findElement(By.id("divpaxinfo")).getText());
		d.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		int i = 1;
		while(i < 9) {
			d.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		/*for(int i=1;i<9;i++) {
			
			d.findElement(By.id("hrefIncAdt")).click();
		}*/
		d.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(d.findElement(By.id("divpaxinfo")).getText(), "9 Adult");
		System.out.println(d.findElement(By.id("divpaxinfo")).getText());

	}

}
