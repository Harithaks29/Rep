package com.example.haritha.webrest;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.haritha.domain.Movierental;
import com.example.haritha.persistance.MovierentalRepository;

@RestController("Movierentalrestcontroller")

public class Movierentalrestcontroller {
	@Autowired
	MovierentalRepository movierentalrepository;
	@RequestMapping(value="Movierental", method=RequestMethod.GET)
	@ResponseBody
	public List<Movierental> findAll(){
		return movierentalrepository.findAll();
	}
	@RequestMapping(value="Movierental/{id}", method=RequestMethod.GET)
	@ResponseBody
	public  Movierental findById(@PathVariable int id){
		return movierentalrepository.findById( id);
	}
	@RequestMapping(value="Movierental", method=RequestMethod.POST)
	@ResponseBody
	public  Movierental save(@RequestBody Movierental movierental){
		return movierentalrepository.save(movierental);
	}
	@RequestMapping(value="Movierental/{id}", method=RequestMethod.DELETE)
	@ResponseBody
	public  void deleteById(@PathVariable int id){
		 movierentalrepository.deleteById(id);
	}

}
