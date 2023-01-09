package com.dao;

import java.util.Date;

import com.beans.Train;

public interface TrainDao {
	
	public void create(Train t);
	public Train getId(String idTrain);
	public Train getMat(String matTrain);
	public Train getDep(String departure);
	public Train getArr(String arrival);
	public Train getHour(Date hour);
	public Train getFactory(int factory);
	

}
