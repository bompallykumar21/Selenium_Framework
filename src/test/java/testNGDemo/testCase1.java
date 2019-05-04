package testNGDemo;

import org.testng.annotations.Test;

public class testCase1 extends testNGAnnotationsList{

	@Test
	public void test1() {
		logger.info("@Test Annotation Test case 1");
	}
	
	@Test
	public void test2() {
		logger.info("@Test Annotation Test case 2");
	}
}
