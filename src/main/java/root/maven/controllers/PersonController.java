package root.maven.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import root.maven.models.Person;
import root.maven.models.PersonTO;
import root.maven.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping(
			method = RequestMethod.POST)
	public PersonTO postPerson(@RequestBody PersonTO personTO) {
		System.out.println(personTO);
		return personService.getPerson(personTO);
	}
	
	@RequestMapping
	public PersonTO getPerson() {
		return personService.getPerson();
	}
	
	@GetMapping("/{name}")
	public Person getByName(@PathVariable("name") String name) {
		return personService.getByName(name);
	}
	
	@PutMapping("/{name}")
	public Person update(@PathVariable("name") String name) {
		return personService.update(name);
	}
	
	@DeleteMapping("/{name}")
	public void delete(@PathVariable("name") String name) {
		personService.delete(name);
	}
}
