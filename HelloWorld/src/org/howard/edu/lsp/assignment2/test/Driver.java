package org.howard.edu.lsp.assignment2.test;

import org.howard.edu.lsp.assignment2.combination.Picker;

/**
 * 
 * @author owner
 * 
 *Synopsis
 *--------
 * This Driver class calls the function calculate _cominations from the Picker class
 * and tests different input scenarios for experimental purposes
 */

public class Driver {
	
	/*
	 * Main method containing print statements with different inputs 
	 */
	
	public static void main(String[] args) {
		
		//New class type Picker AKA my implementation class
		Picker combos = new Picker();
		
		/*
		 * Test Print Statements
		 */
		
		//Duplicates
		combos.calculate_combinations(new int[] {5, 5, 10, 15}, 15);
		
		//Normal
		combos.calculate_combinations(new int[] {1, 2, 3, 4, 5, 6}, 6);
		
		//Blank
		combos.calculate_combinations(new int[] {}, 15);
		
		//Only One
		combos.calculate_combinations(new int[] {15}, 15);
		
		//Zero Alert
		combos.calculate_combinations(new int[] {0, 2, 4, 6}, 8);
		
		//Deliberately Not Exact
		combos.calculate_combinations(new int[] {7}, 15);
	}
}
