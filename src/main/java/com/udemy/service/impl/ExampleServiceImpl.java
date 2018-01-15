package com.udemy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.udemy.model.Person;
import com.udemy.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

	@Override
	public List<Person> getListPeople() {
			List<Person> people = new ArrayList<>();
			people.add(new Person("jon", 21));
			people.add(new Person("mike", 31));
			people.add(new Person("jon", 22));
			people.add(new Person("gaby", 34));
			people.add(new Person("nico", 12));
			people.add(new Person("jose", 61));
			return people;
		}

}
