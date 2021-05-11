package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	
	public static void main(String[] args) {
		String url = "https://www.travolook.in/?gclid=Cj0KCQjw4cOEBhDMARIsAA3XDRjGAeFHS8cqdKjY45Sc7ZEf98H63uG7bP6HsxGr9ugbNNNMU0GJZdYaAoH4EALw_wcB";   // locally
		System.setProperty("webdriver.chrome.driver", "drivers2/chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//a[@title=\"Contact us\"])[2]"))).build().perform();
		
		   
		
		

	}

}
