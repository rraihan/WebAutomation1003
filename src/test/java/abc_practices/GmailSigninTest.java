package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSigninTest {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/rakib/utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.id("gb_70")).click();
	//  Assert.assertEquales(true,driver.getPageSource().contains("Google"));
		Thread.sleep(12000);
		
		Thread.sleep(20000);
		driver.close();
		
	}

}
