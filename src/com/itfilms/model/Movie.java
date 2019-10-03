package com.itfilms.model;

public class Movie {
	
	private String title;
	private int year;
	private String genre;
	private String posterUrl;
	
	public Movie(String title, int year, String genre, String posterUrl) {
		super();
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.posterUrl = posterUrl;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPosterUrl() {
		return posterUrl;
	}
	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}

}
