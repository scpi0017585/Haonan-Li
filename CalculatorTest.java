package cse360assign3;
/** This is test case for Calculator Class
 * pin:508
 * @author Haonan Li
 * @version Feb, 22, 2016
 * Github URL: https://github.com/scpi0017585/Haonan-Li.git
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
		@Test 
		public void TestCalculator()     // test the constructor if it is null
		{
			Calculator myCalculator = new Calculator();
			int test = myCalculator.getTotal();
			assertNotNull( test );
		}
		@Test
		public void testGetTotal()      // test the getTotal if it is return total
		{
			Calculator myCalculator = new Calculator();
			myCalculator.add( 3 );
			myCalculator.subtract( 2 );
			myCalculator.multiply( 2 );
			int totalTest = myCalculator.getTotal();
			assertEquals( totalTest , 2);
		}
		@Test
		public void testAdd()          // test the method add if it is function well
		{
			Calculator myCalculator = new Calculator();
			myCalculator.add( 3 );
			myCalculator.add( 4 );
			int addTest = myCalculator.getTotal();
			assertEquals( addTest , 7 );
		}
		@Test
		public void testSubtract()		// test the method subtract 
		{
			Calculator myCalculator = new Calculator();
			myCalculator.subtract( 4 );
			int subtractTest = myCalculator.getTotal();
			assertEquals( subtractTest , -4 );
		}
		@Test
		public void testMultiply()		// test the method multiply
		{
			Calculator myCalculator = new Calculator();
			myCalculator.add( 3 );
			myCalculator.multiply( 4 );
			int multiplyTest = myCalculator.getTotal();
			assertEquals( multiplyTest , 12 );
		}
		@Test
		public void testDivide()		// test the method divide
		{
			Calculator myCalculator = new Calculator();
			myCalculator.add( 6 );
			myCalculator.divide( 0 );
			int divideTest = myCalculator.getTotal();
			assertEquals( divideTest , 0 );
			myCalculator.add( 6 );
			myCalculator.divide( 6 );
			divideTest = myCalculator.getTotal();
			assertEquals( divideTest , 1 );
		}
		@Test
		public void testGetHistory()	// test the method get history if it is return history correctly 
		{
			Calculator myCalculator = new Calculator();
			myCalculator.add( 4 );
			myCalculator.subtract( 3 );
			myCalculator.divide( 2 );
			myCalculator.multiply( 1 );
			String history = myCalculator.getHistory();
			assertEquals( history , "0 + 4 - 3 / 2 * 1");
			
		}
	}



