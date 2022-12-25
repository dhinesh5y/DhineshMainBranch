package org.j.encapsulation;

public class EncapsulationData {
	
	private int id;
	
	private String name;
	
	private long phone;
	
	// Right Click > Source > Generate Getters & Setters
	
	public int getId () {
		return id;
	}
	public void setId (int id) {
		this.id = id;
	}
	public String getName () {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	public long getPhone () {
		return phone;
	}
	public void setPhone (long phone) {
		this.phone = phone;
	}
}