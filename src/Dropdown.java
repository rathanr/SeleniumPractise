import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Documents\\Drivers\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdropdown = d.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select drop = new Select(staticdropdown);
		drop.selectByIndex(3);
		System.out.println(drop.getFirstSelectedOption().getText());
		drop.selectByVisibleText("AED");
		System.out.println(drop.getFirstSelectedOption().getText());
		drop.selectByValue("INR");
		System.out.println(drop.getFirstSelectedOption().getText());

	}

}