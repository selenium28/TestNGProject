package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropClass {

	public static void main(String[] args) {
		String url = "https://jqueryui.com/droppable/";   // locally
		System.setProperty("webdriver.chrome.driver", "drivers2/chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);  // imp
		
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		
		WebElement targetElement = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		
		System.out.println("Click and Hold performed ");
		
		
		

	}

}
