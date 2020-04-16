package com.pinoyjavatech.SimpleJpaData;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long>{

	List<Person> findPersonByName(String name);
	
	Person findPersonById(Long id);
	
	default List<Person> getAllPersons() {
		List<Person> persons
		 = new ArrayList<Person>();
		findAll().forEach( p -> {
			persons.add(p);
		});
		return persons;
	}
}
