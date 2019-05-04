package testNGDemo;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class TestSequence {


	@Test(priority=2, description="This is priority 2", dependsOnMethods="testc")
	void testb() {
		System.out.println("test B");
	}

	@Test(priority=3, description="This is priority 3")
	void testa() {
		System.out.println("test A");
	}
	
	@Test(priority=1, description="This is priority 1")
	void testc() {
		System.out.println("test C");
		List list=new ArrayList();
		list.get(2);
	}
}
