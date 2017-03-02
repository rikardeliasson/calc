import static org.junit.Assert.*;

import org.junit.Test;

public class calculateTest {
int num1; //storage for first input
int num2; //storage for second input
int result; //stores result
int expected; //stores value to compare to
	
	@Test
	public void testSum() { //testing the adding method
		num1 = 2; 
		num2 = 8;
		result = calculate.sum(num1, num2); //result stores the method of add
		expected = 10;
		
		assertEquals(expected,result); //compares add to the expected, if no match then error 
	}

	@Test
	public void testProduct() { //tests the divide function
		num1 = 10;
		num2 = 2;
		result = calculate.product(num1, num2); //result of the divide is stored
		expected = 5;
		
		assertEquals(expected,result);// compares the expected to the divide, if they are not the same an error occurs
	}

	@Test
	public void testDifference() { //testing the difference between values function
		num1 = 12;
		num2 = 3;
		result = calculate.difference(num1, num2); //stores the difference between two int into result
		expected = 9;
		
		assertEquals(expected,result);	//compares the expected to the actual result, if they dont match a fail occurs
	}

}
