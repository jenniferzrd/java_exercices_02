package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Puppy;
import com.example.demo.PuppyRepository;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path="/puppies")

public class MainController {

	@Autowired
	private PuppyRepository puppies;
	
	@PostMapping()
	public @ResponseBody Puppy addNewPuppy (@RequestBody Map<String, Object>[] puppy) {
		Puppy p = new Puppy();
		String name = puppy[0].get("name").toString();
		String breed = puppy[0].get("breed").toString();
		String picture = puppy[0].get("picture").toString();
		Boolean vaccinated = Boolean.valueOf(puppy[0].get("vaccinated").toString());
		
		p.setName(name);
		p.setBreed(breed);
		p.setPicture(picture);
		p.setVaccinated(vaccinated);
		
		puppies.save(p);
		return p;
	}
	

	@GetMapping()
	public @ResponseBody Iterable<Puppy> getAllPuppy() {
		return puppies.findAll();
	}
	
	@GetMapping(path="/{id}")
	public Puppy getPuppy(@PathVariable("id") Integer id) {
		return this.puppies.findOne(id);
	}
	
}
