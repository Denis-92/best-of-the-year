package com.corsojava.springboot.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.corsojava.springboot.model.Movie;
import com.corsojava.springboot.model.Movies;
import com.corsojava.springboot.model.Song;
import com.corsojava.springboot.model.Songs;

@Controller
@RequestMapping("/")
public class TestController {
	
	private Songs bestSongs = new Songs();
	private Movies bestMovies = new Movies();
	
	@GetMapping("")		// gestisce le richieste di tipo GET del tipo /studenti/benvenuto
	public String benvenuto(Model model) {
		model.addAttribute("nome","Denis");
		return "index";
	}
	
	@GetMapping("/movies")
	public String getBestMoviesList(Model model) {
		List <Movie> moviesList = bestMovies.getMovies();
		model.addAttribute("movies", moviesList);
		return "movies";
	}
	
	@GetMapping("/movie/{id}")
	public String dettaglioMovie(Model model, @PathVariable("id") String id) {
		model.addAttribute("movie", bestMovies.getMovie(Integer.parseInt(id)));
		return "movie";
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
