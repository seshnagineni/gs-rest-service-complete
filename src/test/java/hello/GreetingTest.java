package hello;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;



public class GreetingTest {
	
	private static Greeting greeting;

	@BeforeClass
	public static void initCalculator() {
		greeting = new Greeting(7, "abc");
	}

	@Test
	public void test() {
		System.out.println("Default Test ");
		
		
		assertEquals(greeting.getId(), 7);
		
		assertEquals(greeting.getContent(), "abc");
	}

}
