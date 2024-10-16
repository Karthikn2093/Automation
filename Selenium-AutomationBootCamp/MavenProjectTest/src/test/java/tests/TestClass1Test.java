package tests;

import org.testng.annotations.Test;

import basePackage.BaseClass;



public class TestClass1Test extends BaseClass {
	
	@Test
	public void testcase1() {
		System.out.println("!!!This is from TestClass1 Class and Testcase1 Method!!!");
	}
	
	@Test
	public void testcase2() {
		System.out.println("!!!This is from TestClass1 Class and Testcase2 Method!!!");
	}

}
