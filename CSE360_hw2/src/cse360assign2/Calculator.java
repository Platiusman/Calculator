/**
 * Author: Isaac Walker
 * Class ID: 579
 * Assignment: 2
 */

package cse360assign2;


/**
 * This class is a calculator that does addition, subtraction, 
 * division, multiplication, returns a total integer and a history.
 * @author Isaac Walker
 * @version This is version 1. Has only the methods and JavaDoc
 */
public class Calculator
{

	private int total;
	
	
	/**
	 * Is the basic constructor of the calculator.
	 */
	public Calculator ()
	{
		total = 0;  // not needed - included for clarity
	}
	
	
	/**
	 * Returns a total value.
	 * @return is supposed to return the current total.
	 */
	public int getTotal ()
	{
		return total;
	}
	
	
	/**
	 * Adds the value to the total.
	 * @param is the value to be added.
	 */
	public void add (int value)
	{
		total = total + value;
	}
	
	
	/**
	 * Subtracts the value from the total.
	 * @param value is the value to be subtracted.
	 */
	public void subtract (int value)
	{
		total = total - value;
	}
	
	
	/**
	 * Multiplies the total times the value.
	 * @param value the value to multiplied.
	 */
	public void multiply (int value)
	{
		total = total * value;
	}
	
	
	/**
	 * Divides the total by the value via integer divison.
	 * If value is 0, then total equals 0.
	 * @param is the value to be divided.
	 */
	public void divide (int value)
	{
		if(value == 0)
		{
			total = 0;
		}
		else
		{
			total = total / value;
		}
	}
	
	
	/**
	 * Returns the history of actions as a string.
	 * @return returns a string of the actions in a format.
	 */
	public String getHistory ()
	{
		return "";
	}
}
