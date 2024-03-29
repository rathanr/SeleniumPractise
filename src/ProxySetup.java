import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class ProxySetup {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		EdgeOptions option = new EdgeOptions();
		//Setting up the proxy
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:port");
		option.setCapability("proxy", proxy);
		WebDriver dry = new EdgeDriver(option);
		dry.manage().window().maximize();
		dry.get("https:www.google.com/");

	}

}
