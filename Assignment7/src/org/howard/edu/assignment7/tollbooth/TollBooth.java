/**
 * 
 */
package org.howard.edu.assignment7.tollbooth;
import org.howard.edu.assignment7.tollbooth.Truck;

/**
 * @author owner
 * Display data of total receipts and number of trucks
 * ---------------------------------------------------
 * 
 * a) Display the booth's totals simply by printing those values to System.out
 * b) display the totals maintained by the booth and then reset them to zero because receipts and truck
 * 
 * NOTE
 * ----
 * 1 kg = 0.00110231 tons
 * 1 ton  = 907.185 kg
 * 1/2 ton  = 453.5925 kg 
 */
abstract class TollBooth {

	//to CALCLATE
	public abstract void displayData();
	public abstract void reset();
	public abstract void calculateToll(Truck make);		
}
