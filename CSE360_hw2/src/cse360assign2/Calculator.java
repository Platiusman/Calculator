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
 * @version This is version 2. Has the basic operations and total functions.
 */
public class Calculator
{

	private int total;
	private String history;
	
	
	/**
	 * Is the basic constructor of the calculator.
	 * Creates the basic total and the beginning of the history string.
	 */
	public Calculator ()
	{
		total = 0;  // not needed - included for clarity
		history = "0";
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
	 * Adds the operator symbol and value to history.
	 * @param is the value to be added.
	 */
	public void add (int value)
	{
		total = total + value;
		history += " + " + value;
	}
	
	
	/**
	 * Subtracts the value from the total.
	 * Adds the operator symbol and value to history.
	 * @param value is the value to be subtracted.
	 */
	public void subtract (int value)
	{
		total = total - value;
		history += " - " + value;
	}
	
	
	/**
	 * Multiplies the total times the value.
	 * Adds the operator symbol and value to history.
	 * @param value the value to multiplied.
	 */
	public void multiply (int value)
	{
		total = total * value;
		history += " * " + value;
	}
	
	
	/**
	 * Divides the total by the value via integer division.
	 * Adds the operator symbol and value to history.
	 * If value is 0, then total equals 0.
	 * @param is the value to be divided.
	 */
	public void divide (int value)
	{
		if(value == 0)
		{
			total = 0;
			history += " / " + 0;
		}
		else
		{
			total = total / value;
			history += " / " + value;
		}
	}
	
	
	/**
	 * Returns the history of actions as a string.
	 * @return returns a string of the actions in a format.
	 */
	public String getHistory ()
	{
		return history;
	}
}
