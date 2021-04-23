/**
 * 
 */
package org.howard.edu.assignment7.tollbooth;


/**
 * @author owner
 *
 */
class Izuzu extends Truck{
	
	public void axles(int num_axles) {
		System.out.print("Truck arrival - Axles: " + num_axles + " | ");
		
	}
	
	public void weight(int kilos) {
		
		System.out.print("Total weight: " + kilos + " | ");
	}
	
	Izuzu(int axles, int kilos){
		
	    axles(axles);
	    weight(kilos);
	    
	  }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TollBooth booth = new NewRochelleTollBooth();
		Truck izuzu = new Izuzu(5, 12000);
		System.out.println(izuzu);
//		booth.calculateToll(izuzu);
//		booth.displayData();
		booth.reset();
		
		
				
		
		

	}

}