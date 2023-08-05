package com.example.haritha.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.haritha.domain.Movie;

import com.example.haritha.persistance.MovieRepository;


public class Movierentalserviceimpl  implements Movierentalservice {
		@Autowired
		MovieRepository movierepository;
		 public Movie saveMovie(Movie movie) {
//			 if(movie.getId()!=null) {
			Optional <Movie> existingMovie=movierepository.findById(movie.getId());
			 if(existingMovie!=null) {
				 if(existingMovie.get()!=null) {
					 existingMovie.get().setId(movie.getId());
					 existingMovie.get().setName(movie.getName());
					 existingMovie.get().setImg(movie.getImg());
					 existingMovie.get().setType(movie.getType());
					 existingMovie.get().setLanguage(movie.getLanguage());
					 existingMovie.get().setPay(movie.getPay());
				 }
			 }
				 else {
					 movie=movierepository.save(movie);
				 }
				
//			 }
			return null;
		 }
		 public List<Movie> searchMovie(String keyword) {

		        if(keyword.isEmpty()) {

		            return movierepository.findAll();

		        }else {

		        return movierepository.findAllByNameLike("%" + keyword + "%");

		        }

		    }
	}
			 

