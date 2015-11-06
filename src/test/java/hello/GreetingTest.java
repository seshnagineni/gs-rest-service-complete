package hello;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;



public class GreetingTest {
	
	private static Greeting greeting;

	@BeforeClass
	public static void initGreeting() {
		
	}

	@Test
	public void test() {
		System.out.println("Default Test ");
		greeting = new Greeting(7, "abc");
		
		assertEquals(greeting.getId(), 7);
		
		assertEquals(greeting.getContent(), "abc");
	}

}
