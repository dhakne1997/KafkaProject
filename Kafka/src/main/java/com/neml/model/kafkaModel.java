package com.neml.model;

import java.io.Serializable;

public class kafkaModel implements Serializable{
	
	private String firstname;
	private String lastname;
	private String address;
	private int age;

	
	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstname) {
		this. firstname =  firstname;
	}
	public String getlastname() {
		return  lastname;
	}
	public void setlastname(String  lastname) {
		this. lastname =  lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "kafkaModel [  firstname=" +  firstname + ",  lastname=" +  lastname
				+ ", address=" + address + ", age=" + age + "]";
	}
	
	

}
