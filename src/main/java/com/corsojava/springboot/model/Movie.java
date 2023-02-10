package com.corsojava.springboot.model;

public class Movie {
	
	private int id;
	private String titolo;
	
	public Movie(int id, String titolo) {
		this.id = id;
		this.titolo = titolo;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

}
