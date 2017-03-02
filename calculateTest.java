import static org.junit.Assert.*;

import org.junit.Test;

public class calculateTest {
int num1;
int num2;
int result;
int expected;
	
	@Test
	public void testSum() {
		num1 = 2;
		num2 = 8;
		result = calculate.sum(num1, num2);
		expected = 10;
		
		assertEquals(expected,result);		
	}

	@Test
	public void testProduct() {
		num1 = 10;
		num2 = 2;
		result = calculate.product(num1, num2);
		expected = 5;
		
		assertEquals(expected,result);	
	}

	@Test
	public void testDifference() {
		num1 = 12;
		num2 = 3;
		result = calculate.difference(num1, num2);
		expected = 9;
		
		assertEquals(expected,result);	
	}

}
