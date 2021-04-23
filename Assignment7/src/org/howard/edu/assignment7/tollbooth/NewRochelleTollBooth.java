/**
 * 
 */
package org.howard.edu.assignment7.tollbooth;

import javax.print.attribute.standard.PrinterMakeAndModel;

import org.howard.edu.assignment7.tollbooth.Izuzu;
import org.howard.edu.assignment7.tollbooth.Susuki;
import org.howard.edu.assignment7.tollbooth.Truck;

/**
 * @author owner
 * 
 * Scenario
 * --------
 * a = axle; ht = half ton;
 * Toll = 5a + 10ht OR Toll = 5a + (10 * every thousand pounds)
 * 
 * Button on side of screen shows totals
 * Totals = Amount in all Receipts and Number of Trucks
 * 
 * 
 * When cash drawer is removed from it's cradle AKA RESET
 * ex. *** Collecting receipts  ***
		Totals since the last collection - Receipts: $253 Trucks: 5
		Receipts and Trucks both = 0
 */

class NewRochelleTollBooth extends TollBooth{

	/**
	 * The purpose of this class track of:
	 * 	a) the total number of trucks that have gone through the tollbooth
		b) total receipts since collection.
	 * @param args
	 */
	
	
	public void displayData(){
		
		System.out.print("Totals since last collection - Receipts: $"); //prepare to print totals
		TollTally toll = new TollTally();
		toll.readPreference("Total");
		System.out.print(" | ");
		
		TruckTally record = new TruckTally();		
		System.out.print("Trucks: ");
		record.readPreference("Trucks");
		System.out.println("\n");
		
	}
	
	public void reset() {
		
		System.out.println("***Collecting receipts***");
		displayData();
		
		//Wiping out TruckTally and TollTally databases
		TollTally toll = new TollTally();
		TruckTally record = new TruckTally();
		
		toll.removePreference("Total");
		record.removePreference("Trucks");
	}
	
	public void calculateToll(Truck make) {
		
		if (make instanceof Izuzu) {
			
//			System.out.println("Toll due: [Izuzu toll method in progress]");;
			Izuzu izuzu = (Izuzu)make;
			
			int axle_cost = izuzu.axles(num_axles) * 5;
		    double everySet = make.kilos / 453.592;
		    double h_tons = everySet * 0.5; //how many half tons in given kg number
		    int total_per_ton = ((int) Math.round(h_tons)) * 10; //per half-ton weight $
		    
//		    axles(axles);//print axles
//		    weight(kilos);//print weight in kg
		    
		    //toll tally updated after each truck
		    TollTally toll = new TollTally();
			toll.createPreference("Total", axle_cost + total_per_ton);
			toll.updatePreference("Total", axle_cost + total_per_ton);
			
			//Number of trucks updated after each truck
			TruckTally bypassers = new TruckTally();
			bypassers.createPreference("Trucks", 0);
			bypassers.updatePreference("Trucks");
		    
//			System.out.println("Toll due: " + (axle_cost + total_per_ton)); // add per half ton amount to per axle = toll
		}
		
		else if (make instanceof Susuki) {
			
			System.out.println("Toll due: [Susuki toll method in progress]");			
		}
		
		else {
			
			System.out.println("Toll due: [Truck toll method in progress]");
			
		}
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
