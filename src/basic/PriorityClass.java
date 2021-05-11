package basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class PriorityClass {
	
  @Test (priority=1)
  public void testcaseOne() {
	  System.out.println("test case one");
  }
  
  @Test (priority=4)
  public void testcaseTwo() {
	  System.out.println("test case two");
  }
  
  @Test (priority=3)
  public void testcaseThree() {
	  System.out.println("test case three");
  }
  
  @Test (priority=2)
  public void testcaseFour() {
	  System.out.println("test case four");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

}
