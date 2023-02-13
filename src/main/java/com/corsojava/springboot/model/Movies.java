package com.corsojava.springboot.model;

import java.util.ArrayList;
import java.util.List;

public class Movies {
	private List <Movie> bestMovies;
	
	public Movies() {
		bestMovies = new ArrayList<>();
		bestMovies.add(new Movie(1, "The imitation game"));
		bestMovies.add(new Movie(2, "Il gladiatore"));
	}
	
	public List<Movie> getMovies() {
		return bestMovies;
	}
	
	public Movie getMovie(int id) {
		return bestMovies.get(id-1);
	}

}
