package com.spring.web.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Manager {

@Id
@GeneratedValue
private Long id;
private String name;
private Long salary;



public Manager() {
	super();
}
public Manager(String name, Long salary) {
	super();
	this.name = name;
	this.salary = salary;
}
public Long getId() {
	return id;
}
public String getName() {
	return name;
}
public Long getSalary() {
	return salary;
}
public void setId(Long id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setSalary(Long salary) {
	this.salary = salary;
}

}
