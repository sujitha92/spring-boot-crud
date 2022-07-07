package com.spring.springbootproject;

import java.net.URL;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class MarvelService {
	
	@Autowired
	MarvelRepository repository;
	
	public List<Marvel> getMarvelMovies(){
		
		List<Marvel> fetchMarvelMovies = fetchMarvelMovies();	
		repository.saveAll(fetchMarvelMovies);
		return fetchMarvelMovies;
		
	}
	
	@Transactional
	public void updateRating(int movieId, String name) {
		Optional<Marvel> marvel=repository.findById(movieId);
		marvel.get().setRating_name(name);
	}
	/*
	 * utility method to parse jaon frm url
	 */
	public static List<Marvel> fetchMarvelMovies() {
        ObjectMapper mapper = new ObjectMapper();
		try {
			URL url = new URL("https://subsequent-jealous-jersey.glitch.me/mcu.json");
			
			//mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
			
			MarvelRequest request = mapper.readValue(url,MarvelRequest.class);
			return request.getMarvels();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
    }
	

}
