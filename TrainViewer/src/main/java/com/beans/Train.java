package com.beans;

public class Train implements Bean {
	private int idTrain;
	private String matTrain;
	private String departure;
	private String arrival;
	
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
