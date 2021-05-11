package basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGClass {
	
	@Test
	public void testcase() {
		System.out.println("TestCase1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@Test
	public void testcase5() {
		System.out.println("TestCase3");
	}
	
	@Test
	public void testcase4() {
		System.out.println("TestCase4");
	}
	
	@Test
	public void testcase2() {
		System.out.println("TestCase5");
	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}

}
