import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rathanr\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://jqueryui.com/droppable/");
		System.out.println(d.findElement(By.tagName("iframe")).getSize());
		d.switchTo().frame(d.findElement(By.cssSelector("iframe[class='demo-frame']")));
		d.findElement(By.id("draggable")).click();
		Actions a = new Actions(d);
		WebElement source = d.findElement(By.id("draggable"));
		WebElement target = d.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();//Drag source & put it in Target
		d.switchTo().defaultContent(); //This is used to come out from the Iframe

	}

}
