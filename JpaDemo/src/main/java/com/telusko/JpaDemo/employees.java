package com.telusko.JpaDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employees {
	
	@Id
	private int id;
	private int age;
	private String first;
	private String last;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", age=" + age + ", first=" + first + ", last=" + last + "]";
	}
	
	

}
