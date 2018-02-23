package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Club;
import com.example.demo.ClubRepository;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path="/club")

public class ClubController {

	@Autowired
	private ClubRepository clubs;
	
	@PostMapping()
	public @ResponseBody Club addNewClub (@RequestBody Map<String, Object>[] Club) {
		Club p = new Club();
		String name = Club[0].get("name").toString();
		String prenom = Club[0].get("prenom").toString();
				
		p.setName(name);
		p.setPrenom(prenom);
		
		clubs.save(p);
		return p;
		
	}
	
	@GetMapping()
	public @ResponseBody Iterable<Club> getAllClub() {
		return clubs.findAll();
	}
	
	@GetMapping(path="/{id}")
	public Club getClub(@PathVariable("id") Integer id) {
		return this.clubs.findOne(id);
	}
	
}
