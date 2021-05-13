package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@DataProvider
	public Object[][] testData(){
		Object[][] data = new Object[2][2];
		
		data[0][0] = "Test1";
		data[0][1] = "Test2";
		
		data[1][0] = "Test3";
		data[1][1] = "Test4";
		
		
		return data;
		
	}
	
	@Test(dataProvider="testData")
	public void test(String s1, String s2) {
		System.out.println("S1"+" "+s1+" S2"+" "+s2);
		
	}
	
	@DataProvider
	public Object[][] testData2(){
		Object[][] data = new Object[3][3];
		
		data[0][0] = 1;
		data[0][1] = 2;
		data[0][2] = 3;
		
		data[1][0] = 4;
		data[1][1] = 5;
		data[1][2] = 6;
		
		data[2][0] = 7;
		data[2][1] = 8;
		data[2][2] = 9;
		
		
		return data;
		
	}
	
	@Test(dataProvider="testData2")
	public void test2(int s1, int s2, int s3) {
		System.out.println("S1"+" "+s1+" S2"+" "+s2+" S3"+" "+s3);
		
	}

}
