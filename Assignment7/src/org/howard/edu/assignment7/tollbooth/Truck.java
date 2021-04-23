/**
 * 
 */
package org.howard.edu.assignment7.tollbooth;

/**
 * @author owner
 *
 * Number of axles; total weight; make; access but impossible to modify
 */
abstract class Truck {

	public int num_axles;
	public int kilos;
	public abstract void axles(int num_axles); //abstract class method w/o body | takes number of axles per truck
	public abstract void weight(int kilos); //abstract class method w/o body | takes weight per truck in kg and converts to half-tons
	
}
