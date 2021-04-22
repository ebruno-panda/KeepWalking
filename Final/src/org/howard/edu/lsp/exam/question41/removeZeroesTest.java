/**
 * 
 */
package org.howard.edu.lsp.exam.question41;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author owner
 * File to conduct JUnit Tests
 */
public class removeZeroesTest {

	/*removeZeroes method tested for multiple 0's in arraylist parameter*/
	@Test
	@DisplayName("Test cases for removeZeroes")
	public void removeZeroes() {
		
		ArrayList<Integer> tester = new ArrayList<Integer>(); // to be used as argument
		ArrayList<Integer> compare = new ArrayList<Integer>(); // to be used to compare to result of method using above argument
		
		/**
		 * Test for multiple zeros 
		 */
		//tester = {0, 7, 2, 0, 0, 4, 0};
		tester.add(0);
		tester.add(7);
		tester.add(2);
		tester.add(0);
		tester.add(0);
		tester.add(4);
		tester.add(0);
		
		//compare = {7, 2, 4};
		compare.add(7);
		compare.add(2);
		compare.add(4);		
		
		removeZeroes action = new removeZeroes();
		assertEquals(true, (action.removeZeroes(tester)).equals(compare)); //if {7, 2, 4} == {7, 2, 4}, true is fulfilled (pass test) 
		tester.clear();
		compare.clear();
	}	
	
	
	
	/*removeZeroes method tested for one 0 in arraylist parameter*/
	@Test
	@DisplayName("Test cases for unoCero")
	public void unoCero() {
		
		ArrayList<Integer> tester = new ArrayList<Integer>(); // to be used as argument
		ArrayList<Integer> compare = new ArrayList<Integer>(); // to be used to compare to result of method using above argument
		
		/**
		 * Test for one zero 
		 */
		//tester = {5, 0, 92, 18}
		tester.add(5);
		tester.add(0);
		tester.add(92);
		tester.add(18);
		
		//compare = {5, 92, 18}
		compare.add(5);
		compare.add(92);
		compare.add(18);
		
		removeZeroes action = new removeZeroes();
		assertEquals(true, (action.removeZeroes(tester)).equals(compare)); //if {5, 92, 18} == {5, 92, 18}, true is fulfilled (pass test) 
		tester.clear();
		compare.clear();
		
	}
	
	
	
	/*removeZeroes method tested for no 0's in arraylist parameter*/
	@Test
	@DisplayName("Test cases for noCero")
	public void noCero() {
		
		ArrayList<Integer> tester = new ArrayList<Integer>(); // to be used as argument
		ArrayList<Integer> compare = new ArrayList<Integer>(); // to be used to compare to result of method using above argument
		
		/**
		 * Test for no zeros 
		 */
		//tester = {6, 7, 9, 16}
		tester.add(6);
		tester.add(7);
		tester.add(9);
		tester.add(16);
		
		//compare = {6, 7, 9, 16}
		compare.add(6);
		compare.add(7);
		compare.add(9);
		compare.add(16);
		
		removeZeroes action = new removeZeroes();
		assertEquals(true, (action.removeZeroes(tester)).equals(compare)); //if {6, 7, 9, 16} == {6, 7, 9, 16}, true is fulfilled (pass test) 
		tester.clear();
		compare.clear();
		
	}
	
	
	
	/*removeZeroes method tested for random order of compare arraylist vs the arraylist parameter*/
	@Test
	@DisplayName("Test cases for Rando")
	public void Rando() {
		
		ArrayList<Integer> tester = new ArrayList<Integer>(); // to be used as argument
		ArrayList<Integer> compare = new ArrayList<Integer>(); // to be used to compare to result of method using above argument
		
		/**
		 * Test for different order 
		 */
		//tester = {6, 7, 0, 9, 16}
		tester.add(6);
		tester.add(7);
		tester.add(0);
		tester.add(9);
		tester.add(16);
		
		//compare = {0, 9, 7, 6, 16}
		compare.add(0);
		compare.add(9);
		compare.add(7);
		compare.add(6);		
		compare.add(16);
		
		removeZeroes action = new removeZeroes();
		assertEquals(false, (action.removeZeroes(tester)).equals(compare)); //if {6, 7, 0, 9, 16} == {0, 9, 7, 6, 16}, false is fulfilled (pass test) 
		tester.clear();
		compare.clear();
		
	}
	
	
	
	/*removeZeroes method tested for arraylist parameter having ALL 0's*/
	@Test
	@DisplayName("Test cases for allZeros")
	public void allZeros() {
		
		ArrayList<Integer> tester = new ArrayList<Integer>(); // to be used as argument
		ArrayList<Integer> compare = new ArrayList<Integer>(); // to be used to compare to result of method using above argument
		
		/**
		 * Test for ALL 0's 
		 */
		//tester = {0, 0, 0}
		tester.add(0);
		tester.add(0);
		tester.add(0);
		
		//compare = {}
		
		
		removeZeroes action = new removeZeroes();
		assertEquals(true, (action.removeZeroes(tester)).equals(compare)); //if null == {}, true is fulfilled (pass test) 
		tester.clear();
		compare.clear();
		
	}
	
	
	
	/*removeZeroes method tested for arraylist parameter having NO VALUES*/
	@Test
	@DisplayName("Test cases for noValues")
	public void noValues() {
		
		ArrayList<Integer> tester = new ArrayList<Integer>(); // to be used as argument
		ArrayList<Integer> compare = new ArrayList<Integer>(); // to be used to compare to result of method using above argument
		
		/**
		 * Test for having NO VALUES 
		 */
		//tester = {}		
		//compare = {}
		
		
		removeZeroes action = new removeZeroes();
		assertEquals(true, (action.removeZeroes(tester)).equals(compare)); //if {} == {}, true is fulfilled (pass test) 
		tester.clear();
		compare.clear();
		
	}
		
	
}
