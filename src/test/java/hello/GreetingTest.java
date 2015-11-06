package hello;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;



public class GreetingTest {
	
	

	

	@Test
	public void test() {
		// System.out.println("Default Test ");
		Greeting greeting = new Greeting();
		greeting.setId(7);
		greeting.setContent("abc");
		
		assertEquals(greeting.getId(), 7);
		
		assertEquals(greeting.getContent(), "abc");
	}

}
