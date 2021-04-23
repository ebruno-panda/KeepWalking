/**
 * 
 */
package org.howard.edu.assignment7.tollbooth;

/**
 * @author owner
 *
 */
class Susuki extends Truck{
	
	public void axles(int num_axles) {
		System.out.print("Truck arrival - Axles: " + num_axles + " | ");
		
	}
	
	public void weight(int kilos) {
		
		System.out.print("Total weight: " + kilos + " | ");
	}
	
	Susuki(int axles, int kilos){

		int axle_cost = axles * 5;
	    double everySet = kilos / 453.592;
	    double h_tons = everySet * 0.5; //how many half tons in given kg number
	    int total_per_ton = ((int) Math.round(h_tons)) * 10; //per half-ton weight $
	    axles(axles);//print axles
	    weight(kilos);//print weight in kg
	    
	    //toll tally updated after each truck
	    TollTally toll = new TollTally();
		toll.createPreference("Total", axle_cost + total_per_ton);
		toll.updatePreference("Total", axle_cost + total_per_ton);
		
		//Number of trucks updated after each truck
		TruckTally bypassers = new TruckTally();
		bypassers.createPreference("Trucks", 0);
		bypassers.updatePreference("Trucks");
	    
//	    System.out.println("Toll due: " + (axle_cost + total_per_ton)); // add per half ton amount to per axle = toll
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TollBooth booth = new NewRochelleTollBooth();		
		Truck susuki = new Susuki(5, 12000);
		
		booth.calculateToll(susuki);
//		booth.reset();
//		booth.displayData();
	}

}
