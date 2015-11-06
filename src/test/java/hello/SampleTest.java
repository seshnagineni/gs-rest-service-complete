package hello;
import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {

	@Test
	public void test() {
		System.out.println("Default Test Case");
		Greeting g1 = new Greeting(7, "abc");
		
		assertEquals(g1.getId(), 7);
	}

}
