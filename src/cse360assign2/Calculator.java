/*
 * Name: Oluwatofarati (Bo) Johnson
 * ASU ID: 1211012995
 * Class ID: 425
 * Assignmnet 2
 * We are using version control to incrementally update the contents of Calculator.java. After each change we push
 * a commit to Github.
 */

package cse360assign2;

public class Calculator {

	private int total;
	private String history;
	
	/**
	 * The default constructor for the Calculator class that sets the total member variable to 0
	 * and initialize the history String to hold "0"
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0"; // 0 will always be the initial value of the calculator
	}
	
	/**
	 * Returns the current total value of the calculator
	 * 
	 * @return an integer that holds the current total value
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds a specified value to the current total and records its operation to the history String
	 * 
	 * @param value the integer value that will be added to the current total
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 * Subtracts a specified value to the current total and records its operation to the history String
	 * 
	 * @param value the integer value that will be subtracted from the current total
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * Multiplies the current total by a specified value and records its operation to the history String
	 * 
	 * @param value the integer value that the total will be multiplied by
	 */
	public void multiply (int value) {
		total *= value;
		history += " * " + value;
	}
	
	/**
	 * Divides the current total by a specified value and records its operation to the history String
	 * 
	 * @param value the integer value that the total will be divided by
	 */
	public void divide (int value) {
		if(value == 0) {
			total = 0;
		}
		else {
			total /= value;
		}
		
		history += " / " + value;
	}
	
	/**
	 * Returns a string containing all previous operations and the their arguments in the order they were done in
	 * 
	 * @return a string that holds all the previous operations and their arguments
	 */
	public String getHistory () {
		return history;
	}
}
