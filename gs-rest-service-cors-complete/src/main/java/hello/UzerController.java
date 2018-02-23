package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// /post
import org.springframework.web.bind.annotation.GetMapping;
// /all --> /post/all
import org.springframework.web.bind.annotation.RequestParam;
// les controllers récup et gère (quand on a cliqué sur une page) les paramètres
import org.springframework.web.bind.annotation.ResponseBody;
// envoie la réponse au site qui a fait la requette
import org.springframework.web.bind.annotation.CrossOrigin;
// cela permet la communication entre front et back
import org.springframework.web.bind.annotation.*;

import hello.Uzer;
import hello.UzerRepository;

import java.util.ArrayList;
import java.util.List;

@Controller

@CrossOrigin (origins= "*")
//@RequestMapping(path= "/uzers")
//
//public class UzerController {
//	@Autowired
//	// genere auto les méthodes CRUD sur post
//	private UzerRepository uzerRepository;
//	
//	@GetMapping(path="/add")
//	public @ResponseBody String addNewUzer (@RequestParam String name) {
//		Uzer p = new Uzer();
//		p.setName(name);
//		uzerRepository.save(p);
//		return "Success";
//	}
//	
//	@GetMapping(path="/all")
//	public @ResponseBody Iterable<Uzer> getAllUzers() {
//		return uzerRepository.findAll();
//	}
//	}


@RestController
@RequestMapping(value = "/uzers")
public class UzerController {
 
	private List<Uzer> uzers = new ArrayList();
 
 
	UzerController() {
		this.uzers = buildUzers();
	}
 
	@RequestMapping(method = RequestMethod.GET)
	public List<Uzer> getUzers() {
		return this.uzers;
	}
 
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Uzer getUzer(@PathVariable("id") Long id) {
		return this.uzers.stream().filter(uzer -> uzer.getId() == id).findFirst().orElse(null);
	}
 
	@RequestMapping(method = RequestMethod.POST)
	public Uzer saveUzer(@RequestBody Uzer uzer) {
		int nextId = 0;
		if (this.uzers.size() != 0) {
			Uzer lastUzer = this.uzers.stream().skip(this.uzers.size() - 1).findFirst().orElse(null);
			nextId = (int) (lastUzer.getId() + 1);
		}
 
		uzer.setId(nextId);
		this.uzers.add(uzer);
		return uzer;
 
	}
 
	@RequestMapping(method = RequestMethod.PUT)
	public Uzer updateUzer(@RequestBody Uzer uzer) {
		Uzer modifiedUzer = this.uzers.stream().filter(u -> u.getId() == uzer.getId()).findFirst().orElse(null);
		modifiedUzer.setName(uzer.getName());
		return modifiedUzer;
	}
 
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public boolean deleteUzer(@PathVariable Long id) {
		Uzer deleteUzer = this.uzers.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
		if (deleteUzer != null) {
			this.uzers.remove(deleteUzer);
			return true;
		} else  {
			return false;
		}
 
 
	}
 
	List<Uzer> buildUzers() {
		List<Uzer> uzers = new ArrayList<>();
 
		Uzer user1 = buildUzer(1,"John");
		Uzer user2 = buildUzer(2,"Jon");
		Uzer user3 = buildUzer(3,"Will");
 
		uzers.add(user1);
		uzers.add(user2);
		uzers.add(user3);
 
		return uzers;
 
	}
 
	Uzer buildUzer(int id, String fname) {
		Uzer uzer = new Uzer();
		uzer.setId(id);
		uzer.setName(fname);
		return uzer;
	}
	
}