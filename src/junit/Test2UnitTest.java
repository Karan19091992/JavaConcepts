/**
 * 
 */
package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import collection.test2;

/**
 * @author Karansinh
 *
 */
public class Test2UnitTest {

	@Test
	public void testFrontAgain_Karanka_true() {
	
		test2 test = new test2();
		assertEquals(true, test.frontAgain("Karanka"));
	}
	
	@Test
	public void testFrontAgain_LoveYou_false() {
	
		test2 test = new test2();
		//assertEquals(false, test.frontAgain("LoveYou"));
		assertFalse(test.frontAgain("LoveYou"));
	}

}
