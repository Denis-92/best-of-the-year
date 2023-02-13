package com.corsojava.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.corsojava.springboot.model.Movie;
import com.corsojava.springboot.model.Song;
import com.corsojava.springboot.model.Songs;

@Controller
@RequestMapping("/")
public class TestController {
	
	private List<Movie> bestMovies;
	private Songs bestSongs = new Songs();
	
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
	
	@GetMapping("/movies")
	public String getBestMoviesList(Model model) {
		bestMovies = getBestMovies();
		model.addAttribute("movies", bestMovies);
		return "movies";
	}
	
	@GetMapping("/songs")
	public String getBestSongsList(Model model) {
		List <Song> songsList = bestSongs.getSongs();
		model.addAttribute("songs", songsList);
		return "songs";
	}
	
	@GetMapping("/song/{id}")
	public String dettaglioSong(Model model, @PathVariable("id") String id) {
		model.addAttribute("song", bestSongs.getSong(Integer.parseInt(id)));
		return "song";
	}

}
