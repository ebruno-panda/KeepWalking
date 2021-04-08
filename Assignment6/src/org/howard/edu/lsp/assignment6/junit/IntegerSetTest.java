/**
 * 
 */
package org.howard.edu.lsp.assignment6.junit;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

/**
 * @author owner
 *
 */
public class IntegerSetTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	
	/**
	 * Add
	 * JUnit case
	 */
	@Test
	@DisplayName("Test cases for add")
	public void testAdd() {
		ArrayList<Integer> list_uno = new ArrayList<>();		
		IntegerSet setA = new IntegerSet(list_uno);
		
		setA.add(0);		
		assertEquals(true, setA.contains(0));
		setA.clear();
	}
	
	
	/**
	 * Remove
	 * JUnit case
	 */
	@Test
	@DisplayName("Test cases for remove")
	public void testRemove() {
		ArrayList<Integer> list_uno = new ArrayList<>();		
		IntegerSet setA = new IntegerSet(list_uno);
		
		//setA = {0, 10, 20}
		setA.add(0);
		setA.add(10);
		setA.add(20);
		
		setA.remove(0);
		
		assertEquals(false, setA.contains(0));
		setA.clear();
	}
	
	
	/**
	 * Length
	 * JUnit case
	 */
	@Test
	@DisplayName("Test cases for length")
	public void testLength() {
		ArrayList<Integer> list_uno = new ArrayList<>();		
		IntegerSet setA = new IntegerSet(list_uno);
		
		//setA = {5, 57, 1, 2, 33}
		setA.add(5);
		setA.add(57);
		setA.add(1);
		setA.add(2);
		setA.add(33);
		assertEquals(5, setA.length());
		setA.clear();
		
		//Length if 0 is the only element
		setA.add(0);
		assertEquals(1, setA.length());
		setA.clear();
		
		//Length of an empty set
		assertEquals(0, setA.length());
		setA.clear();
	}
	
	
	/**
	 * IsEmpty
	 * JUnit case
	 */
	@Test
	@DisplayName("Test cases for is empty")
	public void testIsEmpty() {
		ArrayList<Integer> list_uno = new ArrayList<>();		
		IntegerSet setA = new IntegerSet(list_uno);
		
		//Checks if setA is empty (while empty)
		assertEquals(true, setA.isEmpty());
		
		//Checks if setA is empty (while not empty)
		setA.add(9);
		assertEquals(false, setA.isEmpty());
		setA.clear();
	}
	
	
	/**
//	 * Contains
//	 * JUnit case
//	 */
	@Test
	@DisplayName("Test cases for contains")
	public void testContains() {
		ArrayList<Integer> list_uno = new ArrayList<>();
		IntegerSet setA = new IntegerSet(list_uno);
		
		setA.add(51);
		setA.add(6);
		setA.add(44);
		setA.add(27);
		setA.add(13);
		
		assertEquals(true, setA.contains(5));
		setA.clear();
	}
	
	
	/**
	 * Clear
	 * JUnit case
	 */
	@Test
	@DisplayName("Test cases for clear")
	public void testClear() {
		ArrayList<Integer> list_uno = new ArrayList<>();
		
		IntegerSet setA = new IntegerSet(list_uno);
		
		//setA = {2, 5, 6}
		setA.add(2);
		setA.add(5);
		setA.add(6);
		
		//clear setA
		setA.clear();
		
		//check if clear
		assertEquals(true, setA.length() == 0);
	}
	
		
	/**
	 * Equals
	 * JUnit Test
	 */
	@Test
	@DisplayName("Test cases for equals")
	void testEquals() {
		ArrayList<Integer> list_uno = new ArrayList<>();
		ArrayList<Integer> list_dos = new ArrayList<>();
		
		IntegerSet setA = new IntegerSet(list_uno);
		IntegerSet setB = new IntegerSet(list_dos);
		
		
		//If both sets are equal		
		setA.add(2);
		setA.add(5);
		setA.add(6);
		
		setB.add(6);
		setB.add(5);
		setB.add(2);
		
		assertEquals(true, setA.equals(setB)); //True if setA == setB
		setA.clear();
		setB.clear();
		
		
		//If one set is != to the other
		setA.add(2);
		setA.add(5);
		setA.add(6);
		
		setB.add(6);
		setB.add(5);
		
		assertEquals(false, setA.equals(setB)); //True if setA != setB
		setA.clear();
		setB.clear();
		
		
		//If set overlap exists
		setA.add(2);
		setA.add(6);
		
		setB.add(6);
		setB.add(5);
		
		assertEquals(false, setA.equals(setB)); //True if setA != setB
		setA.clear();
		setB.clear();
	}
	
	
	/**
	 * Union
	 * JUnit Test
	 */
	@Test
	@DisplayName("Test cases for union")
	void testUnion() {
		ArrayList<Integer> actually = new ArrayList<>();
		IntegerSet tres = new IntegerSet(actually);	
		
		ArrayList<Integer> list_uno = new ArrayList<>();
		ArrayList<Integer> list_dos = new ArrayList<>();
		
		IntegerSet setA = new IntegerSet(list_uno);
		IntegerSet setB = new IntegerSet(list_dos);
		
		
		
		//If both sets are equal
		//setA = {2, 5, 6}
		setA.add(2);
		setA.add(5);
		setA.add(6);
		
		//setB = {13, 4, 88, 2, 60, 6}
		setB.add(13);
		setB.add(4);
		setB.add(88);
		setB.add(2);
		setB.add(60);
		setB.add(6);
		
		//setA U setB = {2, 6}
		tres.add(2);
		tres.add(6);
		
		setA.union(setB);
		
		assertEquals(tres, setA); //True if setA == setB
		setA.clear();
		//NOT FINISHED
		
	}
	
	
	/**
	 * Intersect
	 * JUnit Case
	 */
	@Test
	@DisplayName("Test cases for intersection")
	public void testIntersect() {
		ArrayList<Integer> actually = new ArrayList<>();
		IntegerSet tres = new IntegerSet(actually);		
		
		ArrayList<Integer> list_uno = new ArrayList<>();
		ArrayList<Integer> list_dos = new ArrayList<>();
		
		IntegerSet setA = new IntegerSet(list_uno);
		IntegerSet setB = new IntegerSet(list_dos);
		
		//setA = {2, 5, 6}
		setA.add(2);
		setA.add(5);
		setA.add(6);
		
		//setA = {6, 5}
		setB.add(6);
		setB.add(5);
		
        //tres = {5, 6}
		tres.add(5);
		tres.add(6);
		
		setA.intersect(setB);
		assertEquals(true, setA.equals(tres));
		}
	
	/**
	 * Difference
	 * JUnit Test
	 */
	@Test 
	@DisplayName("Test cases for difference")
	void testDiff() {
		ArrayList<Integer> actually = new ArrayList<>();
		IntegerSet tres = new IntegerSet(actually);

		ArrayList<Integer> list_uno = new ArrayList<>();
		ArrayList<Integer> list_dos = new ArrayList<>();

		IntegerSet setA = new IntegerSet(list_uno);
		IntegerSet setB = new IntegerSet(list_dos);


		//setA = {2, 5, 6}
		setA.add(2);
		setA.add(5);
		setA.add(6);

		//setB = {13, 4, 88, 2, 60, 6}
		setB.add(13);
		setB.add(4);
		setB.add(88);
		setB.add(2);
		setB.add(60);
		setB.add(6);

		//setA - setB = {5}
		tres.add(5);
		
		setA.diff(setB);
		assertEquals(true, tres == setA);
		setA.clear();
		
	}
	
	/**
	 * toString
	 * JUnit case
	 */
	@Test
	@DisplayName("Test cases for tostring")
	public void testtoString() {
		ArrayList<Integer> list_uno = new ArrayList<>();		
		IntegerSet setA = new IntegerSet(list_uno);
		
		setA.add(13);
		setA.add(4);
		setA.add(88);
		setA.add(2);
		setA.add(60);
		setA.add(6);
		
		String example = "13, 4, 88, 2, 60, 6";
		
		assertEquals(true, example == setA.toString());
		setA.clear();
	}
	
	
	/**
	 * Largest
	 * JUnit case
	 */
	@Test
	@DisplayName("Test cases for largest")
	public void testlargestExceptionSucceeds() {
		ArrayList<Integer> list_uno = new ArrayList<>();		
		IntegerSet setA = new IntegerSet(list_uno);
		
		int max_order;
		
		setA.add(13);
		setA.add(4);
		setA.add(88);
		setA.add(2);
		setA.add(60);
		setA.add(6);
		
		max_order = 88;
		
		
		try {
		assertEquals(true, max_order == setA.largest());
		}
		finally {
			
		}
		setA.clear();
	}
	
	/**
	 * Smallest
	 * JUnit case
	 */
	@Test
	@DisplayName("Test cases for smallest")
	public void testsmallestExceptionSucceeds() {
		ArrayList<Integer> list_uno = new ArrayList<>();		
		IntegerSet setA = new IntegerSet(list_uno);
		
		int min_order;
		
		setA.add(13);
		setA.add(4);
		setA.add(88);
		setA.add(2);
		setA.add(60);
		setA.add(6);
		
		min_order = 2;
		
		
		try {
		assertEquals(true, min_order == setA.largest());
		}
		finally {
			
		}
		setA.clear();
	}
}
