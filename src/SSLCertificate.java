import java.util.Arrays;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SSLCertificate {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		//Handling SSL Certificate issue
		EdgeOptions option = new EdgeOptions();
		option.setAcceptInsecureCerts(true);
		WebDriver dry = new EdgeDriver(option);
		dry.manage().window().maximize();
		dry.get("https://expired.badssl.com/");
		System.out.println(dry.getTitle());
		//Add Arguments to Disable popups & Notification
		option.addArguments("--disable-popup-blocking");
		option.addArguments("--disable-notifications");
	}

}
