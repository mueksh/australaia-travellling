package com.pham.austravelling.austravelling.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	
	@Transient
	public static final  String SEQUENCE_NAME="user_sequence"; 
	
	@Id
	private int id;
	private String placeName;
	private int guests;
	private String arrival;
	private String leaving;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public int getGuests() {
		return guests;
	}
	public void setGuests(int guests) {
		this.guests = guests;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getLeaving() {
		return leaving;
	}
	public void setLeaving(String leaving) {
		this.leaving = leaving;
	}
	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String placeName, int guests, String arrival, String leaving) {
		super();
		this.id = id;
		this.placeName = placeName;
		this.guests = guests;
		this.arrival = arrival;
		this.leaving = leaving;
	}
	
	

}
