package cse360assign3;
/**
 * pin:508
 * @author Haonan Li
 * @version Feb, 22, 2016
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
		@Test
		public void TestCalculator() 
		{
			Calculator myCalculator = new Calculator();
			int test = myCalculator.getTotal();
			assertNotNull( test );
		}
		@Test
		public void testGetTotal()
		{
			Calculator myCalculator = new Calculator();
			myCalculator.add( 3 );
			myCalculator.subtract( 2 );
			myCalculator.multiply( 2 );
			int totalTest = myCalculator.getTotal();
			assertEquals( totalTest , 2);
		}
		@Test
		public void testAdd() 
		{
			Calculator myCalculator = new Calculator();
			myCalculator.add( 3 );
			myCalculator.add( 4 );
			int addTest = myCalculator.getTotal();
			assertEquals( addTest , 7 );
		}
		@Test
		public void testSubstract()
		{
			Calculator myCalculator = new Calculator();
			myCalculator.subtract( 4 );
			int subtractTest = myCalculator.getTotal();
			assertEquals( subtractTest , -4 );
		}
		@Test
		public void testMultiply()
		{
			Calculator myCalculator = new Calculator();
			myCalculator.add( 3 );
			myCalculator.multiply( 4 );
			int multiplyTest = myCalculator.getTotal();
			assertEquals( multiplyTest , 12 );
		}
		@Test
		public void testDivide()
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
		public void testGetHistory()
		{
			fail("Not yet implemented");
		}
	}



