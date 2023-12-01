import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigate {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver dr = new EdgeDriver();
		dr.manage().window().maximize(); // This will maximize the browser
		dr.get("https://www.google.com/");
		dr.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");// Navigate to Rahulshettyacademy.com from google
		dr.navigate().back(); // This will take back to google by clicking the Top left corner Back arrow button
		dr.navigate().forward(); // This will take again to rahlshettyacademy.com by clicking on the forward arrow button on the top left corner
		

	}

}
