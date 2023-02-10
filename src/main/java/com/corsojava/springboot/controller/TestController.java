package com.corsojava.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.corsojava.springboot.model.Movie;
import com.corsojava.springboot.model.Song;

@Controller
@RequestMapping("/")
public class TestController {
	
	private List<Movie> bestMovies;
	private List<Song> bestSongs;
	
	@GetMapping("")		// gestisce le richieste di tipo GET del tipo /studenti/benvenuto
	public String benvenuto(Model model) {
		model.addAttribute("nome","Denis");
		return "index";
	}
	
	private List<Movie> getBestMovies() {
		bestMovies = new ArrayList<>();
		bestMovies.add(new Movie(1, "The imitation game"));
		bestMovies.add(new Movie(2, "Il gladiatore"));
		return bestMovies;
	}
	
	private List<Song> getBestSongs() {
        bestSongs = new ArrayList<>();
        bestSongs.add(new Song(1, "RHCP: Can't stop"));
        bestSongs.add(new Song(2, "RHCP: Snow"));
        return bestSongs;
    }
	
	@GetMapping("/movies")
	public String getBestMoviesList(Model model) {
		bestMovies = getBestMovies();
		model.addAttribute("movies", bestMovies);
		return "movies";
	}
	
	@GetMapping("/songs")
	public String getBestSongsList(Model model) {
		bestSongs = getBestSongs();
		model.addAttribute("songs", bestSongs);
		return "songs";
	}

}
