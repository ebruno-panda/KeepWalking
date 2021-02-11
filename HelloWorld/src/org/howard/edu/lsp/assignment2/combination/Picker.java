package org.howard.edu.lsp.assignment2.combination;

/**
 * 
 * @author owner
 * 
 * Synopsis
 * --------
 * This class is simply made up of a function that takes in an array and an integer.
 * For all of the combinations of numbers that add up to the given integer, these
 * combinations will be shown with the indices -- not the numbers themselves.
 *  
 */

public class Picker {
	/**
	 * Variables' Significance
	 * -----------------------
	 * @param envase - Spanish for "container"; Is the array parameter input
	 * @param cible - French for "target"; Is the target number for the goal of the combos' sum
	 */
	
	public static void calculate_combinations(int envase[], int cible){
		
		/*
		 * 1. Loop with integer as iterator AKA "iterar" which means "to iterate" in Spanish
		 * 2. If array value index iterar == target, print index number of that target
		 */
		
	    for (int iterar = 0; iterar < envase.length; iterar++ ){
	      if(envase[iterar] == cible){ 
	        String single_guy = "[" + iterar + "]" ; 
	        System.out.println(single_guy);
	      }
	    }

	    
	    /*
	     * 1. Loops:
	     *    a. An integer, iterator, AKA "iterar" which means "to iterate" in Spanish
	     * 	  b. backwards_looper iterates through the given array backwards, starting as one less than array length, until it equals 0
	     * 2. If the two loopers meet and their sum == target, print the indices of this combo
	     */
	    
	    for (int iterar = 0; iterar < envase.length; iterar++){
	      for(int backwards_looper = envase.length-1; backwards_looper != 0; backwards_looper--){
	        if(envase[iterar] + envase[backwards_looper] == cible){
	          System.out.println("["+iterar +","+backwards_looper+"]");
	        }
	      }
	    }

	    
	    /*~SAME AS ABOVE LOOP BUT FOR A POSSIBLE COMBINATION WITH 3 NUMBERS, HENCE THE 3 FOR LOOPS TOTAL IN THIS CLASS~
	     * 1. Loops:
	     *    a. An integer, iterator, AKA "iterar" which means "to iterate" in Spanish
	     * 	  b. backwards_looper iterates through the given array backwards, starting as one less than array length, until it equals 0
	     * 2. If the two loopers meet and their sum == target, print the indices of this combo
	     *
	     */
	    
	    for(int iterar=0; iterar<envase.length; iterar++){
	      for(int backwards_looper=envase.length-1; backwards_looper !=0; backwards_looper--){
	        for(int x = 1; x < envase.length; x++){
	          if (envase[iterar] + envase[backwards_looper] + envase[x] == cible){
	            System.out.println("[" + iterar + "," +backwards_looper+","+ x +"]");
	          }
	        }
	      }
	    }
	     
	    System.out.println("DONE!");
	    System.out.println("");
	    System.out.println("");
	  } 
	

	/*
	 * Main method calling calculate_combinations, allowing for arguments to be input
	 */
	  public static void main(String[] args){
	    
	  }
	}




