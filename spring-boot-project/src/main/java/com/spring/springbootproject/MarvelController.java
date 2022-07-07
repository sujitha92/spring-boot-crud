package com.spring.springbootproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/marvel")
public class MarvelController {
	
	@Autowired
	MarvelService service;
	
	@GetMapping
	public List<Marvel> getMarvelMovies(){
		List<Marvel> marvelMovies = service.getMarvelMovies();
		return marvelMovies;
		
	}
	
	@PutMapping
	public void updateRating(@RequestParam(required=true) int movieId,@RequestParam(required=true) String name) {
		service.updateRating(movieId,name);
	}

}
