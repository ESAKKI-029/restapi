package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Moviemodel")
public class MovieModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;
	@Column(name="Moviename")
	private String MovieName;
	private String title;
	private String director;
	private String actors;
	public int getMovieId() {
		return movieId;
	}
	public void setMovielId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String MovieName) {
		this.MovieName = MovieName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
}
	