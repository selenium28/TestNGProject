package basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class IncludeExcude {
	
	@Test(groups = {"demo"})
	public void testcaseOne() {
		System.out.println("test case one");
	}

	@Test(groups = {"demo2"})
	public void testcaseTwo() {
		System.out.println("test case two");
	}

	@Test(groups = {"demo"})
	public void testcaseThree() {
		System.out.println("test case three");
	}

	@Test(groups = {"demo2"})
	public void testcaseFour() {
		System.out.println("test case four");
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

}
