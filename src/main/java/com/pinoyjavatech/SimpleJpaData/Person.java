package com.pinoyjavatech.SimpleJpaData;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String address;
	
	public Person() {}

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public String name() {
		return this.name;
	}
	
	public String address() {
		return this.address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
