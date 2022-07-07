package com.spring.springbootproject;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "Marvel Cinematic Universe") 
public class MarvelRequest {

	@JsonProperty(value="Marvel Cinematic Universe")
	private List<Marvel> marvels;

	public List<Marvel> getMarvels() {
		return marvels;
	}

	public void setMarvels(List<Marvel> marvels) {
		this.marvels = marvels;
	}
	
	

}
