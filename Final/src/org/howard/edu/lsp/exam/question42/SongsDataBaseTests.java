/**
 * 
 */
package org.howard.edu.lsp.exam.question42;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author owner
 *
 */
public class SongsDataBaseTests {
	
	/*addSong method tested*/
	@Test
	@DisplayName("Test cases for addSong")
	public void addSong() {
		
		//Adding songs to set
		SongsDatabase db = new SongsDatabase();
		db.addSong("Pop", "Play It Again"); //adding song
		db.addSong("Pop", "Shooting Star"); //adding song		
		db.addSong("Rap", "DNA"); //adding song
		db.addSong("Rap", "Savage"); //adding song
		
	}
	
	
	
	/*getSongs method tested*/
	@Test
	@DisplayName("Test cases for getSongs")
	public void getSongs() {
		
		//Adding songs to set
		SongsDatabase db = new SongsDatabase();
		db.getSongs("Pop"); //getting song
		db.getSongs("Rap"); //getting song		
		
	}
	
	
	
	/*getGenreOfSong method tested*/
	@Test
	@DisplayName("Test cases for getGenreOfSong")
	public void getGenreOfSong() {
		
		//Adding songs to set
		SongsDatabase db = new SongsDatabase();
		db.getGenreOfSong("Shooting Star"); //getting song genre
		db.getGenreOfSong("DNA"); //getting song genre		
		
	}
	
	

}
