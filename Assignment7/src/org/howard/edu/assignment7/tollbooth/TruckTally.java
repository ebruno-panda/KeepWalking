package org.howard.edu.assignment7.tollbooth;

import java.util.prefs.Preferences;

public class TruckTally {

	//Type "Trucks" for variable "name" for and key convenience
	public void createPreference(String name, int value) {
	    Preferences prefs = Preferences.userNodeForPackage(TruckTally.class);
	    if (prefs.getInt(name, -1) == -1) {
	        prefs.putInt(name, value);
	        if(value == 0) {
	        	System.out.print("");
	        }
	        else {
//	        	System.out.println(value);
	        }
	        
	    } else {
	        System.out.print("");
	    }
	}
	
	public void readPreference(String name) {
	    Preferences prefs = Preferences.userNodeForPackage(TruckTally.class);
	    System.out.print(prefs.getInt(name, -1));
	}
	
	public void updatePreference(String name) {
	    Preferences prefs = Preferences.userNodeForPackage(TruckTally.class);
	    int val = prefs.getInt(name, -1);
	    if (val != -1) {
	        val++;
	        prefs.remove(name);
	        prefs.putInt(name, val);
//	        System.out.print(prefs.getInt(name, -1) + "\n");
	    }
	}
	
	public void removePreference(String key) {
	    Preferences prefs = Preferences.userNodeForPackage(TruckTally.class);
	    if(prefs.getInt(key, -1) != -1){
	        prefs.remove(key);
	        System.out.println("Removed: "+ key + " data base");
	    }else{
	        System.out.println("No Such Data in: "+key);
	    }
	}
	
}
