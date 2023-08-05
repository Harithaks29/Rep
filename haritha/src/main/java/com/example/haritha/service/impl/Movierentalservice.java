package com.example.haritha.service.impl;

import java.util.List;

import com.example.haritha.domain.Movie;

public interface Movierentalservice {
	

	    Movie saveMovie(Movie movie);

	    List<Movie>searchMovie(String keyword);

	}

