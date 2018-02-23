package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Club;
import com.example.demo.ClubRepository;


@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path="/club")

public class ClubController {

	@Autowired
	private ClubRepository clubs;

	
	@PostMapping()
	public @ResponseBody Club addNewClub (@RequestBody Map<String, Object>[] club) {
		Club p = new Club();
		String nom = club[0].get("nom").toString();
		String prenom = club[0].get("prenom").toString();
		String niveau = club[0].get("niveau").toString();
		String photo = club[0].get("photo").toString();
		
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setPhoto(photo);
		p.setNiveau(niveau);
		
		clubs.save(p);
		return p;
	}
	
	@GetMapping()
	public @ResponseBody Iterable<Club> getAllClub() {
		return clubs.findAll();
	}
	
	@GetMapping(path="/{id}")
	public Club getPuppy(@PathVariable("id") Integer id) {
		return this.clubs.findOne(id);
	}
	
}
