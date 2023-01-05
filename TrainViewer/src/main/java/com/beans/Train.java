package com.beans;

import java.util.Date;

public class Train implements Bean {
	private int idTrain;
	private String matTrain;
	private String departure;
	private String arrival;
	private Date hour;
	private int factory;
	
	public int getFactory() {
		return factory;
	}
	public void setFactory(int factory) {
		this.factory = factory;
	}
	public Date getHour() {
		return hour;
	}
	public void setHour(Date hour) {
		this.hour = hour;
	}
	public int getIdTrain() {
		return idTrain;
	}
	public void setIdTrain(int idTrain) {
		this.idTrain = idTrain;
	}
	public String getMatTrain() {
		return matTrain;
	}
	public void setMatTrain(String matTrain) {
		this.matTrain = matTrain;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
}
