package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args)
{
// TODO Auto-generated method stubpublic static void main(String[] args) throws InterruptedException 		{
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOHAMEDKASIM\\Desktop\\Driver\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

WebElement checkavail = driver.findElement(By.id("userRegistrationForm:checkavail"));
checkavail.click();
driver.switchTo().alert().accept();


//// accepting javascript alert
//Alert alert = driver.switchTo().alert();
//alert.accept();

	}

}



	
	
