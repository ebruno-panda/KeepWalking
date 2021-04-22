/**
 * 
 */
package org.howard.edu.lsp.exam.question40;

/**
 * @author owner
 *
 */
class Goose implements Animals, Flying{
	
	public void move() {
		System.out.println("This Goose moves forward.");
	}
	
	public void speak() {
		System.out.println("This Goose speaks.");
	}
	
	public void fly() {
		System.out.println("This Goose flies.");
	}

}
