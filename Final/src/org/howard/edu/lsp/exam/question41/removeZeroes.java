/**
 * 
 */
package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

/**
 * @author owner
 *
 */
public class removeZeroes {

	/**
	 * @param args
	 */

	public static ArrayList<Integer> removeZeroes(ArrayList<Integer> input) {
		
		ArrayList<Integer> nonZero = new ArrayList<Integer>();  // create a new list to take in nonzero values

		for (int i=0; i < input.size(); i++) {
			
			if(input.get(i) != 0){
				nonZero.add(input.get(i));				
			}
			
		}
		
		return nonZero;
	}
}