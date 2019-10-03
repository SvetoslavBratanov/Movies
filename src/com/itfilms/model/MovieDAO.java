package com.itfilms.model;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class MovieDAO {
	
	public Movie getMovieByTitle(String title) throws MovieException {
		HttpURLConnection connection = null;
		
		try {
			connection = (HttpURLConnection) new URL("http://www.omdbapi.com/?t="+title+"&apikey=BanMePlz").openConnection();
			connection.connect();
			
			if(connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
				
				BufferedInputStream bis = new BufferedInputStream(connection.getInputStream());
				byte[] bytes =new byte[connection.getContentLength()];
				bis.read(bytes);
				String json = new String(bytes,"UTF-8");
				System.out.println(json);
				
				JsonObject object = (JsonObject)new JsonParser().parse(json);
				String titleMovie = object.get("Title").getAsString();
				int year = object.get("Year").getAsInt();
				String genre = object.get("Genre").getAsString();
				String posterUrl = object.get("Poster").getAsString();
				
				return new Movie(titleMovie, year, genre, posterUrl);
			}
			
		} catch (IOException e) {
			throw new MovieException("No such movie", e);
		}
		return null;
		
	}

}
