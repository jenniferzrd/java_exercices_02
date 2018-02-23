package hello;

import org.springframework.data.repository.CrudRepository;
import hello.Uzer;


public interface UzerRepository extends CrudRepository<Uzer, Long> {
	
}