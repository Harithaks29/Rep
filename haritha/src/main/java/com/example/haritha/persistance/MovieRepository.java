package com.example.haritha.persistance;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.haritha.domain.Movie;
@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{
	
List<Movie>findAll();

Movie findById(int id);
Movie findByName(String name);
@SuppressWarnings("unchecked")
Movie save(Movie movie);
Movie deleteById(int id);
List<Movie> findAllByNameLike(String keyword);
}