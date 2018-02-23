package com.example.demo;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Granny;
import com.example.demo.GrannyRepository;

@Controller

@CrossOrigin (origins= "*")
@RequestMapping(path= "/grannys")

public class GrannyController {
	@Autowired

	private GrannyRepository grannyRepository;
	
	@PostMapping()
	public @ResponseBody Granny addNewGranny (@RequestBody Map<String, Object>[] gBody) {
		Granny g = new Granny();
		g.setName(name);
		g.setDescription(description);
		g.setImg(img);
		grannyRepository.save(g);
		return g;
	}
	
	}