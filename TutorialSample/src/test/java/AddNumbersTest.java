/**
 * 
 */
package test.java;

import org.junit.Test;

import junit.framework.TestCase;
import main.java.AddNumbers;

/**
 * @author punee
 *
 */
public class AddNumbersTest extends TestCase {
	
	AddNumbers addNum = new AddNumbers();
	//@Before
	
	@Test
	public void testAdd()
	{
		assertEquals(4, addNum.add(3,1));
	}
	
	@Test
	public void testGreater()
	{
		int firstNumber = 3;
		int secondNumber = 10;
		int expected = 10;
		
		//int result = addNum.greater(firstNumber, secondNumber);
		//assertEquals(expected, result);
	}
	
	@Test
	public void testGreaterWithNegative(){
		int firstNumber = -5;
		int secondNumber = -2;
		int expected = -2;
		
		//int result = addNum.greater(firstNumber, secondNumber);
		//assertEquals(expected, result);
		
	}
	
	@Test(expected = Exception.class)
	public void testEqualNumber()throws Exception{
		int firstNumber = 5;
		int secondNumber = 5;
		//int expected = secondNumber;
		
			//int result = 
					addNum.greater(firstNumber, secondNumber);
		
		
		
	}
	

}
