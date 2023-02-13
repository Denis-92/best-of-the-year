package com.corsojava.springboot.model;

import java.util.ArrayList;
import java.util.List;

public class Songs {
	private List <Song> bestSongs;
	
	public Songs() {
		bestSongs = new ArrayList<>();
        bestSongs.add(new Song(1, "RHCP: Can't stop"));
        bestSongs.add(new Song(2, "RHCP: Snow"));
	}
	
	public List<Song> getSongs() {
		return bestSongs;
	}
	
	public Song getSong(int id) {
		return bestSongs.get(id-1);
	}

}
