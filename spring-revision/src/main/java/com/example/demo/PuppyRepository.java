package com.example.demo;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.Puppy;

public interface PuppyRepository extends CrudRepository<Puppy, Integer> {

}
