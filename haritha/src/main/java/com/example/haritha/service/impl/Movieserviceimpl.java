package com.example.haritha.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.haritha.domain.Movierental;

import com.example.haritha.persistance.MovierentalRepository;

public class Movieserviceimpl implements Movieservice {
	@Autowired
	MovierentalRepository movierentalrepository;
	
	 public Optional <Movierental> saveMovierental(Movierental movierental) {
//		 
		 
		Optional <Movierental> existingMovierental=Optional.of(movierentalrepository.findById(movierental.getId()));
		 
		 if(existingMovierental!=null) {
			 if(existingMovierental.get()!=null) {
				 existingMovierental.get().setId(movierental.getId());
				 
				 existingMovierental.get().setUsername(movierental.getUsername());
				 existingMovierental.get().setMovie(movierental.getMovie());
			 }
		 }
			 else {
				 movierental=movierentalrepository.save(movierental);
			 }
		 
			 return null;
		 }
	 }

		 
	 
	


