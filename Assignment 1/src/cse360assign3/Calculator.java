
package cse360assign3;
/** 
 *  Calculator class is compute the total value through add 
 * subtract, multiply and divide
 * pin:508
 * @author Haonan Li for CSE360 Spring 2016
 * @version Feb,22,2016
 */
public class Calculator {
	/**
	 * declare the parameter total
	 * @param int total 
	 */
	private int total;
	/**
	 * constructor set the total to 0
	 * @param int total
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * function using to get total
	 * @return
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * function use to add the value to total
	 * @param value 
	 */
	public void add (int value) 
	{
		total = total + value;
	}
	/**
	 * function use to subtract the value from total
	 * @param value
	 */
	public void subtract (int value) 
	{
		total = total - value;
	}
	/**
	 * function use to multiply total by the value
	 * @param value
	 */
	public void multiply (int value) 
	{
		total = total * value;
	}
	/**
	 * function use to divide total by value
	 * @param value
	 */
	public void divide (int value) 
	{
		if( value == 0 )
		{
			total = 0;
		}
		else
		{
			total = total / value;
		}
	}
	/**
	 * function use to get the history
	 * @return
	 */
	public String getHistory () {
		return "";
	}
}