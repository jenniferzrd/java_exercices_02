package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Granny;


public interface GrannyRepository extends CrudRepository<Granny, Long> {
	
}