package com.example.haritha.webrest;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.haritha.domain.Movie;
import com.example.haritha.persistance.MovieRepository;
@RestController("Movierestcontroller")
public class Movierestcontroller {
	@Autowired
	MovieRepository movierepository;
	@RequestMapping(value="Movie", method=RequestMethod.GET)
	@ResponseBody
	public List< Movie> findAll(){
		return movierepository.findAll();
	}
	@RequestMapping(value="Movie/{id}", method=RequestMethod.GET)
	@ResponseBody
	public  Movie findById(@PathVariable int id){
		return movierepository.findById( id);
	}
	
	@RequestMapping(value="Movie/Name/{name}", method=RequestMethod.GET)
	@ResponseBody
	public  Movie findByName(@PathVariable String name){
		return movierepository.findByName(name);
	}
	
	@RequestMapping(value="Movie", method=RequestMethod.POST)
	@ResponseBody
	public  Movie save(@RequestBody Movie movie){
		return movierepository.save(movie);
	}
	@RequestMapping(value="Movie", method=RequestMethod.PUT)
	@ResponseBody
	public  Movie update(@RequestBody Movie movie){
		return movierepository.save(movie);
	}
//	@RequestMapping(value="Movie/{id}", method=RequestMethod.DELETE)
//	@ResponseBody
//	public boolean deleteById(@PathVariable Integer id){
//		try {
//			 movierepository.deleteById(id);
//			 return true;
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//		return false;
//	}
		 
	@RequestMapping(value="Movie/{id}", method=RequestMethod.DELETE)
	@ResponseBody
	
	    public void deleteMovies(@PathVariable int id) {
	        movierepository.deleteById(id);
	    }
	
	@GetMapping("Movie/search/{keyword}")

    public List<Movie> searchDresses(@PathVariable String keyword) {

        if(keyword.isEmpty()) {

            return movierepository.findAll();

        }else {

        return movierepository.findAllByNameLike("%" + keyword + "%");

        }

    }
}
