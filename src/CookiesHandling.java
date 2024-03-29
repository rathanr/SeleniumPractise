import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class CookiesHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		EdgeOptions option = new EdgeOptions();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize(); // Maximize the browser
      //  driver.manage().window().minimize(); // Minimize the browser
      //  driver.manage().deleteCookieNamed("_clck"); // Delete the Particular cookies by its name
        driver.manage().deleteAllCookies();  // Delete All the cookies
        driver.get("https://www.youtube.com/");

	}

}
