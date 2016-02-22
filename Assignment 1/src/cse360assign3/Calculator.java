
package cse360assign3;
/** 
 *  Calculator class is compute the total value through add 
 * subtract, multiply and divide
 * pin:508
 * @author Haonan Li for CSE360 Spring 2016
 * @version Feb,22,2016
 * Github URL: https://github.com/scpi0017585/Haonan-Li.git
 */
public class Calculator {
	/**
	 * declare the parameter total
	 * @param int total 
	 */
	private int total;
	private String history;
	/**
	 * constructor set the total to 0
	 * @param int total
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0"; //initialize the history
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
	 * @param value use to compute the total
	 */
	public void add (int value) 
	{
		total = total + value;
		history = history + " + " + value; 
	}
	/**
	 * function use to subtract the value from total
	 * @param value use to compute the total
	 */
	public void subtract (int value) 
	{
		total = total - value;
		history = history + " - " + value;
	}
	/**
	 * function use to multiply total by the value
	 * @param value use to compute the total
	 */
	public void multiply (int value) 
	{
		total = total * value;
		history = history + " * " + value;
	}
	/**
	 * function use to divide total by value
	 * @param value use to compute the total
	 */
	public void divide (int value) 
	{
		if( value == 0 )
		{
			total = 0;
			history = history + " / " + value;
		}
		else
		{
			total = total / value;
			history = history + " / " + value;
		}
	}
	/**
	 * function use to get the history
	 * @return use to return the string history 
	 */
	public String getHistory () {
		return history;
	}
}