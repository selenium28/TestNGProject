package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {
	

	public static void main(String[] args) {
		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login"
				+ "";   // locally
		
		System.setProperty("webdriver.chrome.driver", "drivers2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//ImplicitlyWait - global wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();

	}

}
