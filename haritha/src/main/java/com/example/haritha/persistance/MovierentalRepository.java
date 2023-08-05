package com.example.haritha.persistance;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.haritha.domain.Movierental;
@Repository

public interface MovierentalRepository extends JpaRepository<Movierental, Integer>  {
	List<Movierental> findAll();
	Movierental findById(int id);
	@SuppressWarnings("unchecked")
	Movierental save(Movierental movierental);
//	Movierental deleteById(Integer id);
}
