/**
 * 
 */
package org.howard.edu.lsp.exam.question40;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author owner
 *
 */
public class JUnitTests {
	
	
	/*Tiger methods tested*/
	@Test
	@DisplayName("Test cases for Tiger")
	public void Tiger() {
		
		//Tiger named Shere Khan (from the movie Jungle Book)
		Tiger sherekhan = new Tiger();
		sherekhan.move(); //Tiger moves
		sherekhan.speak(); //Tiger speaks
	}
	
	
	/*Goose methods tested*/
	@Test
	@DisplayName("Test cases for Goose")
	public void Goose() {
		
		//Tiger named Boris (from the movie Balto)
		Goose boris = new Goose();
		boris.move(); //Goose moves
		boris.speak(); //Goose speaks
		boris.fly(); //Goose flies		
	}
	
	
	/*Airplane methods tested*/
	@Test
	@DisplayName("Test cases for Airplane")
	public void Airplane() {
		
		//Airplane named Dusty (from the movie Planes)
		Airplane dusty = new Airplane();
		dusty.fly(); //Airplane flies		
	}
	
	
	/*OtherAnimal methods tested*/
	@Test
	@DisplayName("Test cases for OtherAnimal")
	public void OtherAnimal() {
		
		//Some OtherAnimal named Oscar (from the movie SharkTale)
		OtherAnimal oscar = new OtherAnimal();
		oscar.move(); //OtherAnimal moves
		oscar.speak(); //OtherAnimal speaks
	}

}
