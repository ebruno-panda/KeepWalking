/**
 * 
 */
package org.howard.edu.lsp.exam.question42;

import java.util.HashMap;
import java.util.*;

/**
 * @author owner
 *
 */
public class SongsDatabase {
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();

		/* Add a song title to a genre */
	public void addSong(String genre, String songTitle) {
			//Code it!!
		Set<String> cds = new HashSet<String>();
		cds.add(new String(songTitle));
		map.put(genre, cds);
		
	}


	/* Return the Set that contains all songs for a genre */
	public Set<String> getSongs(String genre) {
			// Code it!!
		for (Map.Entry<String, Set<String>> songs : map.entrySet()) {
			
			if (songs.getKey() == genre) {
//				Set<String> answer = songs.getValue();
				return songs.getValue();
			}
			
		}
//		return null;
	}

	/* Return genre, i.e., jazz, given a song title */
	public String getGenreOfSong(String songTitle) {
			// Code it!!
	}
}

