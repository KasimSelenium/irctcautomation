package secondPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOHAMEDKASIM\\Desktop\\Driver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		
	//Implicit wait - common wait time
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	// Launch the browser
	driver.get("https://jqueryui.com/droppable/");
	
	//Indentify the frame and switch to frame
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(frame);
	
	//Elements drag me to target box 	
	WebElement target = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		
	//Elments drop here box
	WebElement drop = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
	
	//Drag and drop using actions
	Actions builder = new Actions(driver);
	builder.dragAndDrop(target, drop).build().perform();
	

	}

}
