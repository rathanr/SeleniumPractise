import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Traverse {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.findElement(By.xpath("/html/body/header/div[1]/button[1]")).click();
		d.findElement(By.xpath("//div/button[1]/following-sibling::button[1]")).click();  //Parent-Child Traverse & Sibling-Sibling Traverse
		d.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header")).click();  //Child-Parent Traverse
		

	}

}
