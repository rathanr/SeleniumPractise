import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
        
        List<WebElement> links = driver.findElements(By.cssSelector("[class='gf-t'] a"));
        SoftAssert soft = new SoftAssert();
        for(WebElement link : links)
        {
        	String url = link.getAttribute("href");
            HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int responsecode = conn.getResponseCode();
            System.out.println(responsecode);
            // Hard Assertion
            //Assert.assertTrue(responsecode<400, "The link which has text " + link.getText() + " is broken with error code " + responsecode);
            // Soft Assertion if any link is broken also it will proceed further until it checks all the links
            soft.assertTrue(responsecode<400, "The link which has text " + link.getText() + " is broken with error code " + responsecode);
        }
        
        // This will apply assertion for all if any broken link stored in the above soft assertion then the below assert() will fail the script
        
        soft.assertAll();
        
	}

}
