package abc_practices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailSigninTest {

	public static void main(String[] args) throws Throwable {
	
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakib\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.findElement(By.id("gb_70")).click();
	//  Assert.assertEquales(true,driver.getPageSource().contains("Google"));
		driver.findElement(By.id("identifierId")).sendKeys("nokolnaam00");
		driver.findElement(By.id("identifierNext")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.findElement
		(By.xpath("//*[@id=\'password']/div[1]/div/div[1]/input")).sendKeys("QQ$%&90s$");
		
		//Thread.sleep(1200);
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//driver.findElement(By.id("passwordNext")).click();
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();
		
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"gsr\"]")).click();
		
		
		
		
		
		  


		
		
		
		
	
		
		
		//Thread.sleep(12000);
		
		//Thread.sleep(20000);
		//driver.close();
		
	}

}