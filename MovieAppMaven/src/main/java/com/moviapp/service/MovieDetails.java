package com.moviapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieDetails {
	
	public List<String> showMovies(String language){
		List<String> movies=null;
		if(language.equals("english")) {
			movies=(Arrays.asList("fast and furious","Iron man","joker"));
		}else if(language.equals("kannada")){
			movies=(Arrays.asList("kantar","bangaradha manushya ","om"));
		}else if(language.equals("hindi")) {
			movies= (Arrays.asList("drona","jawan","pathan"));
		}else if (language.equals("telugu")) {
			movies= (Arrays.asList("ega","eagle","dookudu"));
		}
		return movies;
	}

}
