package root.maven.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import root.maven.models.Person;
import root.maven.models.PersonTO;
import root.maven.repositories.PersonRepo;

@Service
public class PersonService {
	
	private List<PersonTO> list = new ArrayList<>();
	
	@Autowired
	private PersonRepo personRepo;
	
	public PersonTO getPerson() {
		PersonTO p = new PersonTO("id1", "name1" , "age1");
		return p;
	}
	
	public PersonTO getPerson(PersonTO personTO) {
		list.add(personTO);
		System.out.println(list);
		return personTO;
	}
	
	public Person getByName(String name) {
		return personRepo.getByName(name);
	}
	
	public Person update(String name) {
		return personRepo.update(name);
	}
	
	public void delete(String name) {
		personRepo.delete(name);
	}
}
