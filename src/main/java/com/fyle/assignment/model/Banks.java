package com.fyle.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="banks")
public class Banks {
	public Banks()
	{
		
	}
	public Banks(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Banks [id=" + id + ", name=" + name + "]";
	}
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private  String name ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
