/**
 * 
 */
package org.howard.edu.lsp.assignment4.implementation;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Esterie
 *
 * Synopsis
 * --------
 * This class is made up of several functions that takes user defined sets and performs set math operations:
 * 
 * Union
 * Intersect
 * Set A - Set B
 * Min and Max
 * 
 * And other operations such as finding the length/size, clearing, and determining if the given set is empty
 */


public class IntegerSet {

            //Default set to be manipulated	
			private ArrayList<Integer> set = new ArrayList<Integer>();
			
			//Getter for set
			public ArrayList<Integer> getSet() {
				return this.set;
			}

			// Clears the internal representation of the set
			public void clear(){
				set.clear();
				System.out.println(set);
			}
		
			// Returns the length of the set
			public int length() {
				System.out.println(set.size());
				return set.size();			
			} // returns the length
		
			
			/*
			 * Returns true if the 2 sets are equal, false otherwise;
			 * Two sets are equal if they contain all of the same values in ANY order.
			*/
			public boolean equals(IntegerSet b){
				boolean equals;
				
				ArrayList<Integer> tempArrayList = b.getSet();  // create a getter for your set.
				
				if(!set.containsAll(tempArrayList) && !tempArrayList.containsAll(set)) {
					equals = false;
				}
				
				else {
					equals = true;
				}
				System.out.println(equals);
				return equals;
			}

			
	
			// Returns true if the set contains the value, otherwise false
			public boolean contains(int value){
				
				boolean yes;
				if (set.contains(value)) {
					yes = true;
				}
				
				else {
					yes =  false;
				}
				
				System.out.println(yes);
				return yes;
			}    
	
			// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
			public void largest() throws IntegerSetException{
				if(set.isEmpty()) {
					throw new IntegerSetException("This list is empty so there is no largest integer.");
				}
				else {
					ArrayList<Integer> sortedList = new ArrayList<Integer>(set);
					Collections.sort(sortedList);
					System.out.println(sortedList.get(sortedList.size() -1));
				}
			}
	
			// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
			public void smallest() throws IntegerSetException{
				if(set.isEmpty()) {
					throw new IntegerSetException("This list is empty so there is no smallest integer.");
				}
				else {
					ArrayList<Integer> sortedList = new ArrayList<Integer>(set);
					Collections.sort(sortedList);
					System.out.println(sortedList.get(0));
				}
			}

			
			
			// Adds an item to the set or does nothing it already there
			// adds item to s or does nothing if it is in set
		 	public void add(int item){
		 		if(set.contains(item) == false) {
		 			set.add(item);			 			
		 		}
		 		
		 		System.out.println(set);
		 	} 
		 	
		 	

			// Removes an item from the set or does nothing if not there
			public void remove(int item){
				ArrayList<Integer> tempArrayList = new ArrayList<Integer>();  // create a getter for your set

				for (int i=0; i < set.size(); i++) {
					if(set.get(i) != item){
						tempArrayList.add(set.get(i));
						System.out.println(tempArrayList);
					}
				}
			    
			    
			}
		 			
			
		
			// Set union
			public void union (IntegerSet intSetb) {

				ArrayList<Integer> tempArrayList = intSetb.getSet();  // create a getter for your set.

			    for (int i=0; i< tempArrayList.size(); i++) {    // iterate through all elements of passed in ArrayList<Integer)

			       if (!set.contains(tempArrayList.get(i)))  {           // check if item is not already in set

			           add(tempArrayList.get(i));                       // if so, add it

			       }

			    }	
			    
			    

			}	
			
//			// Set intersection
			public void intersect(IntegerSet intSetb){
				
				ArrayList<Integer> tempArrayList = intSetb.getSet();  // create a getter for your set.
				ArrayList<Integer> fillerList = new ArrayList<Integer>();  // create a getter for your common set elements

			    for (int i=0; i< tempArrayList.size(); i++) {    // iterate through all elements of passed in ArrayList<Integer)

			       if (set.contains(tempArrayList.get(i)))  {           // check if item is already in set

			           fillerList.add(tempArrayList.get(i));                       // add if not there
			           System.out.println(fillerList);
			       }

			    }	
			} 
	//	
//			// Set difference, i.e., s1 –s2
			public void diff(IntegerSet intSetb) {  // set difference, i.e. s1 - s2
				ArrayList<Integer> tempArrayList = set;  // create a getter for your set.
				ArrayList<Integer> fillerList = new ArrayList<Integer>();  // create a getter for elements only in set A

			    for (int i=0; i< tempArrayList.size(); i++) {    // iterate through all elements of passed in ArrayList<Integer)

			       if (!intSetb.contains(tempArrayList.get(i)))  {           // check if item is already in set

			           fillerList.add(tempArrayList.get(i));                       // add if not there
			           System.out.println(fillerList);
			       }

			    }
			}
	//	
//			// Returns true if the set is empty, false otherwise
			public boolean isEmpty() {
				boolean fact;
				if (set.size() == 0) {
					fact = true;
				}
				
				else {
					fact = false;
				}
				System.out.println(fact);
				return fact;				 
			}
	//	
//			// Return String representation of your set
			public String toString(){ // return String representation of your set
				String sentence ="";
				for (int k = 0; k < set.size(); k++) {
					sentence = sentence.concat(String.valueOf(set.get(k)) + ", ");
				}
				System.out.println(sentence);
				return sentence;
			}	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			

	}

}
