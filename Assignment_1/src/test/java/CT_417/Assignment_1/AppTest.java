package CT_417.Assignment_1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase { 
	 
		public void testGetUsername() {
			
			student dave = new student("Dave", 22, "04/11/1996"/*, 15463611*/);
			
			assertEquals(dave.getUsername(), "Dave22");
			
			
			//fail("Not yet implemented");
    }
}
