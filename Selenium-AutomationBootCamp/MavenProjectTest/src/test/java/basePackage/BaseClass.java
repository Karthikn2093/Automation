package basePackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeTest
	public void startApp() {
		
		System.out.println("***This is from Start App - BeforeTest Annotation Method***");
		
	}
	
	@AfterTest
	public void closeApp() {
		System.out.println("***This is from Close App - AfterTest Annotation Method***");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("***This is from Before Class Annotation Method***");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("***This is from After Class Annotation Method***");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("***This is from Before Method Annotation Method***");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("***This is from After Method Annotation Method***");
	}

}
